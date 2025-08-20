package Edificios;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sistema s= new Sistema();
        Edificio e= new Edificio();

        DetectorHumo d1=new DetectorHumo(true,5, 4, LocalDate.of(2025, 9, 02));
        DetectorHumo d2=new DetectorHumo(true,5, 4, LocalDate.of(2025, 9, 02));
        DetectorHumo d3=new DetectorHumo(true,5, 4, LocalDate.of(2025, 9, 02));

        SensorTemperatura t1= new SensorTemperatura(true,5, 4, LocalDate.of(2025, 9, 02));
        SensorTemperatura t2= new SensorTemperatura(true,5, 4, LocalDate.of(2025, 9, 02));
        SensorTemperatura t3= new SensorTemperatura(true,5, 4, LocalDate.of(2025, 9, 02));

        SensorPresion p1=new SensorPresion(true,5, 4, LocalDate.of(2025, 9, 02));
        SensorPresion p2=new SensorPresion(true,5, 4, LocalDate.of(2025, 9, 02));
        SensorPresion p3=new SensorPresion(true,5, 4, LocalDate.of(2025, 9, 02));

        e.agregarDetectorHumo(d1);
        e.agregarDetectorHumo(d2);
        e.agregarDetectorHumo(d3);

        e.agregarSensorPresion(p1);
        e.agregarSensorPresion(p2);
        e.agregarSensorPresion(p3);

        e.agregarSensorTemperatura(t1);
        e.agregarSensorTemperatura(t2);
        e.agregarSensorTemperatura(t3);

        System.out.println("la cantidad total es: "+e.cantTotal().size());

        try{
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Ingrese el sensor que queire ver: ");
            int numero = scanner1.nextInt();
            if(e.cantTotal().size()<numero) {
            if(e.cantTotal().size()<numero) {
                s.inforSensores(dato);
            }
            else if(){

            }
        }
        catch(IndexOutOfBoundsException index){
            System.out.println("ingrese un numero más chico"+index);
        }
        catch(ClassCastException coma){
            System.out.println("ingrese un numero entero"+coma);
        }
    }
}
