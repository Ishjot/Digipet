public class Dog extends Pet {
    public Dog(String name, String picture) {
	super(name, picture);
    }
    /*
    public void eat(Food food) {
	if (food instanceof DogFood) {
	    hunger = hunger + food.base * 1.5 + food.percent * maxStat / 100.0;
	    if (hunger > maxStat)
		hunger = maxStat;
	}
	else
	    super.eat(food);
    }
    */
}
