package Edificios;

public class DetectorHumo extends Dispositivo{


    public DetectorHumo(Boolean estado, int medida, int umbralInicial, int dia, int mes, int anio){
        super(estado, medida, umbralInicial, dia, mes, anio);
    }

    public void comprobar() {
        recorrer();
        if(recorrer()==true){
            System.out.println("Llamando a los bomberos");
        }

    }
}
