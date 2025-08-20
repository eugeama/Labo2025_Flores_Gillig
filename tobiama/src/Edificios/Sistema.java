package Edificios;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Edificio>edificios;


    public Sistema(ArrayList<Edificio>edificios){
        this.edificios=edificios;
    }

    public Sistema(){
        this.edificios=new ArrayList<>();
    }


    public ArrayList<Edificio> getEdificios() {

        return edificios;
    }

    public void setEdificios(ArrayList<Edificio> edificios) {

        this.edificios = edificios;
    }

    public String inforSensores(int numeroSensor){
        String info= "";
        for(Edificio e: edificios){
            info= "El estado del dispositivo es: "+e.cantTotal().get(numeroSensor).getEstado();
        }
        return info;
    }
}
