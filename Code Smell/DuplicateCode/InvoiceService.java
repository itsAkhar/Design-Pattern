package DuplicateCode;

public class InvoiceService {
    public void printInvoice(Order order) {
        double total=Calculator.calculateTotalWithTax(order);
        System.out.println("Invoice Total: " + total);
    }
}
