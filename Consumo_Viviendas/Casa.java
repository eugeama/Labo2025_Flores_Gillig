package Consumo_Viviendas;

import java.time.Month;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class Casa extends Vivienda {
    private int metrosCubiertos;
    private int metrosDescubiertos;
    private static int pago= 100;

    public Casa(String direccion, String cod_postal, Duenio duenio, HashMap<Year, HashMap<Month, Integer>> consumos, int metrosCubiertos, int metrosDescubiertos) {
        super(direccion, cod_postal, duenio, consumos);
        this.metrosCubiertos= metrosCubiertos;
        this.metrosDescubiertos= metrosDescubiertos;
    }

    public int getMetrosCubiertos() {
        return metrosCubiertos;
    }

    public void setMetrosCubiertos(int metrosCubiertos) {
        this.metrosCubiertos = metrosCubiertos;
    }

    public int getMetrosDescubiertos() {
        return metrosDescubiertos;
    }

    public void setMetrosDescubiertos(int metrosDescubiertos) {
        this.metrosDescubiertos = metrosDescubiertos;
    }

    public static int getPago() {
        return pago;
    }

    public static void setPago(int pago) {
        Casa.pago = pago;
    }

    @Override
    public double consumoVivienda(Year anio, Month mes){
        double total= 0;
        double actual= getConsumos().get(anio).get(mes);
        double anterior= getConsumos().get(anio.minusYears(1)).get(mes);

        if((anterior-actual)/anterior<=0.10){
            total= actual*getPago()*0.05;
        }
        else{
            total= actual*getPago();
        }
        return total;
    }
}
