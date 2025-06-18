package duke.choice;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeesD1 = new ArrayList<>();
        ArrayList<Employee> employeesD2 = new ArrayList<>();
        Departamento d1 = new Departamento("Departamento 1", employeesD1);
        Departamento d2 = new Departamento("Departamento 2", employeesD2);
        
        Employee e1 = new Employee("Tobías", d1);
        Employee e2 = new Employee("Eduardo", d1);
        Employee e3 = new Employee("Pepe", d2);
        
        employeesD1.add(e1);
        employeesD1.add(e2);
        employeesD2.add(e3);
        
        d1.asignarDepartamentoEmpleado(e1, d1);
        d1.asignarDepartamentoEmpleado(e3, d1);
        d1.mostrarEmpleadosPorDepartamento();
        d2.mostrarEmpleadosPorDepartamento();
    }
}
