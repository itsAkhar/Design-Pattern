package Comments;
public class OrderProcessor {

    public void processOrder(Order order) {
        OrderValidator validator=new OrderValidator();
        Printer printer=new Printer();

        if(!validator.validateOrder(order))return;
        double total=Payment.calculator(order);
        double tax=TaxApply.taxCalculate(total);
        printer.printReceipt(total,tax);
    }
}
class OrderValidator{
    public boolean validateOrder(Order order){
        if (order.getItems().size() == 0) {
            System.out.println("Order is empty");
            return false;
        }
        return true;
    }
}
class Payment{
    public static double calculator(Order order){
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}
class TaxApply{
    public static double taxCalculate(double total){
        return total*0.2;
    }
}
class Printer{
    public void printReceipt(double total,double tax){
        System.out.println("Total with tax: " + (total + tax));
    }
}