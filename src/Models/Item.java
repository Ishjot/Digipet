public abstract class Item {

	/**
	 * Default Constructor.
	 * 
	 * @param name
	 *            item name
	 * @param price
	 *            item price
	 * @param picture
	 *            item picture location (string)
	 */
	public Item(String name, int price, String picture) {
		this.name = name;
		this.price = price;
		this.picture = picture;
	}

	/**
	 * @return item name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return item price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return item picture location (string)
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture
	 *            picture location to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	// private vars
	private String name;
	private int price;
	private String picture;
}
