import java.util.ArrayList;

public class Shop {
    private ArrayList<Item> items = new ArrayList<Item>();
    // shop contains 20 items. first item is biscuit and it never disappears from shop. other 19 items are randomized and limited. the other 19 do not have to be unique. For now, they are all fish because we do not have many unique items.
    public void refreshShop() {
	items.clear();
	items.add(0, new Biscuit());
	for (int i = 0; i < 19; i++) {
	    addRandItem();
	}
    }
    public ArrayList<Item> getItems() {
	return items;
    }
    public void addRandItem() {
	ItemsList myList = new ItemsList();
	int randNum = (int) (Math.random() * (myList.getSize() - 1)) + 1;
	items.add(myList.getItem(randNum));
    }
    public Item deleteItem(int i) {
	if (i == 0) {
	    return items.get(0);
	}
	else
	    return items.remove(i);
    }
    public int getSize() {
	return items.size();
    }
}
