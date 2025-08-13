package SistemaPoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Continente extends Lugar{
    HashSet<Pais>paises;

    public Continente(String nombre, int codigo, HashMap<Integer, Integer> contorno, HashSet<Pais>paises){
        super(nombre, codigo, contorno);
        this.paises= paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    @Override
    public int calcularPoblacion(){
        int cantidad= 0;
        for(Pais p: getPaises()){
            if(p.getCodigo()==getCodigo()) {
                cantidad += p.calcularPoblacion();
            }
        }
        return cantidad;
    }

    @Override
    public void alta(int cantidadAg){
        for(Pais p: getPaises()){
            p.alta(cantidadAg);
        }
    }

    @Override
    public void baja(int cantidadAg){
        for(Pais p: getPaises()){
            p.baja(cantidadAg);
        }
    }

    @Override
    public void modificacion(int codigoB, int cantidadN){
        for(Pais p: getPaises()){
            if(p.getCodigo()==codigoB){
                p.modificacion(codigoB, cantidadN);
            }
        }
    }

    public String paisMas(){
        String pais= "";
        int poblacion= 0;

        for(Pais p: getPaises()){
            if(p.calcularPoblacion()>poblacion){
                poblacion= p.calcularPoblacion();
                pais= p.getNombre();
            }
        }
        return "el pais con más población es: "+pais+" con "+poblacion+" habitantes";
    }

    public String paisMenos(){
        String pais= "";
        int poblacion= 0;

        for(Pais p: getPaises()){
            if(poblacion>0 && p.calcularPoblacion()<poblacion){
                poblacion= p.calcularPoblacion();
                pais= p.getNombre();
            }
            else if(p.calcularPoblacion()>poblacion){
                poblacion= p.calcularPoblacion();
                pais= p.getNombre();
            }
        }
        return "el pais con menos población es: "+pais+" con "+poblacion+" habitantes";
    }
}
