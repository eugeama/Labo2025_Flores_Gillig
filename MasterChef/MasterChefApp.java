package MasterChef;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {
        HashSet<String> prohibidos1 = new HashSet<>();
        prohibidos1.add("maní");
        prohibidos1.add("gluten");

        HashSet<String> prohibidos2 = new HashSet<>();
        prohibidos2.add("lactosa");

        HashSet<String> prohibidos3 = new HashSet<>();
        prohibidos2.add("soja");
        prohibidos2.add("mariscos");

        Principiante p1 = new Principiante("Ana", "Gómez", LocalDate.of(1995, 3, 12), "Buenos Aires", Color.VERDE, prohibidos1);
        Principiante p2 = new Principiante("Lucas", "Pérez", LocalDate.of(2001, 7, 25), "Córdoba", Color.AZUL, prohibidos2);
        Principiante p3 = new Principiante("Marta", "Díaz", LocalDate.of(1988, 11, 5), "Rosario", Color.ROJO, prohibidos3);


        HashMap<String, Integer> stock1 = new HashMap<>();
        stock1.put("Harina", 2);
        stock1.put("Huevo", 6);
        stock1.put("Leche", 1);

        HashMap<String, Integer> stock2 = new HashMap<>();
        stock2.put("Carne", 3);
        stock2.put("Papas", 5);

        HashMap<String, Integer> stock3 = new HashMap<>();
        stock3.put("Arroz", 4);
        stock3.put("Pollo", 2);
        stock3.put("Aceite", 1);

        Intermedio i1 = new Intermedio("Juan", "Martínez", LocalDate.of(1990, 5, 10), "Buenos Aires", Color.ROJO, stock1);
        Intermedio i2 = new Intermedio("Lucía", "Fernández", LocalDate.of(1998, 8, 22), "Córdoba", Color.AZUL, stock2);
        Intermedio i3 = new Intermedio("Pedro", "García", LocalDate.of(1985, 2, 3), "Mendoza", Color.VERDE, stock3);


        Experto e1 = new Experto("Sofía", "López", LocalDate.of(1982, 6, 15), "Buenos Aires", Color.ROJO);
        Experto e2 = new Experto("Martín", "Ramírez", LocalDate.of(1978, 12, 3), "Córdoba", Color.VERDE);
        Experto e3 = new Experto("Valeria", "Suárez", LocalDate.of(1985, 9, 27), "Rosario", Color.AZUL);


        HashSet<String> ing1 = new HashSet<>();
        ing1.add("Harina");
        ing1.add("Huevo");
        ing1.add("Leche");

        HashSet<String> ing2 = new HashSet<>();
        ing2.add("Carne");
        ing2.add("Papas");

        HashSet<String> ing3 = new HashSet<>();
        ing3.add("Arroz");
        ing3.add("Pollo");
        ing3.add("Aceite");

        Plato plato1 = new Plato(30, ing1);
        Plato plato2 = new Plato(45, ing2);
        Plato plato3 = new Plato(20, ing3);

        System.out.println(p1.preparar());
        System.out.println(i1.preparar());
        System.out.println(e1.preparar());

        System.out.println(p2.cocinarYServir(plato2));
        System.out.println(i2.cocinarYServir(plato1));
        System.out.println(e2.cocinarYServir(plato2));
    }
}
