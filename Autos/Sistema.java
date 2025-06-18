package Autos;


import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    ArrayList<Auto> autos;
    ArrayList<Camioneta> camionetas;
    ArrayList<Bicicleta> bicicletas;


    public Sistema(ArrayList<Auto> autos, ArrayList<Camioneta> camionetas, ArrayList<Bicicleta> bicicletas) {
        this.autos = autos;
        this.camionetas = camionetas;
        this.bicicletas = bicicletas;
    }

    public Sistema() {
        this.autos= new ArrayList<Auto>();
        this.camionetas = new ArrayList<Camioneta>();
        this.bicicletas = new ArrayList<Bicicleta>();
    }


    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public ArrayList<Camioneta> getCamionetas() {
        return camionetas;
    }

    public void setCamionetas(ArrayList<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }


    public String masCantidad() {
        int cantAutos = 0;
        int cantCamionetas = 0;
        int cantBicicletas = 0;
        int masCant = 0;
        String nombre = "";

        for (Auto auto : autos) {
            cantAutos++;
        }
        for (Camioneta camioneta : camionetas) {
            cantCamionetas++;
        }
        for (Bicicleta bicicleta : bicicletas) {
            cantBicicletas++;
        }

        if (cantCamionetas > cantAutos && cantCamionetas > cantBicicletas) {
            nombre = "Camionetas";
        }
        if (cantAutos > cantCamionetas && cantAutos > cantBicicletas) {
            nombre = "Autos";
        }
        if (cantBicicletas > cantAutos && cantBicicletas > cantCamionetas) {
            nombre = "Bicicletas";
        }

        return nombre;
    }

    public String aniadirCarga(int carga) {
        int capacidad = 0;
        String posibilidad= "";
        if(capacidad>carga || capacidad!=carga){
            capacidad+=carga;
            posibilidad= "Carga ingresada con exito";
        }
        else{
            posibilidad= "No se puede ingresar la carga por ser muy pesada";
        }
        return posibilidad;
    }

    public float porcentajeCarga(){
        int porcentaje= 0;
        int descapotable= 0;
        int totales= 0;

        for(Auto auto: autos){
            totales++;
            if(auto.isDescapotable()){
                descapotable++;
            }
        }
        porcentaje=descapotable/totales*100;
        return porcentaje;
    }

    public static void main(String[] args) {
        Sistema sistema= new Sistema();

        System.out.println("El vehículo que posee más cantidades es: "+sistema.masCantidad());
        System.out.println(sistema.aniadirCarga(50));
        System.out.println("El porcentaje de autos descapotables es: "+ sistema.porcentajeCarga());
    }
}