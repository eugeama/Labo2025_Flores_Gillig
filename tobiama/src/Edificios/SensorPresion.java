package Edificios;

import java.time.LocalDate;

public class SensorPresion extends Dispositivo {


    public SensorPresion(Boolean estado, int medida, int umbralInicial, LocalDate fecha){
        super(estado, medida, umbralInicial, fecha);
    }

    @Override
    public void disparaAlarma() {
        System.out.println("Sensor de presión activado");
    }
}
