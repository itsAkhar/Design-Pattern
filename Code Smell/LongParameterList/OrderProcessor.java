package LongParameterList;

public class OrderProcessor {

    public void processOrder(Customer customer,
                             Product productDetails,
                             ShippingDetails shippingDetails) {
        // Order processing logic
    }
}
class Customer{
    private String customerName;
    private String customerAddress;
    private String customerPhone;

    public Customer(String customerName, String customerAddress, String customerPhone) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
}
class Product{
    private String productName;
    private int quantity;
    private double price;
    private double discount;

    public Product(String productName, int quantity, double price, double discount) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
}
class ShippingDetails{
    private String paymentMethod;
    private String shippingMethod;

    public ShippingDetails(String paymentMethod, String shippingMethod) {
        this.paymentMethod = paymentMethod;
        this.shippingMethod = shippingMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }
}