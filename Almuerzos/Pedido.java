package Almuerzos;
import Autos.Fecha;

public class Pedido {
    private Fecha fechaCreacion;
    private Boolean alumno;
    private Boolean profesor;
    private PersonaAlmuerzo solicitante;
    private Fecha fechaEntrega;
    private String estadoEntrega;


    public Pedido(String nombre, int precio, int dia, int mes, int anio, Boolean alumno, Boolean profesor, String estadoEntrega){
        this.fechaCreacion=new Fecha(dia, mes, anio);
        this.alumno= alumno;
        this.profesor= profesor;
        this.fechaEntrega=new Fecha(dia, mes, anio);
        this.estadoEntrega=estadoEntrega;
    }

    public Pedido() {
        super("",0);
        this.fechaCreacion = new Fecha(0,0,0);
        this.alumno =false;
        this.profesor =false;
        this.solicitante= new PersonaAlmuerzo();
        this.fechaEntrega = new Fecha(0,0,0);
        this.estadoEntrega="";

    }


    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Boolean getAlumno() {
        return alumno;
    }

    public void setAlumno(Boolean alumno) {
        this.alumno = alumno;
    }

    public Boolean getProfesor() {
        return profesor;
    }

    public void setProfesor(Boolean profesor) {
        this.profesor = profesor;
    }

    public Fecha getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Fecha fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstadoEntrega() {
        return estadoEntrega;
    }

    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }

    public PersonaAlmuerzo getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(PersonaAlmuerzo solicitante) {
        this.solicitante = solicitante;
    }


    public void
}