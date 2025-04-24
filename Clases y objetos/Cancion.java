<<<<<<< HEAD
package Libros;

public class Cancion {
    private String titulo;
    private Persona autor;
    private int posicion;

    public Cancion() {
        this.titulo = "";
        this.autor = new Persona("", 0,"");
        this.posicion=0;
    }

    public Cancion(String titulo, String nomb, int ed, String dir, int pos) {
        this.titulo = titulo;
        this.autor = new Persona(nomb, ed, dir);
        this.posicion=pos;
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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}

=======
public class Cancion {
    private String titulo;
    private Persona autor;

    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = new Persona();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.autor = new Persona();
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = new Persona();
    }
 }
>>>>>>> 79d4a4fd25a0675f94d7ba00f3d013a18391dfdf
