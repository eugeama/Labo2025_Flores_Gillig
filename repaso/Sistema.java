package repaso;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Videoclub>videoclubs;


    public Sistema(){
        this.videoclubs= new ArrayList<>();
    }


    public void setVideoclubs(ArrayList<Videoclub>videoclubs){
        this.videoclubs= videoclubs;
    }

    public ArrayList<Videoclub> getVideoclubs(){
        return videoclubs;
    }


    public void altaVideoclub(Videoclub videoclubs){
        this.videoclubs.add(videoclubs);
    }

    public void bajaVideoclub(Videoclub videoclubs){
        this.videoclubs.remove(videoclubs);
    }

    public void modificaVideoclub(Videoclub nuevoVideoblubs){
        for(Videoclub videoclub: videoclubs){
            if (videoclub.getDireccion().equals(nuevoVideoblubs.getDireccion())){
                videoclub.setDireccion(nuevoVideoblubs.getDireccion());
                videoclub.setCodigoPostal(nuevoVideoblubs.getCodigoPostal());
                videoclub.setEstanterias(nuevoVideoblubs.getEstanterias());
            }
        }
    }


    public ArrayList<String> dirVideoclub(String comunaParticular){
        ArrayList<String>comunaVideoclubs= new ArrayList<>();
        for(Videoclub videoclub: videoclubs){
            if(videoclub.getComuna().equals(comunaParticular)){
                comunaVideoclubs.add(videoclub.getDireccion());
            }
        }
        return comunaVideoclubs;
    }

    public ArrayList<String> peliculaMenorUbicacion (){
        ArrayList<String>ubicacionVideoClub= new ArrayList<>();
        for(Videoclub videoclub: videoclubs){
            for(Estanteria estanteria: videoclub.getEstanterias()){
                for(Pelicula pelicula: estanteria.getPeliculas()){
                    if(pelicula.getDuracion()<90){
                        String total= "Película:" + pelicula.getNombre() +", Ubicación: "+videoclub.getDireccion();
                        ubicacionVideoClub.add(total);
                    }
                }
            }
        }
        return ubicacionVideoClub;
    }

    public ArrayList<Estanteria> masPeliculas(){
        Integer mayorEstanteria= 0;
        ArrayList<Estanteria>masPeliculas= new ArrayList<>();
        for(Videoclub videoclub: videoclubs){
            if(videoclub.getEstanterias().size()>mayorEstanteria){
                mayorEstanteria= videoclub.getEstanterias().size();
                masPeliculas= videoclub.getEstanterias();
            }
        }
        return masPeliculas;
    }

}
