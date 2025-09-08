package SistemaArcoFlecha;

import java.util.HashSet;

public class Bar {
    private String nombre;
    private HashSet<Diana>dianas;
    private int clientesAyF;
    private int recaudado;
    private HashSet<Beneficio>beneficios;
    private HashSet<Acumulable>beneficiosA;

    public Bar(String nombre, HashSet<Diana>dianas, int clientesAyF, int recaudado, HashSet<Beneficio>beneficios, HashSet<Acumulable>beneficiosA){
        this.nombre= nombre;
        this.dianas= dianas;
        this.clientesAyF= clientesAyF;
        this.recaudado= recaudado;
        this.beneficios= beneficios;
        this.beneficiosA= beneficiosA;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public int getClientesAyF() {
        return clientesAyF;
    }

    public void setClientesAyF(int clientesAyF) {
        this.clientesAyF = clientesAyF;
    }

    public int getRecaudado() {
        return recaudado;
    }

    public void setRecaudado(int recaudado) {
        this.recaudado = recaudado;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<Acumulable> getBeneficiosA() {
        return beneficiosA;
    }

    public void setBeneficiosA(HashSet<Acumulable> beneficiosA) {
        this.beneficiosA = beneficiosA;
    }
}
