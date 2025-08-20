package Libros;

public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion() {
        this.titulo = "";
        this.autor = new Persona("", 0,"");
    }

    public Cancion(String titulo, String nomb, int ed, String dir) {
        this.titulo = titulo;
        this.autor = new Persona(nomb, ed, dir);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo= titulo;
    }


    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

}