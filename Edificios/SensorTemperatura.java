package Edificios;

public class SensorTemperatura extends Dispositivo {


    public SensorTemperatura(Boolean estado, int medida, int umbralInicial, int dia, int mes, int anio){
        super(estado, medida, umbralInicial, dia, mes, anio);
    }

    @Override
    public void disparaAlarma() {
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
