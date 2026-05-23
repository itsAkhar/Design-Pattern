package ShotgunSurgery;

import java.util.List;

public class Order {
    private String customerName;
    private List<Item> items;

    public Order(String customerName, List<Item> items) {
        this.customerName = customerName;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Item> getItems() {
        return items;
    }
}
class OrderValidator{
    public void validateOrder(Order order) {
        // Order validation logic
        System.out.println("Validating order....");
        if(order.getItems().size()==0) System.out.println("Please make order first");
    }
}
class PaymentProcessor{
    public void processPayment(Order order) {
        // Payment processing logic
        System.out.println("Processing payment for "+order.getCustomerName());
    }
}
class ShippingHandler{
    public void shipOrder(Order order) {
        // Shipping logic
        System.out.println("Shipping order to Mr."+order.getCustomerName() +" for ordering "+order.getItems().size()+" items");
    }
}