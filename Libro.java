package Libros;

public class Libro {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int paginas;
    private String editorial;
    private Fecha fechaPublicacion;

public Libro (String ti, String au, int IS, int pa, String ed, char di, char me, char an) {
    this.titulo = ti;
    this.autor.nombre = au;
    this.ISBN = IS;
    this.paginas = pa;
    this.editorial = ed;
    this.fechaPublicacion.dia= di;
    this.fechaPublicacion.mes=me;
    this.fechaPublicacion.anio=an;


}

public Libro(){
        this.titulo = "El Hambre";
        this.autor.nombre = "Martín Vega";
        this.ISBN = 91218;
        this.paginas = 103;
        this.editorial = "Losada";
        this.fechaPublicacion.dia= 2;
        this.fechaPublicacion.mes=6;
        this.fechaPublicacion.anio=2024;
    }

public void setLibro(){
    this.titulo= "Gloria Maldita";
    this.autor.nombre= "Franco Mastantuono";
    this.ISBN=14318;
    this.paginas=140;
    this.editorial="sillytown";
    this.fechaPublicacion.dia=5;
    this.fechaPublicacion.mes= 2;
    this.fechaPublicacion.anio= 2019;
}

    public String getTitulo () {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPaginas(){
        return paginas;
    }

    public String getEditorial(){
        return editorial;
    }
    public Fecha getfechaPublicaciondia(){
        return fechaPublicacion.dia;
    }
    public Fecha getfechaPublicacionmes(){
        return fechaPublicacion.mes;
    }
    public Fecha getfechaPublicacionanio(){
        return fechaPublicacion.anio;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }
    public void setAutor(Persona autor) {
        this.autor=autor;
    }
    public void setISBN(int ISBN) {
        this.ISBN=ISBN;
    }
    public void setPaginas(int paginas) {
        this.paginas=paginas;
    }
    public void setEditorial(String editorial) {
        this.editorial=editorial;
    }
    public void setFechaPublicaciondia(Fecha fechaPublicaciondia) {
        this.fechaPublicacion.dia=fechaPublicaciondia;
    }
    public void setFechaPublicacionmes(Fecha fechaPublicacionmes) {
        this.fechaPublicacion.mes=fechaPublicacionmes;
    }
    public void setFechaPublicacionanio(Fecha fechaPublicacionanio) {
        this.fechaPublicacion.anio=fechaPublicacionanio;
    }



    public void mostrarInfo(String ti,Persona au, String IS, int pa, String ed, Fecha fe){
        System.out.println("Titulo del libro: "+ti);
        System.out.println("Autor del libro: "+au);
        System.out.println("ISBN del libro: "+IS);
        System.out.println("número de páginas del libro: "+pa);
        System.out.println("Editorial del libro: "+ed);
        System.out.println("fecha de publicación del libro: "+fe);
    }

    public boolean anteriorA(Libro libro1, Libro libro2){
        if (libro1.fechaPublicacion.dia <libro2.fechaPublicacion.dia){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("El hambre", "vago", 194039, 129, "tontotown", 2, 3, 2016);
        Libro libro2 = new Libro();

        System.out.println("Nombre del libro: "+libro1.getTitulo());
        System.out.println("Autor del libro: "+libro1.getAutor());
        System.out.println("ISBN del libro: "+libro1.getISBN());
        System.out.println("Cantidad de páginas del libro: "+libro1.getPaginas());
        System.out.println("Editorial del libro: "+libro1.getEditorial());
        System.out.println("Fecha de publicación: "+libro1.getfechaPublicaciondia()+"/"+libro1.getfechaPublicacionmes()+"/"+libro1.getfechaPublicacionanio());

         System.out.println("Nombre del libro: "+libro2.titulo);
        System.out.println("Autor del libro: "+libro2.autor);
        System.out.println("ISBN del libro: "+libro2.ISBN);
        System.out.println("Cantidad de páginas del libro: "+libro2.paginas);
        System.out.println("Editorial del libro: "+libro2.editorial);
        System.out.println("Fecha de publicación: "+libro2.fechaPublicacion.dia+"/"+libro2.fechaPublicacion.mes+"/"+libro2.fechaPublicacion.anio);
    }
}
