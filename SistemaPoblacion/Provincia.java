package SistemaPoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Provincia extends Lugar{
    HashSet<Ciudad>ciudades;

    public Provincia(String nombre, int codigo, HashMap<Integer, Integer> contorno, HashSet<Ciudad>ciudades){
        super(nombre, codigo, contorno);
        this.ciudades= ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public int calcularPoblacion(){
        int cantidad= 0;
        for(Ciudad c: ciudades){
            if(c.getCodigo()==getCodigo()) {
                cantidad += c.calcularPoblacion();
            }
        }
        return cantidad;
    }

    @Override
    public void alta(int cantidadAg){
        for(Ciudad c: ciudades){
            c.alta(cantidadAg);
        }
    }

    @Override
    public void baja(int cantidadAg){
        for(Ciudad c: ciudades){
            c.baja(cantidadAg);
        }
    }

    @Override
    public void modificacion(int codigoB, int cantidadN){
        for(Ciudad c: ciudades){
            if(c.getCodigo()==codigoB){
                c.modificacion(codigoB, cantidadN);
            }
        }
    }
}
