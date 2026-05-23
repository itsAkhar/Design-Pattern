package SwitchStatements;

public class OnlineOrder implements Order{
    @Override
    public void processOrder() {
        System.out.println("Processing online order");
    }
}
