package SIstemaPrestamosV;

import java.time.LocalDate;
import java.time.LocalTime;

public class Audiolibro extends Publicacion {
    private int peso;
    private LocalTime duracion;

    public Audiolibro(String titulo, String autor, LocalDate anioPublicacion, int stock, int peso, LocalTime duracion) {
        super(titulo, autor, anioPublicacion, stock);
        this.peso = peso;
        this.duracion = duracion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }
}
