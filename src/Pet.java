public abstract class Pet {
    private int age;
    private int maxStat;
    //private int mood;
    private int hunger;
    //private int cleanliness;
    //private int happiness;
    public int getAge() {
	return age;
    }
    public void setAge(int value) {
	age = value;
    }
    public void increaseAge() {
	setAge(age + 1);
	updateMaxStat();
	//setMood(mood + 10);
	setHunger(hunger + 10);
	//setCleanliness(cleanliness + 10);
	//updateHappiness();
    }
    public int getMaxStat() {
	return maxStat;
    }
    public void setMaxStat(int value) {
	maxStat = value;
    }
    public void updateMaxStat() {
	int value = 60 + 10 * age;
	setMaxStat(value);
    }
    /*
    public int getMood() {
	return mood;
    }
    public void setMood(int value) {
	mood = value;
    }
    */
    public int getHunger() {
	return hunger;
    }
    public void setHunger(int value) {
	hunger = value;
    }
    /*
    public int getCleanliness() {
	return cleanliness;
    }
    public void setCleanliness(int value) {
	cleanliness = value;
    }
    public int getHappiness() {
	return happiness;
    }
    public void updateHappiness() {
	happiness = (mood + hunger + cleanliness) / 3;
    }
    public abstract void play(); //animation
    public abstract void eat(Food object); //animation
    */
}
