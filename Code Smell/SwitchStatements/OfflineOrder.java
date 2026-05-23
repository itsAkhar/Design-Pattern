package SwitchStatements;

public class OfflineOrder implements Order{
    @Override
    public void processOrder() {
        System.out.println("Processing offline order");
    }
}
