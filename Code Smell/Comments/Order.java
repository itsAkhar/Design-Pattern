package Comments;

import java.util.ArrayList;

public class Order {
    private String id;
    private ArrayList<Item> items=new ArrayList<>();

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public String getId() {
        return id;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
