package duke.choice;

public class Clothing{
    String descripcion;
    double precio;
    String talle;
    private final double minPrice= 10.0;
    private final double minTax= 0.2;

    public Clothing() {
        this.talle= "M";
    }
    public Clothing(String descripcion, double precio, String talle) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.talle = talle;
    }

    public String getDescription() {
        return descripcion;
    }

    public void setDescription(String desc) {
        this.descripcion = desc;
    }

    public double getPrecio() {
        return precio + (precio*minTax);
    }

    public void setPrice(double price) {
        this.precio = Math.max(price, minPrice);
    }

    public String getSize() {
        return talle;
    }

    public void setSize(String size) {
        this.talle = size;
    }
}
