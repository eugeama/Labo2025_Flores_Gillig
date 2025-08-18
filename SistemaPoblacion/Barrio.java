package SistemaPoblacion;

import java.util.HashMap;
import java.util.HashSet;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio(String nombre, int codigo, HashSet<Coordenadas> contorno, int poblacion){
        super(nombre, codigo, contorno);
        this.poblacion= poblacion;

    }

    @Override
    public int calcularPoblacion(){
        return this.poblacion;
    }

    @Override
    public void alta(int cantidadAg){
        this.poblacion+=cantidadAg;
    }

    @Override
    public void baja(int cantidadAg){
        this.poblacion-=cantidadAg;
    }

    @Override
    public void modificacion(int codigoB, int cantidadN){
        if(getCodigo()==codigoB){
            this.poblacion=cantidadN;
        }
    }
}
