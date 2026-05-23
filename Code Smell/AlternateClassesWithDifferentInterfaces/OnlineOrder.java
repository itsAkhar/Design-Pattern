package AlternateClassesWithDifferentInterfaces;

public class OnlineOrder extends Order{
    public void processPayment(double amount) {
        // Online payment processing
        System.out.println("Processing online payment of amount: " + amount);
    }
}