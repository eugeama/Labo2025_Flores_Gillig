package Campanias;

import repaso2.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador extends Persona implements Mensajero {
    private int cuit;
    private int sueldo;
    private String direccion;
    private LocalTime horarioLaboral;


    public Trabajador(String nombre, String apellido, int dni, LocalDate nacimiento, int cuit, int sueldo, String direccion, LocalTime horarioLaboral){
        super(nombre, apellido, dni, nacimiento);
        this.cuit= cuit;
        this.sueldo= sueldo;
        this.direccion= direccion;
        this.horarioLaboral= horarioLaboral;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String enviarMensaje(){
        String respuesta= "";
        if(LocalTime.now().equals(horarioLaboral)){
            respuesta= "Yo, "+getNombre()+" te invito a que... ";
        }

        return respuesta;
    }
}
