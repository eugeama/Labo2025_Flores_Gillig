package CampañaVacunacion;

public class Ciudadano {
    private int dni;
    private String nombre;
    private String apellido;
    private Provincia provincia;
    private String domicilio;
    private String mail;

    public Ciudadano(int dni, String nombre, String apellido, Provincia provincia, String domicilio, String mail){
        this.dni= dni;
        this.nombre= nombre;
        this.apellido= apellido;
        this.provincia= provincia;
        this.domicilio= domicilio;
        this.mail= mail;
    }

    public Ciudadano(){
        this.dni= 0;
        this.nombre= "";
        this.apellido= "";
        this.provincia= Provincia.CHACO;
        this.domicilio= "";
        this.mail= "";
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
