package SistemaPoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Mundo extends Lugar{
    HashSet<Continente>continentes;

    public Mundo(String nombre, int codigo, HashMap<Integer, Integer> contorno, HashSet<Continente>continentes){
        super(nombre, codigo, contorno);
        this.continentes= continentes;
    }

    @Override
    public int calcularPoblacion(){
        int cantidad= 0;
        for(Continente c: continentes){
            if(c.getCodigo()==getCodigo()) {
                cantidad += c.calcularPoblacion();
            }
        }
        return cantidad;
    }

    @Override
    public void alta(int cantidadAg){
        for(Continente c: continentes){
            c.alta(cantidadAg);
        }
    }

    @Override
    public void baja(int cantidadAg){
        for(Continente c: continentes){
            c.baja(cantidadAg);
        }
    }

    @Override
    public void modificacion(int codigoB, int cantidadN){
        for(Continente c: continentes){
            if(c.getCodigo()==codigoB){
                c.modificacion(codigoB, cantidadN);
            }
        }
    }

    public int codigoPoblacion(int codigoI){
        int poblacion= 0;
        for(Continente c: continentes){
            if(c.getCodigo()==codigoI) {
                poblacion = c.calcularPoblacion();
            }
        }

        return poblacion;
    }

    public String continenteMas(){
        String continente= "";
        int poblacion= 0;

        for(Continente c: continentes){
            if(c.calcularPoblacion()>poblacion){
                poblacion= c.calcularPoblacion();
                continente= c.getNombre();
            }
        }
        return "el pais con más población es: "+continente+" con "+poblacion+" habitantes";
    }

    public String continenteMenos(){
        String continente= "";
        int poblacion= 0;

        for(Continente c: continentes){
            if(poblacion>0 && c.calcularPoblacion()<poblacion){
                poblacion= c.calcularPoblacion();
                continente= c.getNombre();
            }
            else if(poblacion== 0 && c.calcularPoblacion()>poblacion){
                poblacion= c.calcularPoblacion();
                continente= c.getNombre();
            }
        }
        return "el pais con menos población es: "+continente+" con "+poblacion+" habitantes";
    }
}
