package duke.choice;

public class Employee{
    private String nombre;
    private Department department;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Department getDepartamento() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    public Employee(String nombre, Department department) {
        this.nombre = nombre;
        this.department = department;
    }
  
}