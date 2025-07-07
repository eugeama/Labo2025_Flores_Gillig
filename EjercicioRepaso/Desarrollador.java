package EjercicioRepaso;

import java.time.LocalDate;
import java.util.ArrayList;

public class Desarrollador {
    public String nombreD;
    public String apellidoD;
    ArrayList<Ticket>ticketAsignado;
    public LocalDate fechaIngreso;

    public Desarrollador(String nombreD, String apellidoD, ArrayList<Ticket>ticketAsignado, LocalDate fechaIngreso) {
        this.nombreD = nombreD;
        this.apellidoD= apellidoD;
        this.ticketAsignado= ticketAsignado;
        this.fechaIngreso= fechaIngreso;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public String getApellidoD() {
        return apellidoD;
    }

    public void setApellidoD(String apellidoD) {
        this.apellidoD = apellidoD;
    }

    public ArrayList<Ticket> getTicketAsignado() {
        return ticketAsignado;
    }

    public void setTicketAsignado(ArrayList<Ticket> ticketAsignado) {
        this.ticketAsignado = ticketAsignado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void agregarTicket(Ticket nuevoT){
        ticketAsignado.add(nuevoT);
    }
}
