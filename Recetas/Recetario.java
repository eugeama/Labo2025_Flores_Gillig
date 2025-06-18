package Recetas;

import java.util.ArrayList;

public  class Recetario {
    private ArrayList<Plato> recetas;

    public Recetario() {
        this.recetas = new ArrayList<>();
    }


    public void agregarReceta(Plato nuevaReceta) {
        recetas.add(nuevaReceta);
    }

    public void eliminarReceta(Plato nuevaReceta) {
        for (Plato receta : recetas) {
            if (receta.equals(nuevaReceta)) {
                recetas.remove(nuevaReceta);
            }
        }
    }

    public void modificarReceta(Plato nuevaReceta, Plato viejaReceta) {
        for (Plato receta : recetas) {
            if (receta.equals(viejaReceta)) {
                recetas.remove(viejaReceta);
                recetas.add(nuevaReceta);
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

    public void filtrarPorTipo() {
        ArrayList<Plato>avanzados= new ArrayList<>();
        ArrayList<Plato>medios= new ArrayList<>();
        ArrayList<Plato>faciles= new ArrayList<>();
        for(Plato plato: recetas){
            if(plato.getNivelDificultad().equals("AVANZADO")){
                avanzados.add(plato);
            }
            if(plato.getNivelDificultad().equals("MEDIO")){
                medios.add(plato);
            }
            if(plato.getNivelDificultad().equals("FACIL")){
                faciles.add(plato);
            }
        }
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

    public void main() {
    }
}
