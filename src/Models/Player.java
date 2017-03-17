import java.util.HashMap;

/**
 * Created by Calvin on 2/11/2017.
 */
public class Player {

	/**
	 * Default Constructor. Creates a new empty player.
	 */
	public Player() {
		name = "null";
		playerPet = null;
		currency = 0;
	}

	/**
	 * Constructor creating a player with a name
	 */
	public Player(String name) {
		super();
		this.name = name;
	}

	/**
	 * Constructor creating player with a name and a pet
	 */
	public Player(String name, Pet petType) {
		this.name = name;
		playerPet = petType;
		currency = 0;
		numItems = 1;
	}

	public int getCurrency() {
		return currency;
	}

	public void setCurrency(int val) {
		currency += val;
	}

	public String getName() {
		return name;
	}

	public Pet getPlayerPet() {
		return playerPet;
	}

	public int getNumItems() {
		return numItems;
	}

	public void setItemsNum(int val) {
		numItems += val;
	}

	public void feedPet() {
		playerPet.eat(new Biscuit());
		setItemsNum(-1);
	}

	public void playGame() {
		currency++;
	}

	// public vars
	Pet playerPet;
	int currency;
	String name;
	int numItems;

}
