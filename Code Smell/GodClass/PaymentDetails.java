package GodClass;

class PaymentDetails {
    private String productName;
    private int quantity;
    private double price;
    private double discount;

    public PaymentDetails(String productName, int quantity, double price, double discount) {
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
