package repaso;

import java.util.ArrayList;

public class Estanteria {
    private Integer numero;
    ArrayList<Pelicula> peliculas;


    public Estanteria(int numero){
        this.numero= numero;
        this.peliculas= new ArrayList<>();
    }

    public Estanteria(){
        this.numero= null;
        this.peliculas= new ArrayList<>();
    }


    public void setNumero(Integer numero){
        this.numero= numero;
    }

    public Integer getNumero(){
        return numero;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas){
        this.peliculas= peliculas;
    }

    public ArrayList<Pelicula> getPeliculas(){
        return peliculas;
    }

    public void altaPeliculas(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    public void bajaPeliculas (Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }

    public void actualizarPeliculas (Pelicula nuevaPelicula){
        for(Pelicula pelicula: peliculas){
            if(pelicula.getNombre().equals(nuevaPelicula.getNombre())){
                pelicula.setNombre(nuevaPelicula.getNombre());
                pelicula.setGenero(nuevaPelicula.getGenero());
                pelicula.setDuracion(nuevaPelicula.getDuracion());
                pelicula.setDirectores(nuevaPelicula.getDirectores());
                pelicula.setActores(nuevaPelicula.getActores());
                pelicula.setIdiomas(nuevaPelicula.getIdiomas());
            }
        }
    }


    public ArrayList<Persona> directorEstanteria (){
        ArrayList<Persona> todosDirectores= new ArrayList<>();
        ArrayList<Persona>directoresRepetidos= new ArrayList<>();
        for(Pelicula pelicula: peliculas){
            for(Persona director: pelicula.getDirectores()){
                if(todosDirectores.contains(director) && !directoresRepetidos.contains(director)){
                    directoresRepetidos.add(director);
                }
                else{
                    todosDirectores.add(director);
                }
            }
        }
        return directoresRepetidos;
    }
}
