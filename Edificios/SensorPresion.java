package Edificios;

public class SensorPresion extends Dispositivo {


    public SensorPresion(Boolean estado, int medida, int umbralInicial, int dia, int mes, int anio) {
        super(estado, medida, umbralInicial, dia, mes, anio);
    }

    @Override
    public void disparaAlarma() {
        System.out.println("Sensor de presión activado");
    }
}
