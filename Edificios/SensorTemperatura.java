package Edificios;

public class SensorTemperatura extends Dispositivo {


    public SensorTemperatura(Boolean estado, int medida, int umbralInicial, int dia, int mes, int anio){
        super(estado, medida, umbralInicial, dia, mes, anio);
    }

    public void comprobar() {
        recorrer();
        if(recorrer()==true){
            System.out.println("¡Cuidado! La temperatura sube");
        }

    }
}
