package Drones;

import java.util.ArrayList;

public class DronCarga extends Dron {
    ArrayList<Dron> contadorCarga;
    private int cantCarga;

    public DronCarga(String nombre, int dia, int mes, int anio, int nivelCarga, int contador, Estado estado, int latitudOrigen, int latitudDestino, int longitudOrigen, int longitudDestino, ArrayList<Dron> contadorCarga, int cantCarga) {
        super(nombre, dia, mes, anio, nivelCarga, contador, estado, latitudOrigen, latitudDestino, longitudOrigen, longitudDestino);
        this.contadorCarga = contadorCarga;
        this.cantCarga= cantCarga;
    }

    public ArrayList<Dron> getContadorCarga() {
        return contadorCarga;
    }

    public void setContadorCarga(ArrayList<Dron> contadorCarga) {
        this.contadorCarga = contadorCarga;
    }

    public int getCantCarga() {
        return cantCarga;
    }

    public void setCantCarga(int carga) {
        this.cantCarga = cantCarga;
    }

    @Override
    public void recargarBateria(int cont, int carga){
        for(Dron contador: contadorCarga){
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

    public String mision(int cont, int carga, int cargaPedida){
        if()
        return ;
    }
}
