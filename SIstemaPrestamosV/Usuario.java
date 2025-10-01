package SIstemaPrestamosV;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario extends Persona {
    private String mail;
    private int credito;
    private HashSet<String> publisLeidas;
    private HashMap<Prestamo, Integer> publisPrestadas;

    public Usuario(String nombre, String apellido, LocalDate nacimiento, String mail, int credito, HashSet<String> publisLeidas, HashMap<Prestamo, Integer> publisPrestadas){
        super(nombre, apellido, nacimiento);
        this.mail= mail;
        this.credito= credito;
        this.publisLeidas= publisLeidas;
        this.publisPrestadas= publisPrestadas;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public HashSet<String> getPublisLeidas() {
        return publisLeidas;
    }

    public void setPublisLeidas(HashSet<String> publisLeidas) {
        this.publisLeidas = publisLeidas;
    }

    public HashMap<Prestamo, Integer> getPublisPrestadas() {
        return publisPrestadas;
    }

    public void setPublisPrestadas(HashMap<Prestamo, Integer> publisPrestadas) {
        this.publisPrestadas = publisPrestadas;
    }
}
