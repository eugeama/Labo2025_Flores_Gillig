package Pagos;

import java.util.HashMap;
import java.util.Map;

public class Diseñador {
    private Tipo tipoD;
    HashMap<String, Integer> proyectos = new HashMap<String, Integer>();

    public Diseñador(Tipo tipoD, HashMap<String, Integer> proyectos) {
        this.tipoD = Tipo.IT;
        this.proyectos = proyectos;
    }
    public Diseñador() {
        this.tipoD=Tipo.UX;
        this.proyectos= new HashMap<String, Integer>();
    }

    public Tipo getTipoD() {
        return tipoD;
    }

    public void setTipoD(Tipo tipoD) {
        this.tipoD = tipoD;
    }

    public HashMap<String, Integer> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<String, Integer> proyectos) {
        this.proyectos = proyectos;
    }

    public double sueldoEmpleado() {
        int sueldoS = 0;
        double sueldoT = 0;
        for (Map.Entry<String, Integer> proyectosD : proyectos.entrySet()) {
            sueldoS = proyectosD.getValue();
        }
        sueldoT = sueldoS * tipoD.getComision();
        return sueldoT;
    }

    public int proyecRealizados() {
        return proyectos.size();
    }

    public int sueldoP(String proyectoE){
        int sueldo= 0;
        for (Map.Entry<String, Integer> proyectosD : proyectos.entrySet()) {
            if(proyectoE.equals(proyectosD.getKey())) {
                sueldo = proyectosD.getValue();
            }
        }
        return sueldo;
    }

    public HashMap<String, String> sueldoDiscriminado(){
        String nombre= "";
        int sueldoDisc= 0;
        double sueldoCom= 0;
        String total= "";

        HashMap<String, String>proyectoSueldo= new HashMap<>();
        for (Map.Entry<String, Integer> proyectosD : proyectos.entrySet()) {
            nombre= proyectosD.getKey();
            sueldoDisc= proyectosD.getValue();
            sueldoCom= sueldoDisc*tipoD.getComision();

            total= "El sueldo discriminado es: "+sueldoDisc+" y el sueldo comisionado es: "+sueldoCom;

            proyectoSueldo.put(nombre, total);
        }
        return proyectoSueldo;
    }
}