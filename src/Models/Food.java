public abstract class Food extends Item {
    private int base;
    private double percent;
    public Food(String name, int price, int base, double percent, string picture) {
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
    public double getPercent() {
	return percent;
    }
    public void setPercent(int percent) {
	this.percent = percent;
    }
}
