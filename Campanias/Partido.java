package Campanias;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private int afiliados;
    private HashSet<Mensajero> mensajeros;

    public Partido(String nombre, String direccion, int afiliados, HashSet<Mensajero>mensajeros){
        this.nombre= nombre;
        this.direccion= direccion;
        this.afiliados= afiliados;
        this.mensajeros= mensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(int afiliados) {
        this.afiliados = afiliados;
    }

    public HashSet<Mensajero> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Mensajero> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero(Mensajero mensajeroN){
        mensajeros.add(mensajeroN);
    }

    public void hacerCampania(){
        for(Mensajero mens: mensajeros){
            if(!mens.enviarMensaje().equals("")) {
                System.out.println(mens.enviarMensaje() + " Vote por el partido para un mejor futuro");
            }
        }
    }
}
