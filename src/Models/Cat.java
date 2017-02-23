public class Cat extends Pet {
    public Cat(String name) {
	super(name, 2, "");
    }
    public void eat(Food food) {
	if (food instanceof CatFood) {
	    super.eat(food, true);
	}
	else
	    super.eat(food, false);
    }
}
