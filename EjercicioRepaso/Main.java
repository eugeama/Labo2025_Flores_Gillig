package EjercicioRepaso;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Hardware h1= new Hardware(6);
        Software s1= new Software(false);
        Hardware h2= new Hardware(0);
        Software s2= new Software(true);

        TicketHardware th1 = new TicketHardware("pipi", "se rompió la máquina",
                LocalDate.of(2024, 05, 02), LocalTime.of(5, 2),
                LocalDate.of(2024, 05, 06), LocalTime.of(7, 6), new ArrayList<>(),
                Estado.CERRADO, h1);

        TicketSoftware ts1 = new TicketSoftware("lola", "error al iniciar sesión",
                LocalDate.of(2024, 05, 03), LocalTime.of(8, 30),
                LocalDate.of(2024, 05, 05), LocalTime.of(10, 45), new ArrayList<>(),
                Estado.EN_PROGRESO, s1);

        TicketHardware th2 = new TicketHardware("juan", "pantalla rota",
                LocalDate.of(2024, 05, 04), LocalTime.of(9, 0),
                LocalDate.of(2024, 05, 07), LocalTime.of(11, 15), new ArrayList<>(),
                Estado.ABIERTO, h2);

        TicketSoftware ts2 = new TicketSoftware("ana", "problemas con el correo",
                LocalDate.of(2024, 05, 01), LocalTime.of(14, 10),
                LocalDate.of(2024, 05, 03), LocalTime.of(16, 5), new ArrayList<>(),
                Estado.CANCELADO, s2);


        th1.agregarComentario("pipi");
        th1.agregarComentario("popi");

        th2.agregarComentario("pipa");
        th2.agregarComentario("pipu");

        ts1.agregarComentario("papa");
        ts1.agregarComentario("pepi");

        ts2.agregarComentario("pupu");
        ts2.agregarComentario("popu");

        Desarrollador d1= new Desarrollador("pablo","ipv6",new ArrayList<>(),LocalDate.of(2020, 2, 10));
        Desarrollador d2= new Desarrollador("pepo","pipi",new ArrayList<>(),LocalDate.of(2021, 2, 10));
        Desarrollador d3= new Desarrollador("tomy","rodriguez",new ArrayList<>(),LocalDate.of(2010, 2, 10));
        Desarrollador d4= new Desarrollador("juana","chuchu",new ArrayList<>(),LocalDate.of(2005, 2, 10));
        Desarrollador d5= new Desarrollador("pepe","papu",new ArrayList<>(),LocalDate.of(2022, 2, 10));
        Desarrollador d6= new Desarrollador("toto","ta",new ArrayList<>(),LocalDate.of(2019, 2, 10));

        d1.agregarTicket(th1);
        d1.agregarTicket(ts1);

        d2.agregarTicket(ts2);

        d3.agregarTicket(ts1);

        d4.agregarTicket(ts1);
        d4.agregarTicket(ts2);

        d5.agregarTicket(th1);
        d5.agregarTicket(th2);

        d6.agregarTicket(th2);
        d6.agregarTicket(ts2);


        Gestion g= new Gestion(new ArrayList<>(), new ArrayList<>());
        g.agregarTicket(th1);
        g.agregarTicket(th2);
        g.agregarTicket(ts1);
        g.agregarTicket(ts2);

        g.agregarDesarrollador(d1);
        g.agregarDesarrollador(d2);
        g.agregarDesarrollador(d3);
        g.agregarDesarrollador(d4);
        g.agregarDesarrollador(d5);
        g.agregarDesarrollador(d6);

        System.out.println(ts1.resolverProblema());

        System.out.println(th1.resolverProblema());

        System.out.println(g.ticketEstado(Estado.ABIERTO));

        System.out.println(g.ticketTotales());

        System.out.println(g.ticketAntiguo());

        System.out.println(g.desarrolladorResuelve());

        System.out.println("Los tickets asignados son: ");
        for(String ticket: g.ticketAsig(d1)) {
            System.out.println(ticket);
        }

        System.out.println(g.desarrolladorAntiguo());

        System.out.println("Los desarrolladores asignados son: ");
        for(String desarrollador: g.desarrolladoresAsig(th1)) {
            System.out.println(desarrollador);
        }

        System.out.println(g.tiempoRes());
    }

}
