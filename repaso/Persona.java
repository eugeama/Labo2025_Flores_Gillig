package repaso;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;


    public Persona(String nom, int ed, String dire) {
        this.nombre = nom;
        this.edad = ed;
        this.direccion = dire;
    }

    public void Imprimir() {
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(direccion);
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public static void main(String[] args) {
        Persona p1= new Persona ("Mateo",19, "Galván 1265");
        System.out.println("Nombre: "+p1.nombre);
        System.out.println("Edad: "+p1.edad);
        System.out.println("Direccion: "+p1.direccion);

    }
}