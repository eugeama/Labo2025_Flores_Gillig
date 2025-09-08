package SistemaArcoFlecha;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Color>punt1= new HashMap<>();
        punt1.put(2, Color.AMARILLO);
        punt1.put(3, Color.VERDE);
        punt1.put(4, Color.BLANCO);
        punt1.put(5, Color.BLANCO);
        HashMap<Integer, Color>punt2= new HashMap<>();
        punt1.put(2, Color.AMARILLO);
        punt1.put(3, Color.VERDE);
        HashMap<Integer, Color>punt3= new HashMap<>();
        punt1.put(2, Color.AMARILLO);
        punt1.put(3, Color.VERDE);
        punt1.put(4, Color.BLANCO);

        DianaCircular dci1= new DianaCircular("pipis", "medio",punt1);
        DianaCuadrada dcu1= new DianaCuadrada("pipus", "alto", punt2, 4);
        DianaRectangular dr1= new DianaRectangular("pipiu", "bajo", punt3, 3,5);

        HashSet<String>g1= new HashSet<>();
        HashSet<String>c1= new HashSet<>();
        HashSet<String>t1= new HashSet<>();

        BeneficioGaseosa bg= new BeneficioGaseosa("beneficio 5 puntos", "pipi", g1);
        BeneficioComida bc= new BeneficioComida("beneficio 2 puntos", "pipu", c1);
        BeneficioTragos bt= new BeneficioTragos("beneficio 10 puntos", "pepe", t1);

        HashSet<Diana>d1= new HashSet<>();
        HashSet<Beneficio>ben1= new HashSet<>();
        HashSet<Acumulable>acum1= new HashSet<>();

        Bar b1= new Bar("pipis", d1, 35, 40600,ben1, acum1);
    }
}
