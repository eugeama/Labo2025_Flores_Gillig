package Calorias;

import java.util.HashSet;

public class Plato {
    private String nombre;
    private HashSet<String>ingredientes;
    private int caloria;

    public Plato(String nombre, HashSet<String>ingredientes, int caloria){
        this.nombre= nombre;
        this.ingredientes= ingredientes;
        this.caloria= caloria;
    }

    public Plato(){
        this.nombre= "nombre";
        this.ingredientes= new HashSet<>();
        this.caloria= 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }
}
