package Edificios;

import java.util.ArrayList;

public class Edificio {
    ArrayList<DetectorHumo>detectoresHumo;
    ArrayList<SensorTemperatura>sensoresTemperatura;
    ArrayList<SensorPresion>sensoresPresion;


    public Edificio(ArrayList<DetectorHumo>detectoresHumo, ArrayList<SensorTemperatura>sensoresTemperatura, ArrayList<SensorPresion>sensoresPresion){
        this.detectoresHumo=detectoresHumo;
        this.sensoresTemperatura=sensoresTemperatura;
        this.sensoresPresion=sensoresPresion;
    }

    public Edificio(){
        this.detectoresHumo=new ArrayList<>();
        this.sensoresTemperatura=new ArrayList<>();
        this.sensoresPresion=new ArrayList<>();
    }

    public void agregarDetectorHumo(DetectorHumo nuevo){
        detectoresHumo.add(nuevo);
    }

    public void agregarSensorPresion(SensorPresion nuevo){
        sensoresPresion.add(nuevo);
    }

    public void agregarSensorTemperatura(SensorTemperatura nuevo){
        sensoresTemperatura.add(nuevo);
    }

    public ArrayList<DetectorHumo> getDetectoresHumo() {
        return detectoresHumo;
    }

    public void setDetectoresHumo(ArrayList<DetectorHumo> detectoresHumo) {
        this.detectoresHumo = detectoresHumo;
    }

    public ArrayList<SensorTemperatura> getSensoresTemperatura() {
        return sensoresTemperatura;
    }

    public void setSensoresTemperatura(ArrayList<SensorTemperatura> sensoresTemperatura) {
        this.sensoresTemperatura = sensoresTemperatura;
    }

    public ArrayList<SensorPresion> getSensoresPresion() {
        return sensoresPresion;
    }

    public void setSensoresPresion(ArrayList<SensorPresion> sensoresPresion) {
        this.sensoresPresion = sensoresPresion;
    }

    public void recorreSensores(){
        for(DetectorHumo humo: detectoresHumo){
            humo.recorrer();
        }
        for(SensorTemperatura temperatura: sensoresTemperatura){
            temperatura.recorrer();
        }
        for(SensorPresion presion: sensoresPresion){
            presion.recorrer();
        }
    }

    public void sensorCompuesto(){
        int temperaturaTotal= 0;
        int umbralPromedio= 0;
        for(DetectorHumo humo: detectoresHumo) {
            for (SensorTemperatura temperatura : sensoresTemperatura) {
                for (SensorPresion presion : sensoresPresion) {
                    temperaturaTotal= (temperaturaTotal + humo.getMedida() + temperatura.getMedida() + presion.getMedida())/3;
                    umbralPromedio= (umbralPromedio + humo.getUmbralInicial() + temperatura.getUmbralInicial() + presion.getUmbralInicial())/3;
                }
            }
        }
        if(temperaturaTotal/umbralPromedio>umbralPromedio){
            System.out.println("Umbral superado, se va activar la alarma");
        }
    }

    public ArrayList<Dispositivo> cantTotal(){
        ArrayList<Dispositivo>dispTotales= new ArrayList<>();
        for(DetectorHumo humo: detectoresHumo){
            dispTotales.add(humo);
        }
        for(SensorTemperatura temperatura: sensoresTemperatura){
            dispTotales.add(temperatura);
        }
        for(SensorPresion presion: sensoresPresion){
            dispTotales.add(presion);
        }
        return dispTotales;
    }
}
