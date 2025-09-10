package ejercicios_Curso_Gillig;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("HRApp Starts");

        Empleado e1 = new Empleado(1001010, "toto",100000);
        Empleado e2 = new Empleado(1091919,"juan",90000);



        Departamento dept = new Departamento("Education",new ArrayList<>());
        dept.agregarEmpleado(e1);
        dept.agregarEmpleado(e2);


        System.out.println("Emp"+e1);
        System.out.println("Emp"+e2);
        ArrayList<Empleado>empleados=dept.getEmpleado();

        for (Empleado emp: empleados){
            System.out.println("Emp"+emp);
        }
        System.out.println("Total"+dept.getSalarioTotal());
        System.out.println("Promedio"+dept.getSalarioP());
        System.out.println("Emp"+dept.getEmpleadoID(1001010));
    }
}