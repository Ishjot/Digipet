import java.util.ArrayList;

public class ItemsList {
    private ArrayList<Item> items = new ArrayList<Item>();
    public ItemsList() {
	items.add(0, new Biscuit());
	items.add(new Fish());
    }
    public Item getItem(int i) {
	return items.get(i);
    }
    public int getSize() {
	return items.size();
    }
}
