package Bebidas;

import java.util.ArrayList;
import java.util.List;

public class IdentificacionPersona {
    private String nombre;
    private String apellido;
    private int DNI;
    ArrayList<ListaConsumo>consumos;

    public IdentificacionPersona(String nombre, String apellido, int DNI, ArrayList<ListaConsumo> consumos){
        this.nombre= nombre;
        this.apellido= apellido;
        this.DNI= DNI;
        this.consumos= consumos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public ArrayList<ListaConsumo> getConsumos() {
        return consumos;
    }

    public void setConsumos(ArrayList<ListaConsumo> consumos) {
        this.consumos = consumos;
    }

    public int coeficienteHidratacion(ArrayList<ListaConsumo>consumos){
        int coeficiente= 0;
        int coeficienteTotal= 0;
        for(ListaConsumo consumo: consumos){
            coeficiente= (consumo.getCantidad() * (consumo.getBebida().getCoeficientePos() - consumo.getBebida().getCoeficienteNeg()));
            coeficienteTotal+= coeficiente;
        }
        return coeficienteTotal;
    }
}
