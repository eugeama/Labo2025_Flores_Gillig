package Mascotas;

public class Perro extends Mascota {
    public Perro(String nombre, String duenio) {
        super(nombre, duenio);
    }

    public String saludar() {
        return "guau";
    }
}
