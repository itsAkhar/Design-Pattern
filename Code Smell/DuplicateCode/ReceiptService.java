package DuplicateCode;

public class ReceiptService {
    public void printReceipt(Order order) {
        double total=Calculator.calculateTotalWithTax(order);
        System.out.println("Receipt Total: " + total);
    }
}
