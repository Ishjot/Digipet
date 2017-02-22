//import java.util.Arraylist;

public abstract class Pet {
    private String name;
    private int age;
    private int maxStat;
    //private double health;
    //private double mood;
    private double hunger;
    //private double cleanliness;
    //Toy toy1;
    //Toy toy2;
    //private int playBonus;
    //private int dirty;
    //private ArrayList<Disease> diseases;
    private String picture;
    public Pet(String name, String picture) {
	this.name = name;
	age = 0;
	maxStat = 100;
	//health = 20;
	//mood = maxStat;
	hunger = maxStat;
	//cleanliness = maxStat;
	//playBonus = 0;
	//dirty = 5;
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
	    health = health - 0.5 * disease.size();
    }
    public double getMood() {
	return mood;
    }
    public void updateMood() {
	mood = mood + 0.25 * playBonus - 0.02 * maxStat;
	if (mood > maxStat)
	    mood = maxStat;
    }
    public void play() {
	mood = mood + 0.01 * maxStat + playBonus;
	if (mood > maxStat)
	    mood = maxStat;
    }
    public void equipToy(Toy toy) {
	if (toy1 == null) {
	    playBonus += toy.base;
	    toy1 = toy;
	}
	else if (toy2 == null) {
	    playBonus += toy.base;
	    toy2 = toy;
	}
	else
	    // error message;
    }
    public void unequipToy1() {
	playBonus -= toy1.base;
	toy1 = null;
    }
    public void unequipToy2() {
	playBonus -= toy2.base;
	toy2 = null;
    }
    public Toy getToy1() {
	return toy1;
    }
    public Toy getToy2() {
	return toy2;
    }
    */
    public double getHunger() {
	return hunger;
    }
    public void updateHunger() {
	hunger = hunger - 0.02 * maxStat;
	/*
	if (hunger <= 0) {
	    health -= 0.5;
	    hunger = 0;
	}
	*/
    }
    /*
    public void eat(Food food) {
	hunger = hunger + food.base + food.percent * maxStat / 100;
	if (hunger > maxStat)
	    hunger = maxStat; 
    }
    public double getCleanliness() {
	return cleanliness;
    }
    public void groom(Grooming grooming);
    public void updateCleanliness() {
	cleanliness = cleanliness - 0.02 * maxStat;
	if (cleanliness <= 0) {
	    if (dirty % 10 == 0)
		contractRandDisease();
	    dirty++;
	    cleanliness = 0;
	}
	else
	    dirty = 5;
    }
    public void contractRandDisease();
    public void contractDisease(Disease disease) {
	if (!diseases.contains(disease))
	    diseases.add(disease);
    }
    public void useMedicine(Medicine medicine) {
	diseases.remove(medicine.disease);
    }
    */
    public String getPicture() {
	return picture;
    }
    /*
    public abstract void play(); //animation
    public abstract void eat(Food object); //animation
    */
}
