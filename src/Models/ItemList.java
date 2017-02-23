import java.util.ArrayList;

public class ItemList {
    private ArrayList<Item> items = new ArrayList<Item>();
    public ItemList() {
	items.add(0, new Biscuit());
	items.add(new Salmon());
    }
    public Item getItem(int i) {
	return items.get(i);
    }
    public int getSize() {
	return items.size();
    }
}
