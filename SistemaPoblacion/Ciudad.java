package SistemaPoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Ciudad extends Lugar{
    HashSet<Barrio>barrios;

    public Ciudad(String nombre, int codigo, HashSet<Coordenadas> contorno, HashSet<Barrio>barrios){
        super(nombre, codigo, contorno);
        this.barrios= barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    @Override
    public int calcularPoblacion(){
        int cantidad= 0;
        for(Barrio b: barrios){
                cantidad += b.calcularPoblacion();

        }
        return cantidad;
    }

    @Override
    public void alta(int cantidadAg){
        for(Barrio b: barrios){
            b.alta(cantidadAg);
        }
    }

    @Override
    public void baja(int cantidadAg){
        for(Barrio b: barrios){
            b.baja(cantidadAg);
        }
    }

    @Override
    public void modificacion(int codigoB, int cantidadN){
        for(Barrio b: barrios){
            if(b.getCodigo()==codigoB){
                b.modificacion(codigoB, cantidadN);
            }
        }
    }
}
