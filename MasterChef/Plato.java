package MasterChef;

import java.util.HashSet;

public class Plato {
    private int tiempoPrep;
    private HashSet<String> ingredientes;

    public Plato(int tiempoPrep, HashSet<String> ingredientes){
        this.tiempoPrep= tiempoPrep;
        this.ingredientes= ingredientes;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTiempoPrep() {
        return tiempoPrep;
    }

    public void setTiempoPrep(int tiempoPrep) {
        this.tiempoPrep = tiempoPrep;
    }
}
