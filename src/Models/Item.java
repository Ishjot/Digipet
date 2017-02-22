
public abstract class Item {

    private String name;
    private String type;
    private String picture;
    private int price;

    public Item(String name, String type, String picture, int price) {
        setName(name);
        setType(type);
        setPicture(picture);
        setPrice(price);
        }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }



}
