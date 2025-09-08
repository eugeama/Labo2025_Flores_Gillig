package SistemaArcoFlecha;

import java.util.HashMap;

public class DianaCircular extends Diana implements MetodoDiana {
    private static int radio= 13;

    public DianaCircular(String nombreId, String dificultad, HashMap<Color, Integer> puntajes){
        super(nombreId, dificultad, puntajes);
    }

    public static int getRadio() {
        return radio;
    }

    public static void setRadio(int radio) {
        DianaCircular.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*getRadio()*getRadio();
    }
}
