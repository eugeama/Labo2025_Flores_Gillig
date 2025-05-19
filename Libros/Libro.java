package Libros;
 
public class Libro extends Persona2{
    private String titulo;
    private int ISBN;
    private int paginas;
    private String editorial;
    private Fecha fechaPublicacion;

public Libro (String titulo, String nombre, String apellido, int ISBN, int pagina, String editorial, int dia, int mes, int anio) {
    super(dia,mes,anio,nombre,apellido);
    this.titulo = titulo;
    this.ISBN = ISBN;
    this.paginas = pagina;
    this.editorial = editorial;
    this.fechaPublicacion.dia= dia;
    this.fechaPublicacion.mes=mes;
    this.fechaPublicacion.anio=anio;


}

public Libro(){
        super(2,5,1950,"pepe","pipi");
        this.titulo = "El Hambre";
        this.ISBN = 91218;
        this.paginas = 103;
        this.editorial = "Losada";
        this.fechaPublicacion.dia= 2;
        this.fechaPublicacion.mes=6;
        this.fechaPublicacion.anio=2024;
    }

public void setLibro(){
    this.titulo= "Gloria Maldita";
    this.setNombre("pepe");
    this.setApellido("Mastantuono");
    this.setDia(2);
    this.setMes(5);
    this.setAnio(1592);
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

    public int getISBN() {
        return ISBN;
    }

    public int getPaginas(){
        return paginas;
    }

    public String getEditorial(){
        return editorial;
    }
    public int getfechaPublicaciondia(){

    return fechaPublicacion.dia;
    }
    public int getfechaPublicacionmes(){

    return fechaPublicacion.mes;
    }
    public int getfechaPublicacionanio(){

    return fechaPublicacion.anio;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
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
    public void setFechaPublicaciondia(int fechaPublicaciondia) {

    this.fechaPublicacion.dia=fechaPublicaciondia;
    }
    public void setFechaPublicacionmes(int fechaPublicacionmes) {

    this.fechaPublicacion.mes=fechaPublicacionmes;
    }
    public void setFechaPublicacionanio(int fechaPublicacionanio) {

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
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        System.out.println("Nombre del libro: "+libro1.getTitulo());
        System.out.println("Autor del libro: "+libro1.getNombre());
        System.out.println("ISBN del libro: "+libro1.getISBN());
        System.out.println("Cantidad de páginas del libro: "+libro1.getPaginas());
        System.out.println("Editorial del libro: "+libro1.getEditorial());
        System.out.println("Fecha de publicación: "+libro1.getfechaPublicaciondia()+"/"+libro1.getfechaPublicacionmes()+"/"+libro1.getfechaPublicacionanio());

         System.out.println("Nombre del libro: "+libro2.titulo);
        System.out.println("Autor del libro: "+libro2.getNombre());
        System.out.println("ISBN del libro: "+libro2.ISBN);
        System.out.println("Cantidad de páginas del libro: "+libro2.paginas);
        System.out.println("Editorial del libro: "+libro2.editorial);
        System.out.println("Fecha de publicación: "+libro2.fechaPublicacion.dia+"/"+libro2.fechaPublicacion.mes+"/"+libro2.fechaPublicacion.anio);
    }
}
