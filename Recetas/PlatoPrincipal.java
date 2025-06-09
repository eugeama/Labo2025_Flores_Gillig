package Recetas;

import java.util.ArrayList;

public class PlatoPrincipal extends Plato {
    private String tiempoCoccion;
    private int numComensales;

    public PlatoPrincipal (String nombrePlato, Nivel nivelDificultad, ArrayList<String> pasos, String tiempoCoccion, int numComensales){
        super(nombrePlato, nivelDificultad, pasos);
        this.tiempoCoccion= tiempoCoccion;
        this.numComensales= numComensales;
    }

    public PlatoPrincipal(){
        super("", Nivel.AVANZADO, new ArrayList<>());
        this.tiempoCoccion= "";
        this.numComensales= 0;
    }

    public String getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(String tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public int getNumComensales() {
        return numComensales;
    }

    public void setNumComensales(int numComensales) {
        this.numComensales = numComensales;
    }

    @Override
    void mostrarPasos() {
        for(String paso: pasos){
            System.out.println(paso);
        }
    }
}
