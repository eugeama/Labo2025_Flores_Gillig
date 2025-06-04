package CurlingP;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String barrioEquipo;
    private ArrayList<Jugador>equipo;
    private Turno disponibilidad;
    private int partidosJugados;

    public Equipo(String nombreEq, String barrioEq, Turno disp, int partJugados) {
        this.nombreEquipo = nombreEq;
        this.barrioEquipo = barrioEq;
        this.disponibilidad = disp;
        this.equipo = new ArrayList<Jugador>();
        this.partidosJugados= partJugados;
    }


    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getBarrioEquipo() {
        return barrioEquipo;
    }

    public void setBarrioEquipo(String barrioEquipo) {
        this.barrioEquipo = barrioEquipo;
    }

    public ArrayList<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Jugador> equipo) {
        this.equipo = equipo;
    }

    public Turno getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Turno disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
}
