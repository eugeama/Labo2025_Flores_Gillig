package SistemaArcoFlecha;

import java.util.HashMap;

public class DianaCuadrada extends Diana implements MetodoDiana{
    private int valorLado;

    public DianaCuadrada(String nombreId, String dificultad, HashMap<Color, Integer> puntajes, int valorLado){
        super(nombreId, dificultad, puntajes);
        this.valorLado= valorLado;
    }

    public int getValorLado() {
        return valorLado;
    }

    public void setValorLado(int valorLado) {
        this.valorLado = valorLado;
    }

    @Override
    public double calcularArea() {
        return getValorLado()*getValorLado();
    }
}
