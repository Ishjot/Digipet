//import java.util.Arraylist;

public abstract class Pet {
    private String name;
    private int age;
    private int maxStat;
    private int percentDecrease;
    //private double health;
    //private double mood;
    //Toy toy1;
    //Toy toy2;
    //private int toyBase;
    private int hunger;
    //private double cleanliness;
    //private int diseaseTimer;
    //private int diseaseGap;
    //private ArrayList<String> diseases;
    private String picture;
    //public Pet(String name, int percentDecrease, double health, int diseaseGap, String picture) {
    public Pet(String name, int percentDecrease, String picture) {
	this.name = name;
	age = 0;
	maxStat = 100;
	this.percentDecrease = percentDecrease;
	//this.health = health;
	//mood = maxStat;
	//toyBase = 1;
	hunger = maxStat;
	//cleanliness = maxStat;
	//diseaseTimer = 1;
	//this.diseaseGap = diseaseGap;
	this.picture = picture;
    }
    public String getName() {
	return name;
    }
    public int getAge() {
	return age;
    }
    public void updateAge() {
	age++;
	maxStat += 10;
	//mood += 10;
	hunger += 10;
	//cleanliness += 10;
    }
    public int getMaxStat() {
	return maxStat;
    }
    /*
    public void updateStats() {
	updateHealth();
	updateMood();
	updateHunger();
	updateCleanliness();
    }
    public double getHealth() {
	return health;
    }
    public void setHealth(int health) {
	this.health = health;
    }
    public boolean checkHealthy() {
	boolean value = true;
	double bar = 0.8 * maxStat;
	if (mood < bar)
	    value = false;
	if (hunger < bar)
	    value = false;
	if (cleanliness < bar)
	    value = false;
	if (!diseases.isEmpty())
	    value = false;
	return value;
    }
    public void updateHealth() {
	if (checkHealthy()) {
	    health++;
	    if (health > 20)
		health = 20;
	}
	else
	    health = health - 0.1 * diseases.size();
    }
    public double getMood() {
	return mood;
    }
    public void setMood(double mood) {
	this.mood = mood;
    }
    public void updateMood() {
	mood = mood - percentDecrease * maxStat / 100.0;
	if (mood > maxStat)
	    mood = maxStat;
    }
    public void play() {
	mood = mood + toyBase;
	if (mood > maxStat)
	    mood = maxStat;
    }
    public void equipToy(Toy toy) {
	if (toy1 == null) {
	    toyBase += toy.getBase();
	    toy1 = toy;
	}
	else if (toy2 == null) {
	    toyBase += toy.getBase();
	    toy2 = toy;
	}
	else
	    // error message;
    }
    public void unequipToy1() {
	toyBase -= toy1.getBase();
	toy1 = null;
    }
    public void unequipToy2() {
	toyBase -= toy2.getBase();
	toy2 = null;
    }
    public Toy getToy1() {
	return toy1;
    }
    public Toy getToy2() {
	return toy2;
    }
    */
    public int getHunger() {
	return hunger;
    }
    public void setHunger(int hunger) {
	this.hunger = hunger;
    }
    public void updateHunger() {
	hunger = hunger - percentDecrease * maxStat / 100;
	/*
	if (hunger <= 0) {
	    health -= 0.5;
	    hunger = 0;
	}
	*/
    }
    public abstract void eat(Food food);
    public void eat(Food food, boolean trigger) {
	if (trigger)
	    hunger = hunger + food.getBase() * 2 + food.getPercent() * maxStat / 100;
	else
	    hunger = hunger + food.getBase() + food.getPercent() * maxStat / 100;
	if (hunger > maxStat)
	    hunger = maxStat; 
    }
    /*
    public double getCleanliness() {
	return cleanliness;
    }
    public void setCleanliness(double cleanliness) {
	this.cleanliness = cleanliness;
    }
    public void groom(Grooming grooming);
    public void updateCleanliness() {
	cleanliness = cleanliness - percentDecrease * maxStat / 100.0;
	if (cleanliness <= 0) {
	    if (dirtyTimer % 10 == 0)
		contractRandDisease();
	    dirtyTimer++;
	    cleanliness = 0;
	}
	else
	    dirtyTimer = 1;
    }
    public String contractRandDisease();
    public boolean contractDisease(String disease) {
	if (!diseases.contains(disease)) {
	    diseases.add(disease);
	    return true;
	}
	else
	    return false;
    }
    public void useMedicine(Medicine medicine) {
	boolean t = diseases.remove(medicine.getCure());
	medicine.special(this, t);
    }
    */
    public String getPicture() {
	return picture;
    }
    public void setPicture(String picture) {
	this.picture = picture;
    }
    /*
    public abstract void dance(); // move up and down animation
    public abstract void disappear(); // leave screen animation
    public abstract void death(); // picture tip over animation
    */
}
