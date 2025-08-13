package SistemaPoblacion;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> p1=new HashMap<>();
        HashMap<Integer, Integer> p2=new HashMap<>();
        Barrio b = new Barrio();
        Pais p = new Pais();
        Continente c = new Continente("nombre", 12,p1,p2 );
        Mundo m = new Mundo();

        p1.put(2,2);
        p2.put(2,2);

        HashMap<LocalDate, Double> p1=new HashMap<>();
    }
}
