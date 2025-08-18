package SistemaPoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Pais extends Lugar{
    HashSet<Provincia>provincias;

    public Pais(String nombre, int codigo, HashSet<Coordenadas> contorno, HashSet<Provincia>provincias){
        super(nombre, codigo, contorno);
        this.provincias= provincias;
    }

    public Pais(){
        super(" ", 0, new HashSet<>());
        this.provincias= new HashSet<>();
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    @Override
    public int calcularPoblacion(){
        int cantidad= 0;
        for(Provincia p: provincias){
                cantidad += p.calcularPoblacion();
        }
        return cantidad;
    }

    @Override
    public void alta(int cantidadAg){
        for(Provincia p: provincias){
            p.alta(cantidadAg);
        }
    }

    @Override
    public void baja(int cantidadAg){
        for(Provincia p: provincias){
            p.baja(cantidadAg);
        }
    }

    @Override
    public void modificacion(int codigoB, int cantidadN){
        for(Provincia p: provincias){
            if(p.getCodigo()== codigoB){
                p.modificacion(codigoB, cantidadN);
            }
        }
    }
}
