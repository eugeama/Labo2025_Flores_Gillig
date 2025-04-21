package Libros;
import java.util.ArrayList;

public class ArraylistEntero {
    public static void main(String[] args) {
        int enteroTotal = 0;
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        ArrayList<String> palabras = new ArrayList<String>();
        ArrayList<Persona> personas = new ArrayList<Persona>();

        enteros.add(10);
        enteros.add(2);
        enteros.add(900);

        palabras.add("popu");
        palabras.add("topo");
        palabras.add("naten");

        personas.add(new Persona("amalia", 48, "boulevard 912"));
        personas.add(new Persona("marta", 80, "pipi 123"));
        personas.add(new Persona("matias", 10, "sillys 123"));

        for (Integer entero : enteros) {
            enteroTotal += entero;
        }
        System.out.println("la suma es: " + enteroTotal);

        for (String palabra : palabras) {
            char letra = palabra.charAt(0);
            if (letra == 'n') {

                System.out.println("las palabras que empiezan con n son: " + palabra);
            }
        }
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println("la persona es: " + persona.getEdad());
            }
        }
    }
}
