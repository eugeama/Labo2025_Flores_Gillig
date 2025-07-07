package EjercicioRepaso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Ticket {
    public String cliente;
    public String descripcion;
    public LocalDate fechaCreacion;
    public LocalTime horaCreacion;
    public LocalDate fechaFinalizacion;
    public LocalTime horaFinalizacion;
    ArrayList<String>comentarios;
    public Estado estado;

    public Ticket(String cliente, String descripcion, LocalDate fechaCreacion, LocalTime horaCreacion, LocalDate fechaFinalizacion,
                  LocalTime horaFinalizacion, ArrayList<String>comentarios, Estado estado){
        this.cliente=cliente;
        this.descripcion=descripcion;
        this.fechaCreacion=fechaCreacion;
        this.horaCreacion=horaCreacion;
        this.fechaFinalizacion=fechaFinalizacion;
        this.horaFinalizacion=horaFinalizacion;
        this.comentarios=comentarios;
        this.estado= estado.ABIERTO;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public LocalTime getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public LocalTime getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(LocalTime horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    public void modificarEstado(Estado estNuevo){
        this.estado= estNuevo;
    }

    public void agregarComentario(String nuevoCom){
        comentarios.add(nuevoCom);
    }

    public void borrarComentario(String comBorrar){
        for(String comentario: comentarios){
            if(comentario.equals(comBorrar)){
                comentarios.remove(comentario);
            }
        }
    }

    abstract Boolean resolverProblema();
}
