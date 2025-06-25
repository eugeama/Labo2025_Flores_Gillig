package Drones;

import java.time.LocalDate;
import java.util.ArrayList;

public class DronCarga extends Dron {
    private int cantCarga;

    public DronCarga(String nombre, LocalDate fechaAdquisicion, Carga nivelCarga, Estado estado, int cantCarga) {
        super(nombre,fechaAdquisicion, nivelCarga, estado);
        this.cantCarga= cantCarga;
    }

    public int getCantCarga() {
        return cantCarga;
    }

    public void setCantCarga(int carga) {
        this.cantCarga = cantCarga;
    }

    @Override
    public boolean mision(double latitudDestino, double longitudDestino) {
        double distancia = LatitudLongitud.buscarKm(Dron.getLatitudOrigen(), latitudDestino, Dron.getLongitudOrigen(), longitudDestino);
        if (distancia < 30 && getNivelCarga().getValor() > 50) {
            return true;
        }
        else {
            return false;
        }
    }
}
