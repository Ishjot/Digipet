public class Cat extends Pet {
    public Cat(String name) {
	super(name, "");
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
