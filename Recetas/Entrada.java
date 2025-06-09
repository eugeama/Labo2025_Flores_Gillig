package Recetas;

import java.util.ArrayList;

public class Entrada extends Plato{
    private Temperatura temperatura;

    public Entrada (String nombrePlato, Nivel nivelDificultad, ArrayList<String> pasos, Temperatura temperatura){
        super(nombrePlato, nivelDificultad, pasos);
        this.temperatura= temperatura;
    }

    public Entrada(){
        super("", Nivel.AVANZADO, new ArrayList<>());
        this.temperatura= Temperatura.FRIO;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    void mostrarPasos() {
        for(String paso: pasos){
            System.out.println(paso);
        }
    }
}
