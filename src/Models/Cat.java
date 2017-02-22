public class Cat extends Pet {
    //private int lives;
    public Cat(String name, String picture) {
	super(name, picture);
	//health = 8;
	//lives = 9;
    }
    /*
    public void loseLife() {
	lives--;
	health = 8;
	mood = maxStat;
	hunger = maxStat;
	cleanliness = maxStat;
    }
    public void updateHealth() {
	if (checkHealthy()) {
	    health++;
	    if (health > 8)
		health = 8;
	}
	else
	    health = health - 0.5 * disease.size();
    }
    public void eat(Food food) {
	if (food instanceof CatFood) {
	    hunger = hunger + food.base * 1.5 + food.percent * maxStat / 100.0;
	    if (hunger > maxStat)
		hunger = maxStat;
	}
	else
	    super.eat(food);
    }
    */
}
