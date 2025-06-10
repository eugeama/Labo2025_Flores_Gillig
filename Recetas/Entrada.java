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
    if (temperatura == Temperatura.CALIENTE) {
        System.out.println("Recordá prender el horno.");
    }

    for (String paso : pasos) {
        System.out.println(paso);
    }

    if (temperatura == Temperatura.FRIO) {
        System.out.println("Guardá la preparación en la heladera.");
    }
}
