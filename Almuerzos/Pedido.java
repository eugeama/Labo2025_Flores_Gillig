package Almuerzos;
<<<<<<< HEAD
import Autos.Fecha;
import Libros.Persona;
=======
>>>>>>> 7776519b08aa00d9ea4291da2600844c37c58cfc

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pedido {
    private Fecha fechaCreacion;
<<<<<<< HEAD
    ArrayList<Plato> platos;
=======
    Plato platos;
>>>>>>> 7776519b08aa00d9ea4291da2600844c37c58cfc
    private PersonaAlmuerzo solicitante;
    private Fecha fechaEntrega;
    private String estadoEntrega;


    public Pedido(int dia, int mes, int anio, String nombre, String apellido, String estadoEntrega){
        this.fechaCreacion=new Fecha(dia, mes, anio);
<<<<<<< HEAD
        this.platos= new ArrayList<>();
=======
        this.platos= new Plato();
>>>>>>> 7776519b08aa00d9ea4291da2600844c37c58cfc
        this.solicitante= new PersonaAlmuerzo(nombre, apellido);
        this.fechaEntrega=new Fecha(dia, mes, anio);
        this.estadoEntrega=estadoEntrega;
    }

    public Pedido() {
        this.fechaCreacion = new Fecha(0,0,0);
<<<<<<< HEAD
        this.platos=new ArrayList<>();
=======
        this.platos=new Plato();
>>>>>>> 7776519b08aa00d9ea4291da2600844c37c58cfc
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

<<<<<<< HEAD
    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
=======
    public Plato getPlatos() {
        return platos;
    }

    public void setPlatos(Plato platos) {
>>>>>>> 7776519b08aa00d9ea4291da2600844c37c58cfc
        this.platos = platos;
    }


<<<<<<< HEAD
    public int calcularPorcentaje(){
        int porcentajeTotal= 0;
        int porcentaje= 0;
        porcentaje= ((Profesor)this.solicitante).getPorcDescuento()/100;
        porcentajeTotal=
        return porcentajeTotal;
=======
    public double calcularPrecioConDescuento(Plato plato, PersonaAlmuerzo solicitante) {
        int descuento =  ((Profesor)this.solicitante).getPorcDescuento();
        return plato.getPrecio() - (plato.getPrecio() * descuento / 100);
>>>>>>> 7776519b08aa00d9ea4291da2600844c37c58cfc
    }
}