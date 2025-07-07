package EjercicioRepaso;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Gestion {
    ArrayList<Ticket>tickets;
    ArrayList<Desarrollador>desarrolladores;

    public Gestion(ArrayList<Ticket>tickets, ArrayList<Desarrollador>desarrolladores){
        this.tickets= tickets;
        this.desarrolladores= desarrolladores;
    }

    public ArrayList<Desarrollador> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(ArrayList<Desarrollador> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void agregarTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public void agregarDesarrollador(Desarrollador desarrollador){
        desarrolladores.add(desarrollador);
    }

    public void borrarTicket(Ticket ticketB){
        for(Ticket ticket: tickets){
            if(ticket.equals(ticketB) && ticket.getEstado().equals(Estado.RESUELTO)){
                tickets.remove(ticket);
            }
        }
    }

    public int ticketEstado(Estado estadoIng){
        int respuesta= 0;
        for(Ticket ticket: tickets){
            if(ticket.getEstado().equals(estadoIng)){
                respuesta+=1;
            }
        }

        return respuesta;
    }

    public int ticketTotales(){
        return tickets.size();
    }

    public String ticketAntiguo(){
        LocalDate fecha= LocalDate.now();
        String respuesta= " ";
        for(Ticket ticket: tickets){
            if(ticket.getEstado().equals(Estado.ABIERTO) && ticket.getFechaCreacion().isBefore(fecha)){
                fecha=ticket.getFechaCreacion();
                respuesta= ticket.getDescripcion();
            }
        }

        return respuesta;
    }

    public String desarrolladorResuelve(){
        int cantTotal=0;
        String respuesta= "";
        for(Desarrollador desarrollador: desarrolladores){
            if(desarrollador.getTicketAsignado().size()>cantTotal){
                cantTotal= desarrollador.getTicketAsignado().size();
                respuesta= desarrollador.getNombreD()+" "+desarrollador.getApellidoD();
            }
        }

        return respuesta;
    }

    public String desarrolladorAntiguo(){
        String respuesta= "";
        int diasTotales= 0;
        for(Desarrollador desarrollador: desarrolladores) {
            if ( (int) ChronoUnit.DAYS.between(LocalDate.now(), desarrollador.getFechaIngreso())>diasTotales){
                diasTotales= (int) ChronoUnit.DAYS.between(LocalDate.now(), desarrollador.getFechaIngreso());
                respuesta= desarrollador.getNombreD()+""+desarrollador.getApellidoD();
            }
        }

        return respuesta;
    }

    public ArrayList<String> desarrolladoresAsig(Ticket ticketAsig){
        ArrayList<String> respuesta= new ArrayList<>();
        for(Desarrollador desarrollador: desarrolladores){
            if (desarrollador.getTicketAsignado().equals(ticketAsig)){
                respuesta.add(desarrollador.getNombreD()+" "+desarrollador.getNombreD());
            }
        }

        return respuesta;
    }

    public LocalTime tiempoRes(){
         Duration tiempo= Duration.ZERO;
         int cant= 0;
        for(Ticket ticket: tickets){
            if(ticket.getHoraFinalizacion().isBefore(ticket.getHoraCreacion())){
                Duration duracion= Duration.between(ticket.getHoraCreacion(), ticket.getHoraFinalizacion());
                tiempo.plus(duracion);
                cant++;
            }
        }
        Duration total= tiempo.dividedBy(cant);
        Long horas= total.toHours();
        Long minutos= total.toMinutes();

        return LocalTime.of((int) (horas/24), (int) (minutos/60));
    }
}
