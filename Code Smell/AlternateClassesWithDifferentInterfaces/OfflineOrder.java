package AlternateClassesWithDifferentInterfaces;

public class OfflineOrder extends Order{
    public void processPayment(double amount) {
        // Offline payment processing
        System.out.println("Processing offline payment of amount: " + amount);
    }
}