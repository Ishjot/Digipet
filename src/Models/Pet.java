public abstract class Pet {

	/**
	 * Default Constructor for creating a new pet.
	 * 
	 * 
	 * @param name
	 *            pet's name
	 * @param picture
	 *            file location for pet's picture
	 */
	public Pet(String name, String picture) {
		this.name = name;
		age = 1;
		maxStat = 100;
		this.percentDecrease = 1;
		hunger = maxStat;
		this.picture = picture;
	}

	/**
	 * @return name of pet
	 */
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	/**
	 * Increases the age of pet when called, which will update all of pet's
	 * attributes accordingly.
	 */
	public void updateAge() {
		age++;
		maxStat += 10;
		hunger += (int) ((hunger + 0.5 * maxStat) % 100);
		setHunger(hunger + (int) ((hunger + 0.5 * maxStat) % 100));
		percentDecrease += 2;
	}

	/**
	 * @return the maximum value a pet's attribute can have
	 */
	public int getMaxStat() {
		return maxStat;
	}

	/**
	 * @return current hunger status
	 */
	public int getHunger() {
		return hunger;
	}

	/**
	 * @param hunger
	 *            hunger to set
	 */
	public void setHunger(int hunger) {
		this.hunger = (hunger <= maxStat) ? hunger : maxStat;
	}

	/**
	 * lowers the hunger status
	 */
	public void updateHunger() {
		hunger = hunger - percentDecrease * maxStat / 100;
	}

	public abstract void eat(Food food);

	/**
	 * Eatting function, increase hunger level base on how much the food will
	 * "feed up" the pet
	 */
	public void eat(Food food, boolean trigger) {
		if (hunger < maxStat) {
			hunger = (trigger) ? (hunger + food.getBase() * 2 + food.getPercent() * maxStat / 100)
					: (hunger = hunger + food.getBase() + food.getPercent() * maxStat / 100);
		}
	}

	/**
	 * @return string location of pet's picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture
	 *            picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	// private vars
	private String name;
	private int age;
	private int maxStat;
	private int percentDecrease;
	private int hunger;
	private String picture;

}
