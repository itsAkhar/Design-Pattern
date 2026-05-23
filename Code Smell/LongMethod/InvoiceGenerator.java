package LongMethod;

public class InvoiceGenerator {

    public void generateInvoice(Order order) {
        double total = gettingTotal(order);

        double discount = gettingDiscount(total);
        double tax = gettingTax(total);
        double finalAmount = total - discount + tax;

        System.out.println("Invoice for Order ID: " + order.getId());
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Amount: " + finalAmount);
    }
    private double gettingTotal(Order order){
        double total=0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
    private double gettingDiscount(double total){
        return total*0.1;
    }
    private double gettingTax(double total){
        return total*0.2;
    }
}
