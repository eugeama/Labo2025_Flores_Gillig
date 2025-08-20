package Edificios;

import java.time.LocalDate;

public class DetectorHumo extends Dispositivo{


    public DetectorHumo(Boolean estado, int medida, int umbralInicial, LocalDate fecha){
        super(estado, medida, umbralInicial, fecha);
    }

    @Override
    public void disparaAlarma() {
        System.out.println("Llamando a los bomberos");
    }
}
