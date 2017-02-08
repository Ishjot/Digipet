public class Item {
    //for hunger bar
    private int storeFoodCount = 1000;
    private int playerFoodCount = 0;

    //For bathe/wash pet
    private int storeShampooCount = 1000;
    private int storeBrushCount = 1000;
    private int playerShampooCount = 0;
    private int playerBrushCount = 0;

    //Toys
    private int storeToyOne;
    private int playerToyOne;


    public int getStoreFood(){
	return storeFoodCount;
    }

    public void setStoreFood( int count ){
	storeFoodCount = count;
    }

    public int getPlayerFood(){
	return playerFoodCount;
    }

    public void setPlayerFood( int count ){
	playerFoodCount = count;
    }

    public void buyFood(){
	playerFoodCount++;
    }

    public int getStoreShampoo(){
	return storeShampooCount;
    }

    public void setStoreShampoo( int count){
	storeShampooCount = count;
    }

    public int getStoreBrush(){
	return storeBrushCount;
    }

    public void setStoreBrush( int count){
	storeBrushCount = count;
    }


    public int getPlayerShampoo(){
	return playerShampooCount;
    }

    public void setPlayerShampoo( int count){
	playerShampooCount = count;
    }

    public void buyShampoo(){
	playerShampooCount ++;
    }

    public int getPlayerBrush(){
	return playerBrushCount;
    }

    public void setPlayerBrush( int count){
	playerBrushCount = count;
    }

    public void buyBrush(){
	playerBrushCount++;
    }


}
