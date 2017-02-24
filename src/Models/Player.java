import java.util.ArrayList;

public class Player {
    private String name;
    private Pet pet;
    private int digiCoins;
    private ArrayList<Item> inventory = new ArrayList<Item>();
    public Player(String name, Pet pet) {
	this.name = name;
	this.pet = pet;
	digiCoins = 0;
    }
    public String getName() {
	return name;
    }
    public Pet getPet() {
	return pet;
    }
    public int getDigiCoins() {
	return digiCoins;
    }
    public ArrayList<Item> getInventory() {
	return inventory;
    }
    public int getSize() {
	return inventory.size();
    }
    public boolean addItem(Item item) {
	if (inventory.size() >= 20)
	    return false;
	else {
	    inventory.add(item);
	    return true;
	}
    }
    public void sellItem(int i) {
	digiCoins = digiCoins + inventory.get(i).getPrice() / 2;
	inventory.remove(i);
    }
    public void useItem(int i) {
	if (inventory.get(i) instanceof Food) {
	    pet.eat((Food) inventory.get(i));
	    inventory.remove(i);
	}
    }
    public void work() {
	digiCoins++;
    }
}
