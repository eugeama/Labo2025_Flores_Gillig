package SIstemaPrestamosV;

import java.time.LocalDate;

public class Revista extends Publicacion implements MetodoPrestamo {
    private String distribuidora;

    public Revista(String titulo, String autor, LocalDate anioPublicacion, int stock, String distribuidora) {
        super(titulo, autor, anioPublicacion, stock);
        this.distribuidora = distribuidora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    @Override
    public int calcularMulta(Usuario multado){
        return multado.getCredito()-3500;
    }

    @Override
    public int devolucion(){
        if(getAnioPublicacion().getYear()<2020){
            return 10;
        }
        return 3;
    }
}
