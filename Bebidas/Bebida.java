package Bebidas;

public abstract class Bebida {
    private String nombre;

    public Bebida(String nombre, int coeficientePos, int coeficienteNeg){
        this.nombre= nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getCoeficientePos();

    public abstract int getCoeficienteNeg();
}
