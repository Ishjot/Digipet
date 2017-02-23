public class Dog extends Pet {
    public Dog(String name) {
	super(name, 2, "");
    }
    public void eat(Food food) {
	if (food instanceof DogFood) {
	    super.eat(food, true);
	}
	else
	    super.eat(food, false);
    }
}
