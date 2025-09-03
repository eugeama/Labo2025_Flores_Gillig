package Campanias;

import repaso2.Persona;

import java.time.LocalDate;

public class Trabajador extends Persona {
    private int cuit;
    private int sueldo;
    private String direccion;


    public Trabajador(String nombre, String apellido, int dni, LocalDate nacimiento, int cuit, int sueldo, String direccion){
        super(nombre, apellido, dni, nacimiento);
        this.cuit= cuit;
        this.sueldo= sueldo;
        this.direccion= direccion;
    }
}
