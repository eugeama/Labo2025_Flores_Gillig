package Pagos;

public enum Tipo {
    UX(0.08), UI(0.07), IT(0.12);

    private double comision;

    private Tipo(double comision){
        this.comision=comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
