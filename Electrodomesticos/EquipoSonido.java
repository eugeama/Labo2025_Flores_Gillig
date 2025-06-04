package Electrodomesticos;

public class EquipoSonido extends Producto {
    private Boolean bluetooth;

    public EquipoSonido(String nombre, int precio, int stock, Tipo tipo, Boolean bluetooth){
        super(nombre, precio, stock, tipo);
        this.bluetooth= bluetooth;
    }

}
