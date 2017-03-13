import java.util.HashMap;

/**
 * Created by Calvin on 2/11/2017.
 */
// focus on food items
public class Player {

	// *******************************constructor*******************************//

	/**
	 * Default Constructor. Creates a new empty player.
	 */
	public Player() {
		// put as many items into invetory as required and set them to some
		// value at the beginning
		// inventory.put(, 0);
		// inventory.put(, 5);
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

	// ****************************getter&setters**********************************//

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

	// public HashMap<Item, Integer> getInv() {return inventory;}

	public int getNumItems() {
		return numItems;
	}

	public void setItemsNum(int val) {
		numItems += val;
	}

	// *******************************main functions of player
	// class*******************************//

	/*
	 * public void addItem(Item item){ inventory.put(item, 0); }
	 */

	/*
	 * public void petPlay(){ playerPet.setSomething(some value); }
	 * 
	 * public void petPlay(Item toy);
	 */

	/*
	 * public void sellItem(Item trash){ if(inventory.containsKey(trash)) {
	 * currency = currency + trash.getPrice() / 2; inventory.put(trash,
	 * inventory.get(trash) - 1); } return; }
	 */

	public void feedPet() {
		playerPet.eat(new Biscuit());
		setItemsNum(-1);
	}

	/*
	 * public void buyItem(Item resource){ //go into shop? //increment inventory
	 * by resource + 1 //update shop quantity?? return; }
	 */

	// this is probably just the "work"
	// can't implement just yet:
	public void playGame() {
		currency++;
	}

	// public vars

	Pet playerPet;
	int currency;
	String name;
	int numItems;
	// HashMap<Item, Integer> inventory = new HashMap<Item, Integer>();
	// integer is the quantity of the Item
	// Item[] iventory = new Item[20];
	// changeable size depending on balance
	// replace with maps or some other data structure

}
