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
