package Consumo_Viviendas;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public abstract class Vivienda {
    private String direccion;
    private String cod_postal;
    private Duenio duenio;
    private HashMap<Year, HashMap<Month, Integer>>consumos;

    public Vivienda(String direccion, String cod_postal, Duenio duenio, HashMap<Year, HashMap<Month, Integer>>consumos){
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

    public HashMap<Year, HashMap<Month, Integer>> getConsumos() {
        return consumos;
    }

    public void setConsumos(HashMap<Year, HashMap<Month, Integer>> consumos) {
        this.consumos = consumos;
    }

    public int conseguirConsumo(Year anio, Month mes){
        int consumo= 0;

        if(getConsumos().containsKey(anio) && getConsumos().containsValue(mes)){
            consumo= getConsumos().get(anio).get(mes);
        }

        return consumo;
    }

    public abstract int conseguirConsumo();

    public double consumoVivienda(Year anio, Month mes){
        double total= 0;
        int actual= conseguirConsumo(anio, mes);
        int anterior= conseguirConsumo(anio.minusYears(1), mes);

        if((anterior-actual)/anterior<=10){
            total= actual*conseguirConsumo()*0.05;
        }
        else{
            total= actual*conseguirConsumo();
        }
        return total;
    }

}
