package Introduccion;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.print("Ingrese un día de la semana: ");
        String DiaSemana =e.nextLine();
        if (DiaSemana.equals("Sabado")|| DiaSemana.equals("Domingo"))  {
            System.out.println("Es un día no laboral");
        }
        else {
            System.out.println("Es un día laboral");
        }




    }
}
