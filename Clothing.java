package duke.choice;

public class Clothing{
    String descripcion;
    double precio;
    String talle;

    public Clothing() {
        this.talle= "M";
    }
    public Clothing(String descripcion, double precio, String talle) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.talle = talle;
    }
}