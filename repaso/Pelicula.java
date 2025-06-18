package repaso;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private  String genero;
    private Integer duracion;
    ArrayList<Persona> directores;
    ArrayList<Persona>actores;
    ArrayList<String>idiomas;


    public Pelicula(String nombre, String genero, int duracion){
        this.nombre= nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.directores= new ArrayList<>();
        this.actores= new ArrayList<>();
        this.idiomas= new ArrayList<>();
    }

    public Pelicula(){
        this.nombre= "";
        this.genero = "";
        this.duracion = null;
        this.directores= new ArrayList<>();
        this.actores= new ArrayList<>();
        this.idiomas= new ArrayList<>();
    }


    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setGenero (String genero){
        this.genero= genero;
    }

    public String getGenero(){
        return genero;
    }

    public void setDuracion (int duracion){
        this.duracion= duracion;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setDirectores (ArrayList<Persona> directores){
        this.directores= directores;
    }

    public ArrayList<Persona> getDirectores(){
        return directores;
    }

    public void setActores (ArrayList<Persona> actores){
        this.actores= actores;
    }

    public ArrayList<Persona> getActores(){
        return actores;
    }

    public void setIdiomas (ArrayList<String> idiomas){
        this.idiomas= idiomas;
    }

    public ArrayList<String> getIdiomas(){
        return idiomas;
    }


    public ArrayList<Persona> actoresMayores(Pelicula pelicula){
        int edad= 0;
        ArrayList<Persona>personaMayor= new ArrayList<>();
        for(Persona actor: actores){
            if(actor.getEdad() == edad){
                edad= actor.getEdad();
                personaMayor.add(actor);
            }
        }
        return personaMayor;
    }
}
