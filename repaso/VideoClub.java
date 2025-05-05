package repaso;

import java.util.ArrayList;

public class VideoClub {
    ArrayList<Sistema> videoClubs;
    ArrayList<Pelicula> estanterias;


    public VideoClub() {
        ArrayList<Sistema> videoClubs = new ArrayList<Sistema>();
        ArrayList<Pelicula> estanterias = new ArrayList<Pelicula>();
    }


    public ArrayList<Pelicula> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Pelicula> estanterias) {
        this.estanterias = estanterias;
    }


    public ArrayList<Pelicula> nuevaEstanteria(Pelicula nuevaPelicula) {
        estanterias.add(nuevaPelicula);
        return estanterias;

    }

    public ArrayList<Pelicula> eliminaEstanteria(int posicion) {
        estanterias.remove(posicion);
        return estanterias;

    }

    public ArrayList<Pelicula> modificaEstanteria(int posicion, Pelicula nuevaPelicula) {
        for (int i = 0; i < estanterias.size(); i++) {
            if (i + 1 == posicion) {
                estanterias.set(i, nuevaPelicula);
            }
        }
        return estanterias;
    }


    public ArrayList<Sistema> agregarSistema(Sistema nuevoSistema) {
        videoClubs.add(nuevoSistema);
        return videoClubs;

    }

    public ArrayList<Sistema> eliminaVideoClub(int posicion) {
        videoClubs.remove(posicion);
        return videoClubs;
    }

    public ArrayList<Sistema> modificaSistema(int posicion, Sistema nuevoSistema) {
        for (int i = 0; i < videoClubs.size(); i++) {
            if (i + 1 == posicion) {
                videoClubs.set(i, nuevoSistema);
            }
        }
        return videoClubs;
    }


    public int mayorPelicula() {
        int mayorDur = 0;
        String nomEst = "";
        int posicionEst = 0;
        for (Pelicula estanteria : estanterias) {
            if (estanteria.getDuracion() > mayorDur) {
                mayorDur = estanteria.getDuracion();
            }
            nomEst = estanteria.getNombre();
            posicionEst = estanterias.indexOf(estanteria);
        }

        System.out.println("El nombre de la pelicula con mayor duracion es: " + nomEst);
        System.out.println("La estanteria a la que pertenece es: " + posicionEst);
        return mayorDur;
    }


    public int mayoresDeEdad(String nombrePelicula) {
        for (Pelicula pelicula : estanterias) {
            if (nombrePelicula == pelicula.getNombre()) {
                for (Persona actor : pelicula.getActores()) {
                    if (actor.getEdad() > 18) {
                        System.out.println("Nombre del actor: " + actor.getNombre());
                        System.out.println("Edad del actor: " + actor.getEdad());
                    }
                }
            }
        }
        return 0;
    }


    public int directoresRepe() {
        int cantidad = 0;
        for (Pelicula pelicula : estanterias) {

        }
        return 0;
    }


    public String comunasVC(String unaComuna) {
        String laComuna= "";
        for(Sistema videoclub: videoClubs){
            if(unaComuna == videoclub.getComuna()){
                laComuna = videoclub.getComuna();
            }
        }
        return laComuna;
    }

    public int menorDuracion (){
        String direccion= "";
        for(Pelicula pelicula: estanterias){
            if(pelicula.getDuracion() < 90){

            }
        }

        return 0;
    }


    public static void main() {

    }
}