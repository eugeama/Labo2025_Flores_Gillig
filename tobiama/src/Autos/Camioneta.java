package Autos;

public class Camioneta extends Vehiculo {
    private String patente;
    private int capacidad;

    public Camioneta(String marca, String modelo, Color color, int cantRuedas, String patente, int capacidad){
        super(marca, modelo, color, cantRuedas);
        this.patente= patente;
        this.capacidad= capacidad;
    }


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
