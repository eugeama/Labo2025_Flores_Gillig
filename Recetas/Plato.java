package Recetas;

import java.util.ArrayList;

public abstract class Plato {
    private String nombrePlato;
    private Nivel nivelDificultad;
    static ArrayList<String> pasos;

    public Plato(String nombrePlato, Nivel nivelDificultad, ArrayList<String> pasos){
        this.nombrePlato= nombrePlato;
        this.nivelDificultad= nivelDificultad;
        this.pasos= pasos;
    }

    public Plato(){
        this.nombrePlato= "";
        this.nivelDificultad= Nivel.AVANZADO;
        this.pasos= new ArrayList<>();
    }


    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public Nivel getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(Nivel nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    abstract void mostrarPasos();
}
