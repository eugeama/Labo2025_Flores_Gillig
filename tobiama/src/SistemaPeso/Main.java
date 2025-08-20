package SistemaPeso;

import Pagos.Diseñador;
import Pagos.Tipo;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();

        HashMap<LocalDate, Double> p1=new HashMap<>();
        HashMap<LocalDate, Double> p2=new HashMap<>();
        p1.put(LocalDate.of(2013,1,30), 55.2);
        p1.put(LocalDate.of(2013,2,28), 59.1);
        p1.put(LocalDate.of(2025,7,21), 47.2);
        p2.put(LocalDate.of(2013,11,9), 72.3);
        p2.put(LocalDate.of(2024,4,12), 68.8);
        p2.put(LocalDate.of(2020,5,18), 70.5);

        Persona d1 = new Persona ("Camilo","Pérez",LocalDate.of(2005,1,2),p1,p2);

        System.out.println(d1.fechaPart(LocalDate.of(2024,4,12)));
        System.out.println(d1.promedioAnio(2013));
        System.out.println("el porcentaje de altura es: "+d1.porcAltura(LocalDate.of(2013, 1, 30), LocalDate.of(2013, 11, 9)));

    }
}
