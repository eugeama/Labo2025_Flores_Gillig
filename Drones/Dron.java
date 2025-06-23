package Drones;
import Autos.Fecha;

public abstract class Dron {
    private String nombre;
    private Fecha fechaAdquisicion;
    private int nivelCarga;
    private static int contador;
    private Estado estado;
    private double latitudOrigen;
    private double longitudOrigen;
    private double latitudDestino;
    private double longitudDestino;


    public Dron(String nombre, int dia, int mes, int anio, int nivelCarga, int contador, Estado estado, int latitudOrigen, int latitudDestino, int longitudOrigen, int longitudDestino) {
        this.nombre = nombre;
        this.fechaAdquisicion = new Fecha(dia, mes, anio);
        this.nivelCarga = nivelCarga;
        this.contador = contador;
        this.estado = Estado.ENVUELO;
        this.latitudOrigen= latitudOrigen;
        this.latitudDestino= latitudDestino;
        this.longitudOrigen= longitudOrigen;
        this.longitudDestino= longitudDestino;
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

    public double getLatitudOrigen() {
        return latitudOrigen;
    }

    public void setLatitudOrigen(double latitudOrigen) {
        this.latitudOrigen = latitudOrigen;
    }

    public double getLongitudOrigen() {
        return longitudOrigen;
    }

    public void setLongitudOrigen(double longitudOrigen) {
        this.longitudOrigen = longitudOrigen;
    }

    public double getLatitudDestino() {
        return latitudDestino;
    }

    public void setLatitudDestino(double latitudDestino) {
        this.latitudDestino = latitudDestino;
    }

    public double getLongitudDestino() {
        return longitudDestino;
    }

    public void setLongitudDestino(double longitudDestino) {
        this.longitudDestino = longitudDestino;
    }

    public abstract void recargarBateria(int cont, int carga);

    public double latitudLongitud (){
        // Convertir a radianes
        double lat1Rad = Math.toRadians(latitudOrigen);
        double lon1Rad = Math.toRadians(longitudOrigen);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);

        // Fórmula de Haversine
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        return radioTierraKm * c;
    }
}