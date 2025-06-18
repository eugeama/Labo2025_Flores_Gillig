package Electrodomesticos;

public class CargadorPortatil extends Producto {
    private int cantCarga;

    public CargadorPortatil(String nombre, int precio, int stock, Tipo tipo, int cantCarga){
        super(nombre, precio, stock, tipo);
        this.cantCarga= cantCarga;
    }

    public CargadorPortatil () {
        super("", 0, 0, Tipo.CARGADOR);
        this.cantCarga= 0;
    }

    public int getCantCarga() {
        return cantCarga;
    }

    public void setCantCarga(int cantCarga) {
        this.cantCarga = cantCarga;
    }
}
