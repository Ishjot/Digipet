public class ItemsList {
    private ArrayList<Item> items = new ArrayList<Item>();
    public ItemsList() {
	items.add(0, new Biscuit());
	items.add(new Fish());
    }
    public int getSize() {
	return items.size();
    }
}
