package Biblioteca_Virtual;

public class Libro {
    private String titulo;
    private Autor autor;
    private Generos genero;
    private String pdf;
    private static int descargaDisp = 145;

    public Libro(String titulo, Autor autor, Generos genero){
        this.titulo= titulo;
        this.autor= autor;
        this.genero= genero;
        this.pdf= titulo + ".pdf";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public String getPdf() {
        return pdf;
    }

    public static int getDescargaDisp() {
        return descargaDisp;
    }

    public static void setDescargaDisp(int descargaDisp) {
        Libro.descargaDisp = descargaDisp;
    }
}
