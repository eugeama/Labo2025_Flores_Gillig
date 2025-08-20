package GestionMascotas;

public class Pajaro extends Mascota {
    private int alegria;
    private boolean cantor;
    private String canto;

    public Pajaro(String nombre, String duenio, boolean cantor, String cantoEspecial, int alegria) {
        super(nombre, duenio);
        this.cantor = cantor;
        if (cantor && (cantoEspecial == null || cantoEspecial.isEmpty() || cantoEspecial.equals("pio"))) {
            this.canto = "equis";
        } else {
            this.canto = cantoEspecial;
        }
        this.alegria= alegria;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public boolean esCantor() {
        return cantor;
    }

    public boolean isCantor() {
        return cantor;
    }

    public String getCanto() {
        return canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    public String getCantoEspecial() {
        return canto;
    }

    public void setCantoEspecial(String cantoEspecial) {
        if (cantor && (cantoEspecial == null || cantoEspecial.isEmpty() || cantoEspecial.equals("pio"))) {
        } else {
            this.canto = cantoEspecial;
        }
    }

    @Override
    public void alimentar() {
        alegria++;
    }

    @Override
    public String saludar(String duenioQueSaluda) {
        String saludo = "";
        if (cantor) {
            saludo = canto;
        } else {
            saludo = "pio";
        }

        if (duenioQueSaluda.equals(getDuenio())) {
            return saludo;
        }
        else {
        return " ";
        }
    }

    @Override
    public String tipoDeMascota() {
        return "Pajaro";
    }
}
