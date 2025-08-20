package Edificios;

import Autos.Fecha;

import java.time.LocalDate;

public abstract class Dispositivo {
    private Boolean estado;
    private int medida;
    private int umbralInicial;
    private LocalDate anioAdquisicion;


    public Dispositivo(Boolean estado, int medida, int umbralInicial, LocalDate fecha){
        this.estado=estado;
        this.medida=medida;
        this.umbralInicial=umbralInicial;
        this.anioAdquisicion= fecha;
    }


    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getUmbralInicial() {
        return umbralInicial;
    }

    public void setUmbralInicial(int umbralInicial) {
        this.umbralInicial = umbralInicial;
    }

    public LocalDate getAnioAdquisicion() {
        return anioAdquisicion;
    }

    public void setAnioAdquisicion(LocalDate anioAdquisicion) {
        this.anioAdquisicion = anioAdquisicion;
    }

    public void recorrer() {
        if (this.getMedida() > this.getUmbralInicial()) {
            disparaAlarma();
        }
    }

    public void disparaAlarma(){
        System.out.println("");
    }
}
