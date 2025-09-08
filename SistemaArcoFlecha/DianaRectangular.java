package SistemaArcoFlecha;

import java.util.HashMap;

public class DianaRectangular extends Diana implements MetodoDiana {
    private int base;
    private int altura;

    public DianaRectangular(String nombreId, String dificultad, HashMap<Color, Integer> puntajes, int base, int altura){
        super(nombreId, dificultad, puntajes);
        this.base= base;
        this.altura= altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return getBase()*getAltura();
    }
}
