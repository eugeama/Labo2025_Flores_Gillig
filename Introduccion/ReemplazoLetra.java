package Introduccion;

import java.util.Scanner;
public class ReemplazoLetra {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese una letra: ");
        char Letra = e.next().charAt(0);
        String oracion = "Ayer me compré muñecos de la marca ´ToyCo´ por internet";
        for (int i = 0; i < oracion.length(); i++) {
            char Letra2=oracion.charAt(i);
            if(Letra2=='e' || Letra2=='é') {
                Letra2=Letra;
                System.out.print(Letra2);
            }
            else{
                System.out.print(Letra2);
            }
        }
    }
}
