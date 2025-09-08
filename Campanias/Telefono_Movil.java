package Campanias;

public class Telefono_Movil implements Mensajero {
    private int numeroSerie;
    private String fabricante;
    private String modelo;
    private Compania compania;
    private int numeroCelular;
    private boolean prendido;
    private int credito;

    public Telefono_Movil(int numeroSerie, String fabricante, String modelo, Compania compania, int numeroCelular, boolean prendido, int credito){
        this.numeroSerie= numeroSerie;
        this.fabricante= fabricante;
        this.modelo= modelo;
        this.compania= compania;
        this.numeroCelular= numeroCelular;
        this.prendido= prendido;
        this.credito= credito;
    }



    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String enviarMensaje(){
        String respuesta= "";
        if(prendido || credito>0){
            respuesta= "Conectando con antena más cercana... ";
        }
        return respuesta;
    }
}
