package Mascotas;

public class Pajaro extends Mascota {
    private boolean cantor;
    private String cantoEspecial;

    public Pajaro(String nombre, String duenio, boolean cantor, String cantoEspecial) {
        super(nombre, duenio);
        this.cantor = cantor;
        if (cantor && (cantoEspecial == null || cantoEspecial.isEmpty() || cantoEspecial.equals("pio"))) {
            this.cantoEspecial = "equis";
        } else {
            this.cantoEspecial = cantoEspecial;
        }
    }

    public boolean esCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public String getCantoEspecial() {
        return cantoEspecial;
    }

    public void setCantoEspecial(String cantoEspecial) {
        if (cantor && (cantoEspecial == null || cantoEspecial.isEmpty() || cantoEspecial.equals("pio"))) {
        } else {
            this.cantoEspecial = cantoEspecial;
        }
    }
       public void alimentar() {
        alegria++;
    }

    public String saludar() {
        if (cantor) {
            return cantoEspecial;
        } else {
            return "pio";
        }
    }
     public String tipoDeMascota() {
        return "Pajaro";
    }
}

