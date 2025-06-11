package Drones;
import Autos.Fecha;

public class Dron {
    private String nombre;
    private Fecha fechaAdquisicion;
    private int nivelCarga;
    static int contador;
    private Estado estado;


    public Dron(String nombre, int dia, int mes, int anio, int nivelCarga, int contador, Estado estado){
        this.nombre= nombre;
        this.fechaAdquisicion= new Fecha(dia, mes, anio);
        this.nivelCarga= nivelCarga;
        this.contador= contador;
        this.estado= Estado.ENVUELO
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Fecha fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Dron.contador = contador;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
