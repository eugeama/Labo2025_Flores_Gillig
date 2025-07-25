package Drones;

public enum Carga {
    DIEZ(10), VEINTE(20), TREINTA(30), CUARENTA(40), CINCUENTA(50), SESENTA(60), SETENTA(70), OCHENTA(80), NOVENTA(90), CIEN(100);

    private int valor;

    private Carga (int valor){
        this.valor= valor;
    }

    public int getValor() {
        return valor;
    }

    public double getPorcentajeDecimal() {
        return valor / 100.0;
    }
}
