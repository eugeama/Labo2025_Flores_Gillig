package SistemaArcoFlecha;

import java.util.HashMap;

public abstract class Diana {
    private String nombreId;
    private String dificultad;
    private HashMap<Integer, Color> puntajes;

    public Diana(String nombreId, String dificultad, HashMap<Integer, Color>puntajes){
        this.nombreId= nombreId;
        this.dificultad= dificultad;
        this.puntajes= puntajes;
    }

    public Diana(){
        this.nombreId= "";
        this.dificultad= "";
        this.puntajes= new HashMap<>();
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

    public HashMap<Integer, Color>getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(HashMap<Integer, Color> puntajes) {
        this.puntajes = puntajes;
    }
}
