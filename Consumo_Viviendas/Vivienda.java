package Consumo_Viviendas;

import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private String cod_postal;
    private Duenio duenio;
    private HashMap<Integer, HashMap<String, Integer>>consumos;
    public Vivienda(String direccion, String cod_postal, Duenio duenio, HashMap<Integer, HashMap<String, Integer>>consumos){
        this.direccion= direccion;
        this.cod_postal= cod_postal;
        this.duenio= duenio;
        this.consumos= consumos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public HashMap<Integer, HashMap<String, Integer>> getConsumos() {
        return consumos;
    }

    public void setConsumos(HashMap<Integer, HashMap<String, Integer>> consumos) {
        this.consumos = consumos;
    }

    public abstract int consumoVivienda();
}
