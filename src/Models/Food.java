public abstract class Food extends Item {
    private int base;
    private int percent;
    public Food(String name, int price, int base, int percent, String picture) {
	super(name, price, picture);
	this.base = base;
	this.percent = percent;
    }
    public int getBase() {
	return base;
    }
    public void setBase(int base) {
	this.base = base;
    }
    public int getPercent() {
	return percent;
    }
    public void setPercent(int percent) {
	this.percent = percent;
    }
}
