package Drones;

import java.time.LocalDate;

public abstract class Dron {
    private String nombre;
    private LocalDate fechaAdquisicion;
    private Carga nivelCarga;
    private static int contador= 0;
    private Estado estado;
    private static double latitudOrigen= -34.573195;
    private static double longitudOrigen=-58.504111;


    public Dron(String nombre,LocalDate fechaAdquisicion, Carga nivelCarga, Estado estado) {
        this.nombre = nombre;
        this.fechaAdquisicion = fechaAdquisicion;
        this.nivelCarga= nivelCarga;
        this.estado = estado;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Carga getNivelCarga() {
        return nivelCarga;
    }

    public void setNivelCarga(Carga nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public static double getLatitudOrigen() {
        return latitudOrigen;
    }

    public static void setLatitudOrigen(double latitudOrigen) {
        Dron.latitudOrigen = latitudOrigen;
    }

    public static double getLongitudOrigen() {
        return longitudOrigen;
    }

    public static void setLongitudOrigen(double longitudOrigen) {
        Dron.longitudOrigen = longitudOrigen;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Dron.contador = contador;
    }

    public void cargarBateria(){
        Carga [] todasCargas= Carga.values();

        if(nivelCarga.getValor() >= 20 && nivelCarga.getValor() < 100){
            nivelCarga = todasCargas [ (nivelCarga.ordinal()+1)];
        }
        else {
            nivelCarga = Carga.CIEN;
        }
    }

    public abstract boolean mision(double latitudDestino, double longitudDestino);
}