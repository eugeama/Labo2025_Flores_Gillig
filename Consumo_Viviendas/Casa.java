package Consumo_Viviendas;

import java.util.HashMap;
import java.util.Map;

public class Casa extends Vivienda {
    private int metrosCubiertos;
    private int metrosDescubiertos;

    public Casa(String direccion, String cod_postal, Duenio duenio, HashMap<Integer, HashMap<String, Integer>> consumos, int metrosCubiertos, int metrosDescubiertos) {
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

    @Override
    public int consumoVivienda(){
        HashMap<Integer, HashMap<String, Integer>>consumoPrecioA= new HashMap<>();
        HashMap<String, Integer>consumoPrecioM= new HashMap<>();
        int total= 0;

        for(Map.Entry<Integer, HashMap<String, Integer>>conxAnio: getConsumos().entrySet()){
            for(Map.Entry<String, Integer>consumoxMes: conxAnio.getValue().entrySet()){
                if(!consumoPrecioA.containsKey(consumoxMes.getKey())) {
                    total = consumoxMes.getValue() * 100;
                    consumoPrecioM.put(consumoxMes.getKey(),total);
                    consumoPrecioA.put(conxAnio.getKey(), consumoPrecioM);
                }
                else{

                }
            }
        }

        return total;
    }
}
