import java.util.HashMap;
import java.util.Map;

/**
 * Created by Calvin on 2/11/2017.
 */
//focus on food items
public class Player {

    Pet playerPet;
    int currency;
    HashMap<Item, Integer> inventory = new HashMap<Item, Integer>(); //integer is the quantity of the Item
    //Item[] iventory = new Item[20]; //changeable size depending on balance
    //replace with maps or some other data structure

    //*******************************constructor*******************************//

    public Player(){
        //put as many items into invetory as required and set them to some value at the beginning
        //inventory.put(, 0);
        //inventory.put(, 5);
    }

    //****************************getter & setters**********************************//

    public int getCurrency(){
        return currency;
    }

    public void setCurrency(int val){
        currency = val;
    }

    //public void getInventoryQuantity(Item item){}

    //public void setIventoryQuantity(Item item){}

    //*******************************main functions of player class*******************************//

    public void feedPet(FoodItem food) {
        int foodPt = food.getFoodFillUpRate();
        playerPet.updateHunger(foodPt);
        //decrease quantity of foodItem by 1

    }

    /*public void petPlay(){
        playerPet.setSomething(some value);
    }

    public void petPlay(Item toy);*/

    public void sellItem(Item trash){
        //go into the shop to sell item? else
        //decrement inventory trash item by 1

        //should be give players currency back for the item?
        //should be update shop inventory by some amount?
        return;
    }

    public void buyItem(Item resource){
        //go into shop?
        //increment inventory by resource + 1
        //update shop quantity??
        return;
    }

    //this is probably just the "work"
    //can't implement just yet:
    public void playGame(){
        currency++;
    }


}
