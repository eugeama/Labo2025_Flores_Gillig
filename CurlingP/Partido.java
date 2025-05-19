package CurlingP;

public class Partido extends Fecha{
    private String TurnoPar;
    private Equipo equipo1;
    private Equipo equipo2;


    public Partido(int dia, int mes, int anio, Equipo equip1, Equipo equip2, String TurnoP) {
        super(dia, mes, anio);
        this.TurnoPar = TurnoP;
        this.equipo1 = equip1;
        this.equipo2 = equip2;
    }


    public String getTurnoPar() {
        return TurnoPar;
    }

    public void setTurnoPar(String turnoPar) {
        TurnoPar = turnoPar;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
}
