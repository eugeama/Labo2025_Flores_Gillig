package Biblioteca_Virtual;

import repaso2.Persona;

import java.time.LocalDate;
import java.util.HashSet;

public class Usuario extends Persona {
    private String mail;
    private Membresias membresia;

    public Usuario(String nombre, int dni, LocalDate nacimiento, String mail, Membresias membresia) {
        super(nombre, null, dni, nacimiento, null);
        this.mail= mail;
        this.membresia= membresia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Membresias getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresias membresia) {
        this.membresia = membresia;
    }
}
