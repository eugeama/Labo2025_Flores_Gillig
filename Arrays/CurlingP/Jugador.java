package CurlingP;

import Libros.Fecha;

public class Jugador {
    private String nombreJug;
    private Boolean esCapitan;
    private Fecha nacimientoJug;
    private int numCamiseta;

    public Jugador(String nombreJug, int dia, int mes, int anio, int numCamiseta, Boolean esCap) {
        this.nombreJug=nombreJug;
        this.esCapitan=esCap;
        this.nacimientoJug= new Fecha(dia, mes, anio);
        this.numCamiseta= numCamiseta;
    }


    public String getNombreJug() {
        return nombreJug;
    }

    public void setNombreJug(String nombreJug) {
        this.nombreJug = nombreJug;
    }

    public Fecha getNacimientoJug() {
        return nacimientoJug;
    }

    public void setNacimientoJug(Fecha nacimientoJug) {
        this.nacimientoJug = nacimientoJug;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public Boolean getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(Boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public static void main(String[] args) {

    }
}
