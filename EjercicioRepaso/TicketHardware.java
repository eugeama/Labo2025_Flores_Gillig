package EjercicioRepaso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class TicketHardware extends Ticket {
    public Hardware dispositivo;

    public TicketHardware(String cliente, String descripcion, LocalDate fechaCreacion, LocalTime horaCreacion, LocalDate fechaFinalizacion,
                          LocalTime horaFinalizacion, ArrayList<String> comentarios, Estado estado, Hardware dispositivo){
        super(cliente, descripcion, fechaCreacion, horaCreacion, fechaFinalizacion, horaFinalizacion, comentarios, estado);
        this.dispositivo= dispositivo;

    }

    public Hardware getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Hardware dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    Boolean resolverProblema(){
        Boolean respuesta= false;
        if(dispositivo.cantRepuestos > 0 && estado.equals(Estado.EN_PROGRESO)){
            estado=Estado.RESUELTO;
            respuesta= true;
        }
        return respuesta;
    }

}
