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
}
