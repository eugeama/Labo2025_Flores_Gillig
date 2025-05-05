package duke.choice;

public class Clothing {
    String description;
    double price;
    String size;

    private final double minPrice= 10.0;
    private final double minTax= 0.2;


    public Clothing(String description, double price, String aSize) {
        this.description = description;
        this.price = price;
        size = aSize;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price*minTax);
    }

    public void setPrice(double price) {
        this.price = (price > minPrice) ? price : minPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}