package Edificios;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Edificio>edificios;


    public Sistema(ArrayList<Edificio>edificios){

        this.edificios=edificios;
    }


    public ArrayList<Edificio> getEdificios() {

        return edificios;
    }

    public void setEdificios(ArrayList<Edificio> edificios) {

        this.edificios = edificios;
    }

    public int recorreDHumo(){
        for(Edificio edificio: edificios){
            for(DetectorHumo detector: edificio.detectoresHumo){

            }
        }
        return;
    }
}
