package Introduccion;

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra: ");
        String palabra1= e.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String palabra2= e.nextLine();

        if(palabra1.equals(palabra2)){
            System.out.println("Son iguales");
        }
        else {
            System.out.println("No son iguales");
        }
    }
}
