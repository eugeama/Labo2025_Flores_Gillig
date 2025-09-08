package SistemaArcoFlecha;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Bar>bares;
    private HashSet<Beneficio>beneficios;
    private HashSet<Diana>dianas;

    public Sistema(HashSet<Bar>bares, HashSet<Beneficio>beneficios, HashSet<Diana>dianas){
        this.bares= bares;
        this.beneficios= beneficios;
        this.dianas= dianas;
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public HashMap<String, Integer> beneficiosXBar(){
        HashMap<String, Integer>beneficiosT= new HashMap<>();
        for(Bar b: bares){
            beneficiosT.put(b.getNombre(),b.getBeneficios().size());
        }

        return beneficiosT;
    }

    public String dianaMasP(){
        int mayorPuntaje= 0;
        String diana= "";
        for(Diana diE: dianas){
            if(diE.getPuntajes().keySet().size()>mayorPuntaje){
                diana= diE.getNombreId();
                mayorPuntaje= diE.getPuntajes().keySet().size();
            }
        }
        return "La diana con más puntaje es: "+diana+" con: "+mayorPuntaje+" puntos";
    }
}
