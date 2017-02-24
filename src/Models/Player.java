import java.util.HashMap;

/**
 * Created by Calvin on 2/11/2017.
 */
//focus on food items
public class Player {

    Pet playerPet;
    int currency;
    HashMap<Item, Integer> inventory = new HashMap<Item, Integer>(); //integer is the quantity of the Item
    String name;
    //Item[] iventory = new Item[20]; //changeable size depending on balance
    //replace with maps or some other data structure

    //*******************************constructor*******************************//

    public Player(){
        //put as many items into invetory as required and set them to some value at the beginning
        //inventory.put(, 0);
        //inventory.put(, 5);
        name = "null";
        playerPet = null;
        currency = 0;
    }

    public Player(String yourName){
        super();
        name = yourName;
    }

    public Player(String Name, Pet petType) {
        name = Name;
        playerPet = petType;
        currency = 0;
    }

    //****************************getter & setters**********************************//

    public int getCurrency(){
        return currency;
    }

    public void setCurrency(int val){
        currency += val;
    }

    public String getName(){ return name;}

    public Pet getPlayerPet(){ return playerPet;}

    public HashMap<Item, Integer> getInv() {return inventory;}

    public Integer getInventoryQuantity(Item item){
        return inventory.get(item);
    }

    public void setIventoryQuantity(Item item, Integer val){
        inventory.put(item, val);
    }

    //*******************************main functions of player class*******************************//

    public void addItem(Item item){
        inventory.put(item, 0);
    }

    /*public void petPlay(){
        playerPet.setSomething(some value);
    }

    public void petPlay(Item toy);*/

    public void sellItem(Item trash){
        if(inventory.containsKey(trash)) {
            currency = currency + trash.getPrice() / 2;
            inventory.put(trash, inventory.get(trash) - 1);
        }
        return;
    }

    public void useItem(Item item){
        if(item instanceof Food){
            playerPet.eat((Food) item);
            inventory.put(item, inventory.get(item) - 1);
        }
        /*
        if(item instanceof Toy) //WIP
         */
    }

    /*public void buyItem(Item resource){
        //go into shop?
        //increment inventory by resource + 1
        //update shop quantity??
        return;
    }*/

    //this is probably just the "work"
    //can't implement just yet:
    public void playGame(){
        currency++;
    }


}
