package DuplicateCode;

public class Calculator {

    public static double calculateTotalWithTax(Order order){
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total*0.2; // applying tax
    }
}
