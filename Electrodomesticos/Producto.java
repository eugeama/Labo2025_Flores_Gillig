package Electrodomesticos;

public class Producto {
    private String nombre;
    private int precio;
    private int stock;
    private Tipo tipo;

    public Producto(String nombre, int precio, int stock, Tipo tipo){
        this.nombre= nombre;
        this.precio= precio;
        this.stock= stock;
        this.tipo= tipo;

    }

    public Producto(){
        this.nombre= "";
        this.precio= 0;
        this.stock= 0;
        this.tipo=Tipo.MULTIMEDIA ;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
