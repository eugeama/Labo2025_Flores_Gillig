package EjercicioRepaso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class TicketSoftware extends Ticket {
    public Software app;
    public static int intentos= 3;

    public TicketSoftware(String cliente, String descripcion, LocalDate fechaCreacion, LocalTime horaCreacion, LocalDate fechaFinalizacion,
                          LocalTime horaFinalizacion, ArrayList<String> comentarios, Estado estado, Software app){
        super(cliente, descripcion, fechaCreacion, horaCreacion, fechaFinalizacion, horaFinalizacion, comentarios, estado);
        this.app= app;
    }

    public Software getApp() {
        return app;
    }

    public void setApp(Software app) {
        this.app = app;
    }

    public static int getIntentos() {
        return intentos;
    }

    public static void setIntentos(int intentos) {
        TicketSoftware.intentos = intentos;
    }

    @Override
    Boolean resolverProblema(){
        Boolean respuesta= false;
        if(app.parcheAplicable.equals(true) && intentos > 0){
            estado=Estado.RESUELTO;
            respuesta= true;
        }

        return respuesta;
    }
}
