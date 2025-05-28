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
}
