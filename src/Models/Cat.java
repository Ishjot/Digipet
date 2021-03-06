public class Cat extends Pet {
	/**
	 * Default Constructor. Create a new Cat (subclase of Pet)
	 */
	public Cat(String name) {
		super(name, "");
	}

	/**
	 * Override of Pet's eat method, possibly useless.
	 * 
	 * @param food
	 *            the item being fed to the Cat
	 */
	public void eat(Food food) {
		eat(food, false);
	}
}
