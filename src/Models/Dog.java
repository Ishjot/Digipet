public class Dog extends Pet {
    public Dog(String name) {
	super(name, 2, "");
    }
    public void eat(Food food) {
	eat(food, false);
	/*
	if (food instanceof DogFood) {
	    eat(food, true);
	}
	else
	    eat(food, false);
	*/
    }
}
