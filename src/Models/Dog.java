public class Dog extends Pet {
	/**
	 * Default Constructor. Create a new Dog (subclase of Pet)
	 */
	public Dog(String name) {
		super(name, "");
	}

	/**
	 * Override of Pet's eat method, possibly useless.
	 * 
	 * @param food
	 *            the item being fed to the Dog
	 */
	public void eat(Food food) {
		eat(food, false);
	}
}
