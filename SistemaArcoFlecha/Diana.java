package SistemaArcoFlecha;

import java.util.HashMap;

public abstract class Diana {
    private String nombreId;
    private String dificultad;
    private HashMap<Color, Integer> puntajes;

    public Diana(String nombreId, String dificultad, HashMap<Color, Integer>puntajes){
        this.nombreId= nombreId;
        this.dificultad= dificultad;
        this.puntajes= puntajes;
    }

    public String getNombreId() {
        return nombreId;
    }

    public void setNombreId(String nombreId) {
        this.nombreId = nombreId;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public HashMap<Color, Integer> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(HashMap<Color, Integer> puntajes) {
        this.puntajes = puntajes;
    }
}
