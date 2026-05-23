package AlternateClassesWithDifferentInterfaces;

public abstract class  Order {
    protected String customerName;
    protected String orderDetails;

    public abstract void processPayment(double amount);
}
