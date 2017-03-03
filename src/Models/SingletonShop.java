public class SingletonShop {
    private static Shop shop = null;
    private SingletonShop() { }
    public static Shop getShop() {
	if (shop == null)
	    shop = new Shop();
	return shop;
    }
}
