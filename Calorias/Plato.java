package Calorias;

import java.util.HashSet;
import java.util.Map;

public class Plato {
    private String nombre;
    private HashMap<Ingredientes>;
    private int caloria;

    public Plato(String nombre, HashMap<Ingredientes>;, int caloria){
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

    public int calcularCalorias(){
        int sumaCal=0;
        for(Map.Entry<Ingrediente, integer> ingrediente:ingredientes.entryset()){
            sumaCal+=ingrediente.getKey().getCaloria()*ingrediente.getValue();
        }
        return sumaCal;
    }
}package Calorias;

import java.util.HashSet;
import java.util.Map;

public class Plato {
    private String nombre;
    private HashMap<Ingredientes>;
    private int caloria;

    public Plato(String nombre, HashMap<Ingredientes>;, int caloria){
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

    public int calcularCalorias(){
        int sumaCal=0;
        for(Map.Entry<Ingrediente, integer> ingrediente:ingredientes.entryset()){
            sumaCal+=ingrediente.getKey().getCaloria()*ingrediente.getValue();
        }
        return sumaCal;
    }
}
