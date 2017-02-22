public class FoodItem extends Item{

    public FoodItem(String name, String type, String picture, int price, int foodFillUpBase, int foodFillUpPercent) {
        super(name, type, picture, price);
        setFoodFillUpBase(foodFillUpBase);
        setFoodFillUpPercent(foodFillUpPercent);
    }

    void setFoodFillUpBase(int fillUpBase) {
        this.foodFillUpBase = fillUpBase;
    }

    int getFoodFillUpBase() {
        return this.foodFillUpBase;
    }

    void setFoodFillUpPercent( int fillUpPercent){
        this.foodFillUpPercent = fillUpPercent;
    }

    int getFoodFillUpPercent(){
        return this.foodFillUpPercent;
    }

    private int foodFillUpPercent;
    private int foodFillUpBase;
}