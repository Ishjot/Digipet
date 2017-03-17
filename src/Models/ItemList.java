import java.util.ArrayList;

public class ItemList {

	/**
	 * Default Constructor. Creates a ItemList containing a biscut and salmon.
	 */
	public ItemList() {
		items.add(0, new Biscuit());
		items.add(new Salmon());
	}

	/**
	 * @return the ith item on the list
	 */
	public Item getItem(int i) {
		return items.get(i);
	}

	/**
	 * @return the size of the list
	 */
	public int getSize() {
		return items.size();
	}

	// private vars
	private ArrayList<Item> items = new ArrayList<Item>();

}
