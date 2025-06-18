package Libros;

public class Cancion extends Persona{
    private String titulo;

    public Cancion() {
        super("", 0,"");
        this.titulo = "";
    }

    public Cancion(String titulo, String nomb, int ed, String dir) {
        super(nomb, ed, dir);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo= titulo;
    }

}