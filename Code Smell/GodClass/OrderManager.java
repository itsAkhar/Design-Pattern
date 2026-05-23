package GodClass;
import java.util.ArrayList;

public class OrderManager {

    private ArrayList<Order> orders;
    private ShippingDetails shippingAddress;
    private PaymentDetails paymentDetails;
    private ArrayList<Item> items;

    public void createOrder(Order order) {
        orders.add(order);
    }

    PaymentProcessor paymentProcessor=new PaymentProcessor();
    ShippingService shippingService=new ShippingService();
    EmailService emailService=new EmailService();
    InvoiceCalculator invoiceCalculator=new InvoiceCalculator();

    public void ProcessFullOrder(Order order){
        paymentProcessor.processPayment(order);
        shippingService.shipOrder(order);
        emailService.sendConfirmationEmail(order);
        invoiceCalculator.calculateInvoice(order);
    }
}
class PaymentProcessor{
    public void processPayment(Order order) {
        // Payment processing logic
    }
}
class ShippingService{
    public void shipOrder(Order order) {
        // Shipping logic
    }
}
class EmailService{
    public void sendConfirmationEmail(Order order) {
        // Email logic
    }
}
class InvoiceCalculator{
    public void calculateInvoice(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        System.out.println("Total for Order: " + total);
    }
}