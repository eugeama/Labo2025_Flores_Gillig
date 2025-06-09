package Electrodomesticos;

public class EquipoSonido extends Producto {
    private Boolean bluetooth;

    public EquipoSonido(String nombre, int precio, int stock, Tipo tipo, Boolean bluetooth){
        super(nombre, precio, stock, tipo);
        this.bluetooth= bluetooth;
    }

    public EquipoSonido(){
        super("", 0, 0, Tipo.MULTIMEDIA);
        this.bluetooth= false;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
