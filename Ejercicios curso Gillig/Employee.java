package duke.choice;

public class Employee{
    private String nombre;
    private Departamento department;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Departamento getDepartamento() {
        return department;
    }
    public void setDepartamento(Departamento department) {
        this.department = department;
    }
    public Employee(String nombre, Departamento department) {
        this.nombre = nombre;
        this.department = department;
    }
  
}