package Mascotas;

public class Perro extends Mascota {
    private int alegria;

    public Perro(String nombre, String duenio) {
        super(nombre, duenio);
        this.alegria = 1;
    }

    public void alimentar() {
        alegria++;
    }

    public String saludar(String duenioQueSaluda) {
        String saludoBase = "guau";
        if (duenioQueSaluda.equals(getDuenio())) {
            String saludo = "";
            for (int i = 0; i < alegria; i++) {
                saludo += saludoBase;
                if (i < alegria - 1) {
                    saludo += " ";
                }
            }
            if (alegria > 1) {
                alegria--;
            }
            return saludo;
        } else {
            return saludoBase.toUpperCase() + "!";
        }
    }

    public String tipoDeMascota() {
        return "Perro";
    }
}
