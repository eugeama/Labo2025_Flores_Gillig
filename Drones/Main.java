package Drones;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        DronCarga c1 = new DronCarga("d", LocalDate.now(), Carga.CIEN, Estado.INACTIVO, 20);
        DronCarga c4 = new DronCarga("d", LocalDate.now(), Carga.CIEN, Estado.INACTIVO, 20);
        DronVigilancia c5 = new DronVigilancia("d", LocalDate.now(), Carga.TREINTA, Estado.INACTIVO, 20);
        System.out.println(Dron.getContador());
        c5.cargarBateria();
        System.out.println(c5.getNivelCarga());
        c5.cargarBateria();
        System.out.println(c5.getNivelCarga());
    }
}
