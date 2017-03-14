public abstract class Food extends Item {

	/**
	 * Default constructor. Sets name, price, base value, percent value, and
	 * picture location of Food. Uses Item's constructor to set name, price and
	 * picture
	 * 
	 * @param base
	 *            base "healing" value
	 * @param percent
	 *            the item's relative "healing" value interms of pet's maximum
	 *            hunger value
	 */
	public Food(String name, int price, int base, int percent, String picture) {
		super(name, price, picture);
		this.base = base;
		this.percent = percent;
	}

	/**
	 * @return the base "healing" value of the food
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base
	 *            base value to set to
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return relative "healing" value of the food
	 */
	public int getPercent() {
		return percent;
	}

	/**
	 * @param percent
	 *            percent value to set to
	 */
	public void setPercent(int percent) {
		this.percent = percent;
	}

	// private vars
	private int base;
	private int percent;
}
