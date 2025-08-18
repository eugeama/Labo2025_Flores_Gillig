package SistemaPoblacion;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Mundo {
    private HashSet<Continente>continentes;
    private HashMap<Integer, Lugar>lugarCodigo;

    public Mundo(HashSet<Continente> continentes, HashMap<Integer, Lugar>lugarCodigo) {
        this.continentes = continentes;
        this.lugarCodigo = lugarCodigo;
    }

    public Mundo() {
        this.continentes = new HashSet<>();
        this.lugarCodigo = new HashMap<>();
    }

    public int codigoLugar(int codigo){
        return this.lugarCodigo.get(codigo).calcularPoblacion();
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
