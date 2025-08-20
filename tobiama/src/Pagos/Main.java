package Pagos;
import java.util.HashMap;

public class Main {
        public static void main(String[] args) {
            Diseñador d = new Diseñador();

            HashMap<String, Integer> p1=new HashMap<>();
            HashMap<String, Integer> p2=new HashMap<>();
            p1.put("proyecto", 3);
            p1.put("proyecto2", 4);
            p1.put("proyecto3", 5);
            p2.put("proyecto", 6);
            p2.put("proyecto2", 7);
            p2.put("proyecto3", 8);
            Diseñador d1 = new Diseñador (Tipo.IT,p1);
            Diseñador d2 = new Diseñador (Tipo.UX,p2);

            System.out.println("sueldo empleado 1: "+d1.sueldoEmpleado());
            System.out.println("sueldo empleado 2: "+d2.sueldoEmpleado());

            System.out.println("proyectos realizados empleado 1: "+d1.proyecRealizados());
            System.out.println("proyectos realizados empleado 2: "+d2.proyecRealizados());

            System.out.println("sueldo ganado: "+d1.sueldoP("proyecto"));
            System.out.println("sueldo ganado: "+d2.sueldoP("proyecto"));

            System.out.println("sueldo discriminado: "+d1.sueldoDiscriminado());
            System.out.println("sueldo discriminado: "+d2.sueldoDiscriminado());
        }
    }
