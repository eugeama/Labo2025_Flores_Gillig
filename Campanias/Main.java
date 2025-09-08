package Campanias;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Paloma_Mensajera pm1= new Paloma_Mensajera("blanca", "pipi", "no se", false);
        Paloma_Mensajera pm2= new Paloma_Mensajera("negra", "palomin", "palomita", true);

        Telefono_Movil tm1= new Telefono_Movil(201, "pipipu", "pipi2002", Compania.MOVISTAR, 201932, true, 20);
        Telefono_Movil tm2= new Telefono_Movil(202, "pipipi", "pipi2002", Compania.TUENTI, 201933, false, 20);
        Telefono_Movil tm3= new Telefono_Movil(202, "pipipi", "pipi2002", Compania.CLARO, 201934, true, 0);

        Trabajador t1= new Trabajador("pepe", "pipi", 209543, LocalDate.of(2002, 3, 5), 3456, 20000, "pipis 123", LocalTime.of(8, 53));
        Trabajador t2= new Trabajador("pepe", "pipi", 209543, LocalDate.of(2002, 3, 5), 3456, 20000, "pipis 123", LocalTime.now());

        HashSet<Mensajero>mensajero1= new HashSet<>();
        mensajero1.add(pm1);
        mensajero1.add(tm1);
        mensajero1.add(t1);

        Partido p1= new Partido("pipis2025", "pipipus 2134", 40, mensajero1);

        p1.agregarMensajero(pm2);
        p1.agregarMensajero(tm2);
        p1.agregarMensajero(tm3);
        p1.agregarMensajero(t2);

        p1.hacerCampania();
    }
}
