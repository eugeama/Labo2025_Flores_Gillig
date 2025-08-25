package Biblioteca_Virtual;

import repaso2.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Autor extends Persona {

    public Autor(String nombre, int dni, LocalDate nacimiento){
        super(nombre, null, dni, nacimiento, null);
    }
}
