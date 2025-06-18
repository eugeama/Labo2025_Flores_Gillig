package repaso;

import java.util.ArrayList;

public class Videoclub {
    private String direccion;
    private Integer codigoPostal;
    private String comuna;
    ArrayList<Estanteria>estanterias;


    public Videoclub(String direccion, int codigoPostal, String comuna){
        this.direccion= direccion;
        this.codigoPostal= codigoPostal;
        this.comuna= comuna;
        this.estanterias= new ArrayList<>();
    }

    public Videoclub(){
        this.direccion= "";
        this.codigoPostal= null;
        this.comuna= "";
        this.estanterias= new ArrayList<>();
    }


    public void setDireccion(String direccion){
        this.direccion= direccion;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setCodigoPostal(int codigoPostal){
        this.codigoPostal= codigoPostal;
    }

    public int getCodigoPostal(){
        return codigoPostal;
    }

    public void setEstanterias(ArrayList<Estanteria>estanterias){
        this.estanterias= estanterias;
    }

    public ArrayList<Estanteria> getEstanterias(){
        return estanterias;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void altaEstanteria(Estanteria estanteria){
        this.estanterias.add(estanteria);
    }

    public void bajaEstanteria(Estanteria estanteria){
        this.estanterias.remove(estanteria);
    }

    public void actualizarEstanteria(Estanteria nuevaEstanteria){
        for(Estanteria estanteria: estanterias){
            if(estanteria.getNumero().equals(nuevaEstanteria.getNumero())){
                estanteria.setNumero(nuevaEstanteria.getNumero());
                estanteria.setPeliculas(nuevaEstanteria.getPeliculas());
            }
        }
    }


    public String peliculaMayorDuracion (){
        int peliculaMayor= 0;
        Pelicula peliculaMayorTotal= null;
        int numEstanteria= -1;

        for(Estanteria estanteria: estanterias) {
            for (Pelicula pelicula : estanteria.peliculas) {
                if (pelicula.getDuracion() > peliculaMayor) {
                    peliculaMayor= pelicula.getDuracion();
                    peliculaMayorTotal= pelicula;
                    numEstanteria= estanteria.getNumero();

                }
            }
        }
        return ("la pelicula con mayor duración es: "+peliculaMayorTotal.getNombre()+" de la estantería: "+numEstanteria);
    }

    public ArrayList<String> peliculaPorGenero(String genero){
        ArrayList<String> peliculasGenero= new ArrayList<>();
        for(Estanteria estanteria: estanterias){
            for(Pelicula pelicula : estanteria.peliculas){
                if(pelicula.getGenero().equals(genero)){
                    peliculasGenero.add(pelicula.getNombre());
                }
            }
        }
        return peliculasGenero;
    }
}
