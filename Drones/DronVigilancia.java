package Drones;

import java.util.ArrayList;

public class DronVigilancia extends Dron {
    ArrayList<Dron>contadorVigilancia;

    public DronVigilancia (String nombre, int dia, int mes, int anio, int nivelCarga, int contador, Estado estado, int latitudOrigen, int latitudDestino, int longitudOrigen, int longitudDestino, ArrayList<Dron>contadorVigilancia){
        super(nombre, dia, mes, anio, nivelCarga, contador, estado, latitudOrigen, latitudDestino, longitudOrigen, longitudDestino);
        this.contadorVigilancia= contadorVigilancia;

    }

    public ArrayList<Dron> getContadorVigilancia() {
        return contadorVigilancia;
    }

    public void setContadorVigilancia(ArrayList<Dron> contadorVigilancia) {
        this.contadorVigilancia = contadorVigilancia;
    }

    @Override
    public void recargarBateria(int cont, int carga){
        for(Dron contador: contadorVigilancia){
            if (contador.equals(cont)){
                if(carga <= 20){
                    carga= 100;
                }
                else if (carga > 20 && carga < 100){
                    carga=+10;
                }
            }
        }
    }


}
