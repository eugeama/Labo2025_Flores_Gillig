package Drones;

import java.time.LocalDate;
import java.util.ArrayList;

public class DronVigilancia extends Dron {
    private int memoria;
    private static int foto= 12;


    public DronVigilancia(String nombre, LocalDate fechaAdquisicion, Carga nivelCarga, Estado estado, int memoria) {
        super(nombre,fechaAdquisicion, nivelCarga, estado);
        this.memoria= memoria;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public static int getFoto() {
        return foto;
    }

    public static void setFoto(int foto) {
        DronVigilancia.foto = foto;
    }

    @Override
    public boolean mision(double latitudDestino, double longitudDestino) {
        double distancia = LatitudLongitud.buscarKm(Dron.getLatitudOrigen(), latitudDestino, Dron.getLongitudOrigen(), longitudDestino);
        double cantFotosASacar = distancia / 2;
        double almacenamientoNecesario = cantFotosASacar*foto;
        return almacenamientoNecesario<=memoria;
    }
}
