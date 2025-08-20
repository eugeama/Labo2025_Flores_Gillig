package CurlingP;

public class Jugador extends Persona2 {

    private Boolean esCapitan;
    private int numCamiseta;

    public Jugador(String nombreJug, String apellidoJug, int dia, int mes, int anio, int numCamiseta, Boolean esCap) {
        super(dia,mes,anio,nombreJug,apellidoJug);
        this.esCapitan=esCap;
        this.numCamiseta= numCamiseta;
    }


    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public Boolean getEsCapitan() {
        return esCapitan;
    }

    public void setEsCapitan(Boolean esCapitan) {
        this.esCapitan = esCapitan;
    }

    public static void main(String[] args) {

    }
}
