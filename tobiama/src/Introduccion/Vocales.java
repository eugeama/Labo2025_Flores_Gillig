package Introduccion;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese una oración: ");
        String oracion = e.nextLine();
        int cantidad = 0;

        for(int i=0; i< oracion.length();i++) {
            char caracter=oracion.charAt(i);
            if (caracter == 'a'
                    ||caracter == 'e'
                    || caracter == 'i'
                    || caracter == 'o'
                    || caracter == 'u'
                    ||caracter == 'A'
                    ||caracter == 'E'
                    || caracter == 'I'
                    || caracter == 'O'
                    || caracter == 'U' ){
                cantidad++;
            }
        }
        System.out.println(cantidad);
    }
        }
