package repaso;

import java.sql.Time;
import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String genero;
    private int duracion;
    ArrayList<Persona>directores;
    ArrayList<Persona>actores;
    ArrayList<String>idiomas;


    public Pelicula (String nombre, String genero, int duracion){
        this.nombre= nombre;
        this.genero= genero;
        this.duracion= duracion;
        ArrayList<String>directores = new ArrayList<String>();
        ArrayList<String>actores= new ArrayList<String>();
        ArrayList<String>idiomas= new ArrayList<String>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Persona> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Persona> directores) {
        this.directores = directores;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }
}
