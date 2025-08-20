package Edificios;

import java.time.LocalDate;

public class SensorTemperatura extends Dispositivo {


    public SensorTemperatura(Boolean estado, int medida, int umbralInicial, LocalDate fecha){
        super(estado, medida, umbralInicial, fecha);
    }

    @Override
    public void disparaAlarma() {
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
