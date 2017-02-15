public abstract class FoodItem extends Item{

    private int FoodFillUpRate = 0;

    void setFoodFillUpRate( int fillRate ){
	this.FoodFillUpRate = fillRate;
    }
    int getFoodFillUpRate () {
	return this.FoodFillUpRate;
    }
}    
