package Almuerzos;

public class Profesor extends PersonaAlmuerzo {
    private int porcDescuento;


    public Profesor(String nombre, String apellido, int porcDescuento){
        super(nombre, apellido);
        this.porcDescuento= porcDescuento;
    }


    public int getPorcDescuento() {
        return porcDescuento;
    }

    public void setPorcDescuento(int porcDescuento) {
        this.porcDescuento = porcDescuento;
    }

}
