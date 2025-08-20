package GestionMascotas;

public class Gato extends Mascota {
    private static int alegria= 7;

    public Gato(String nombre, String duenio) {
        super(nombre, duenio);
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    @Override
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

    @Override
    public String tipoDeMascota() {
        return "Gato";
    }
}
