package Sistema_Sangre;

import java.time.LocalDate;

public abstract class Paciente {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate nacimiento;
    private String genero;
    private TipoSangre sangre;

    public Paciente(String apellido, String genero, LocalDate nacimiento, String nombre, TipoSangre sangre, int edad) {
        this.apellido = apellido;
        this.genero = genero;
        this.nacimiento = nacimiento;
        this.nombre = nombre;
        this.sangre = sangre;
        this.edad= edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoSangre getSangre() {
        return sangre;
    }

    public void setSangre(TipoSangre sangre) {
        this.sangre = sangre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
