package GestionMascotas;

public class Perro extends Mascota {
    private static int alegria= 5;

    public Perro(String nombre, String duenio) {
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

    @Override
    public String tipoDeMascota() {
        return "Perro";
    }
}
