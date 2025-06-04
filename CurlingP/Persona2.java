package CurlingP;

public class Persona2 extends Fecha {
    private String nombre;
    private String apellido;


    public Persona2(int dia, int mes, int anio, String nombre, String apellido){
        super(dia, mes, anio);
        this.nombre= nombre;
        this.apellido= apellido;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
