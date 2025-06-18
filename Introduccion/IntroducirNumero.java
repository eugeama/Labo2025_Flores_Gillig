package Introduccion;

import java.util.Scanner;

public class IntroducirNumero {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int cantidad = 0;
        int numero = 0;
        while (numero != -1) {
            System.out.println("Ingrese un numero: ");
            numero = e.nextInt();
            if(numero !=-1) {
                cantidad++;
            }
        }
        System.out.println(cantidad);
    }
}
