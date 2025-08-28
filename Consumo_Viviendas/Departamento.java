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
    public int conseguirConsumo() {
        return getPago();
    }

}
