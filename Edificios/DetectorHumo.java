package Edificios;

public class DetectorHumo extends Dispositivo{


    public DetectorHumo(Boolean estado, int medida, int umbralInicial, int dia, int mes, int anio){
        super(estado, medida, umbralInicial, dia, mes, anio);
    }

    @Override
    public void disparaAlarma() {
        System.out.println("Llamando a los bomberos");
    }
}
