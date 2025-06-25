package Mascotas;

public class Gato extends Mascota {
    private int alegria;

    public Gato(String nombre, String duenio) {
        super(nombre, duenio);
        this.alegria = 1;
    }

    public void alimentar() {
        alegria++;
    }

    @Override
    public String saludar(String duenioQueSaluda) {
        String saludoBase = "miau";
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
        return "Gato";
    }
}
