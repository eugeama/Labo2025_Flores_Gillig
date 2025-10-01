package SIstemaPrestamosV;

import java.time.LocalDate;

public class Libro extends Publicacion implements MetodoPrestamo {
    private boolean saga;

    public Libro(String titulo, String autor, LocalDate anioPublicacion, int stock, boolean saga) {
        super(titulo, autor, anioPublicacion, stock);
        this.saga = saga;
    }

    public boolean isSaga() {
        return saga;
    }

    public void setSaga(boolean saga) {
        this.saga = saga;
    }

    @Override
    public int calcularMulta(Usuario multado){
        return multado.getCredito()-7500;
    }

    @Override
    public int devolucion(){
        return 15;
    }
}
