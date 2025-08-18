package Calorias;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> i1 = new HashSet<String>();
        i1.add("papa");
        i1.add("pollo");
        i1.add("zanahoria");

        HashSet<String> i2 = new HashSet<String>();
        i1.add("papa");
        i1.add("pollo");
        i1.add("zanahoria");

        HashSet<String> i3 = new HashSet<String>();
        i1.add("papa");
        i1.add("pollo");
        i1.add("zanahoria");


        Plato p1 = new Plato("sopa", i1,11);
        Plato p2 = new Plato("sopa", i2,12);
        Plato p3 = new Plato("sopa", i3,15);

        HashMap<Plato, Integer>platos1= new HashMap<>();
        platos1.put(p1,2);
        platos1.put(p2, 5);
        platos1.put(p3, 6);

        HashMap<Plato, Integer>platos2= new HashMap<>();
        platos1.put(p1,2);
        platos1.put(p2, 3);



        PersonaC per1 = new PersonaC(platos1, "pepe", "aldo", LocalDate.of(2025, 03,2), 25);
        PersonaC per2 = new PersonaC(platos1, "pipi", "pipu", LocalDate.of(2023, 05,4), 40);
        PersonaC per3 = new PersonaC(platos2, "pupi","chuchu", LocalDate.of(2023, 03,4), 45);

        HashSet<PersonaC>integrantes= new HashSet<>();
        integrantes.add(per1);
        integrantes.add(per2);
        integrantes.add(per3);

        Familia f = new Familia(integrantes);

        HashMap<Ingredientes>ing= new HashMap<>();
        ing.put(i1,2);
        ing.put(i2, 3);

        System.out.println("el promedio de calorias en la familia es: "+f.promedioFamilia());

        System.out.println("el integrante con más calor{ias es: "+f.masCalorias());

        System.out.println("el integrante con menos calorías es: "+f.menosCalorias());

        System.out.println("el total de calorías es:"+f.calcularCalorias());
    }
}
