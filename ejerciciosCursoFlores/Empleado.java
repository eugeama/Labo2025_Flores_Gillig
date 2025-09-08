public class Empleado{
    private String nombre;
    private Departamento departamento;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Empleado(String nombre, Departamento departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }
}
