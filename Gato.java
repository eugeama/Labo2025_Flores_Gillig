package Mascotas;

public class Gato extends Mascota {
    public Gato(String nombre, String duenio) {
        super(nombre, duenio);
    }

    public String saludar() {
        return "guau";
    }
}
