package Recetas;

import java.util.ArrayList;

public class Postre extends Plato{
    private int temperaturaHorno;
    private boolean diabetico;

    public Postre(String nombrePlato, Nivel nivelDificultad, ArrayList<String> pasos, int temperaturaHorno, boolean diabetico){
        super(nombrePlato, nivelDificultad, pasos);
        this.temperaturaHorno= temperaturaHorno;
        this.diabetico= diabetico;
    }

    public Postre (){
        super("", Nivel.AVANZADO, new ArrayList<>());
        this.temperaturaHorno= 0;
        this.diabetico= true;
    }

    public int getTemperaturaHorno() {
        return temperaturaHorno;
    }

    public void setTemperaturaHorno(int temperaturaHorno) {
        this.temperaturaHorno = temperaturaHorno;
    }

    public boolean isDiabetico() {
        return diabetico;
    }

    public void setDiabetico(boolean diabetico) {
        this.diabetico = diabetico;
    }

    @Override
    void mostrarPasos() {
        for(String paso: pasos){
            System.out.println(paso);
        }
    }
}
