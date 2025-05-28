package Almuerzos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pedido {
    private Fecha fechaCreacion;
    Plato platos;
    private PersonaAlmuerzo solicitante;
    private Fecha fechaEntrega;
    private String estadoEntrega;


    public Pedido(int dia, int mes, int anio, String nombre, String apellido, String estadoEntrega){
        this.fechaCreacion=new Fecha(dia, mes, anio);
        this.platos= new Plato();
        this.solicitante= new PersonaAlmuerzo(nombre, apellido);
        this.fechaEntrega=new Fecha(dia, mes, anio);
        this.estadoEntrega=estadoEntrega;
    }

    public Pedido() {
        this.fechaCreacion = new Fecha(0,0,0);
        this.platos=new Plato();
        this.solicitante= new PersonaAlmuerzo("","");
        this.solicitante= new PersonaAlmuerzo();
        this.fechaEntrega = new Fecha(0,0,0);
        this.estadoEntrega="";

    }


    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Fecha getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Fecha fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public PersonaAlmuerzo getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(PersonaAlmuerzo solicitante) {
        this.solicitante = solicitante;
    }

    public Plato getPlatos() {
        return platos;
    }

    public void setPlatos(Plato platos) {
        this.platos = platos;
    }


    public double calcularPrecioConDescuento(Plato plato, PersonaAlmuerzo solicitante) {
        int descuento =  ((Profesor)this.solicitante).getPorcDescuento();
        return plato.getPrecio() - (plato.getPrecio() * descuento / 100);
    }
}