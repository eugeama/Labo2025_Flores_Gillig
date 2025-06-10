package Recetas;

import java.util.ArrayList;

public class Recetario {
    private ArrayList<Plato> recetas;

    public Recetario() {
        this.recetas = new ArrayList<>();
    }
}


    public void agregarReceta(Plato nuevaReceta) {
        recetas.add(nuevaReceta);
    }

    public void eliminarReceta(Plato nuevaReceta) {
              for (Plato receta: platos){
            if(receta.equals(nuevaReceta)){
                platos.remove(nuevaReceta);
            }
        }
    }

    public void modificarReceta(Plato nuevaReceta, Plato viejaReceta) {
        for (Plato receta: platos){
            if(receta.equals(viejaReceta)){
                platos.remove(viejaReceta);
                platos.add(nuevaReceta);
            }
        }
    }

    public ArrayList<Plato> buscarPorDificultad(Nivel dificultad) {
    ArrayList<Plato> resultado = new ArrayList<>();
    for (Plato receta : recetas) {
        if (receta.getNivelDificultad() == dificultad) {
            resultado.add(receta);
        }
    }
    return resultado;
    }


    public ArrayList<Plato> filtrarPorTipo() {
        // incompleto
        return null;
    }

    public int totalRecetas() {
    return recetas.size();
     }


  public Plato recetaConMasPasos() {
    if (recetas.isEmpty()) {
        return null;
    }

    Plato maxPasos = recetas.get(0);

    for (Plato receta : recetas) {
        if (receta.getPasos().size() > maxPasos.getPasos().size()) {
            maxPasos = receta;
        }
    }

    return maxPasos;
}
