package repaso2;

import Libros.Cancion;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class BancoNacion {
    private String direccion;
    private boolean primito;
    private boolean gillig;
    ArrayList<Persona>trabajadores;


    public BancoNacion(String direccion, boolean primito, boolean gillig) {
        this.direccion=direccion;
        this.primito = primito;
        this.gillig=gillig;
        this.trabajadores= new ArrayList<Persona>();
    }

    public BancoNacion(){
        this.trabajadores = new ArrayList<Persona>();
        this.trabajadores.add(new Persona());
        this.trabajadores.add(new Persona("Miguel", "Lopez", 32987990,
                LocalDate.of(1985, 10, 12), LocalDate.of(2020, 5, 8)));
        this.trabajadores.add(new Persona("Juana", "Gomez", 39987990,
                LocalDate.of(1986, 7, 28)));
        this.trabajadores.add(new Persona("Candela", "Navarro", 40987990,
                LocalDate.of(1993, 2, 4), LocalDate.of(2017, 5, 25)));

    }


    public boolean isPrimito() {
        return primito;
    }

    public void setPrimito(boolean primito) {
        this.primito = primito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isGillig() {
        return gillig;
    }

    public void setGillig(boolean gillig) {
        this.gillig = gillig;
    }


    public void agregarTrabajador(Persona trabajador) {
        trabajadores.add(trabajador);
    }

    public int cantidadTrabajadores() {
        int cantTrabajadores= 0;
        for(Persona trabajador : trabajadores){
            cantTrabajadores++;
        }
        return cantTrabajadores;
    }

    public Persona empleadoMayorAntiguedad() {
        Persona mayorAntiguedad= new Persona();
        for(Persona trabajador : trabajadores){
            if (mayorAntiguedad.getAntiguedad().getYear()>trabajador.getAntiguedad().getYear()){
                mayorAntiguedad=trabajador;
            }
        }
        return mayorAntiguedad;
    }
}
