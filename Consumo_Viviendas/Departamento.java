package Consumo_Viviendas;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;

public class Departamento extends Vivienda {
    private int ambientes;
    private static int pago= 50;

    public Departamento(String direccion, String cod_postal, Duenio duenio, HashMap<Year, HashMap<Month, Integer>> consumos, int ambientes) {
        super(direccion, cod_postal, duenio, consumos);
        this.ambientes= ambientes;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public static int getPago() {
        return pago;
    }

    public static void setPago(int pago) {
        Departamento.pago = pago;
    }

    @Override
    public double consumoVivienda(Year anio, Month mes){
        double total= 0;
        int actual= getConsumos().get(anio).get(mes);
        int anterior= getConsumos().get(anio.minusYears(1)).get(mes);

        if((anterior-actual)/anterior<=10){
            total= actual*getPago()*0.05;
        }
        else{
            total= actual*getPago();
        }
        return total;
    }
}
