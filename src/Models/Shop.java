import java.util.ArrayList;

public class Shop {
	private ArrayList<Item> items = new ArrayList<Item>();
	private ItemList itemList = new ItemList();

	// shop contains 20 items. first item is biscuit and it never disappears
	// from shop. other 19 items are randomized and limited. the other 19 do not
	// have to be unique. For now, they are all fish because we do not have many
	// unique items.
	public void refreshShop() {
		items.clear();
		items.add(0, itemList.getItem(0));
		for (int i = 0; i < 19; i++) {
			addRandItem();
		}
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	/**
	 * Randomly chooses an item, and add it to the item list.
	 */
	public void addRandItem() {
		int randNum = (int) (Math.random() * (itemList.getSize() - 1)) + 1;
		items.add(itemList.getItem(randNum));
	}
	
	
	public Item sellItem(int i) {
		if (i == 0) {
			return items.get(0);
		} else
			return items.remove(i);
	}

	public int getSize() {
		return items.size();
	}
}
