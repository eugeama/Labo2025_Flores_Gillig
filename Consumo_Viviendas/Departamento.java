package Consumo_Viviendas;

import java.util.HashMap;

public class Departamento extends Vivienda {
    private int ambientes;

    public Departamento(String direccion, String cod_postal, Duenio duenio, HashMap<Integer, HashMap<String, Integer>> consumos, int ambientes) {
        super(direccion, cod_postal, duenio, consumos);
        this.ambientes= ambientes;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }
}
