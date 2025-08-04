package CampañaVacunacion;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Ciudadano c = new Ciudadano();
        Vacuna v = new Vacuna();
        Sistema s = new Sistema();
        Ciudadano c1 = new Ciudadano(48680732, "Mateo", "Lopez", Provincia.CATAMARCA, "Larralde 1934", "mail@gmail");
        Ciudadano c2 = new Ciudadano(48680733, "Matías", "Flores", Provincia.BUENOS_AIRES, "Larralde 1934", "mail@gmail");
        Ciudadano c3 = new Ciudadano(48680745, "Juana", "Perez", Provincia.CATAMARCA, "Larralde 1934", "mail@gmail");
        Vacuna v1 = new Vacuna(LocalDate.of(2020, 2, 2), LocalDate.of(2020, 2, 2), 2, 4, "Sputnik");
        Vacuna v2 = new Vacuna(LocalDate.of(2020, 2, 2), LocalDate.of(2020, 2, 2), 2, 4, "Astrazeneca");
        Vacuna v3 = new Vacuna(LocalDate.of(2020, 2, 2), LocalDate.of(2020, 2, 2), 2, 4, "Sillycuna");

        HashSet<Vacuna>vac1= new HashSet<>();
        HashSet<Vacuna>vac2= new HashSet<>();
        HashSet<Vacuna>vac3= new HashSet<>();

        s.agregarVacunado(c1, vac1);
        s.agregarVacunado(c2, vac2);
        s.agregarVacunado(c3, vac3);

        s.agregarVacuna("Mateo",v1);
        s.agregarVacuna("Mateo",v2);
        s.agregarVacuna("Mateo",v3);

        s.agregarVacuna("Matías", v2);
        s.agregarVacuna("Matías", v1);

        s.agregarVacuna("Juana", v3);
        s.agregarVacuna("Juana", v2);

        for(Vacuna vacunaDNI: s.consultarVacunados(48680733)){
            System.out.println("Las vacunas que tiene son: " + vacunaDNI.getNombreComercial());
        }

        System.out.println(s.vacunadosProvincia());

        for(Ciudadano cantidadVac: s.cantVacunas(3)) {
            System.out.println("Los ciudadanos que cumplen con esa cantidad de vacunas son: " + cantidadVac.getNombre());
        }

        for(Ciudadano vacEspecifica: s.vacunadoEsp("Sputnik")){
            System.out.println("Los vacunados con esa vacuna son: " + vacEspecifica.getNombre());
        }

    }
}

