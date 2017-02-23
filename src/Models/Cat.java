public class Cat extends Pet {
    public Cat(String name) {
	super(name, 2, "");
    }
    public void eat(Food food) {
	eat(food, false);
	/*
	if (food instanceof CatFood) {
	    eat(food, true);
	}
	else
	    eat(food, false);
	*/
    }
}
