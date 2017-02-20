public class Cat extends Pet {
    //private int lives;
    public Cat(String value) {
	super(value);
	//health = 10;
	//lives = 9;
    }
    /*
    public void loseLife() {
	lives--;
	health = 10;
	mood = maxStat;
	hunger = maxStat;
	cleanliness = maxStat;
    }
    public void updateHealth() {
	if (checkHealthy()) {
	    health++;
	    if (health > 20)
		health = 20;
	}
	else
	    health = health - 0.5 * disease.size();
    }
    */
}
