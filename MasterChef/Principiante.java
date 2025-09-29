package MasterChef;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante implements Metodo, Entrada {
    private HashSet<String> ingredientesProhibidos;

    public Principiante(String nombre, String apellido, LocalDate nacimiento, String localidad, Color color, HashSet<String> igredientesProhibidos){
        super(nombre, apellido, nacimiento, localidad, color);
        this.ingredientesProhibidos = igredientesProhibidos;
    }

    public HashSet<String> getIgredientesProhibidos() {
        return ingredientesProhibidos;
    }

    public void setIgredientesProhibidos(HashSet<String> igredientesProhibidos) {
        this.ingredientesProhibidos = igredientesProhibidos;
    }

    @Override
    public String preparar(){
        String ingredientesP= "";
        for(String i: ingredientesProhibidos){
            ingredientesP+=" -"+i;
        }
        return "Ya guarde todos los elementos prohibidos y no voy a usar: "+ ingredientesP;
    }

    @Override
    public String cocinarYServir(Plato plato) throws ExcepcionCYS{
        for(String ingrediente: plato.getIngredientes()) {
            if (plato.getIngredientes().contains(ingrediente)) {
                throw new ExcepcionCYS("No tiene los ingredientes necesarios");
            }
        }
        return "Preparando plato";
    }
}
