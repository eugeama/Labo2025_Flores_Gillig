package CampañaVacunacion;

import java.time.LocalDate;

public class Vacuna {
    private LocalDate fechaFabricacion;
    private LocalDate fechaApliccion;
    private int numLote;
    private int numFabricacion;
    private String nombreComercial;

    public Vacuna(LocalDate fechaFabricacion, LocalDate fechaApliccion, int numLote, int numFabricacion, String nombreComercial){
        this.fechaFabricacion= fechaFabricacion;
        this.fechaApliccion=fechaApliccion;
        this.numLote= numLote;
        this.numFabricacion= numFabricacion;
        this.nombreComercial= nombreComercial;
    }
    public Vacuna(){
        this.fechaFabricacion= LocalDate.of(2,4,5);
        this.fechaApliccion=LocalDate.of(23,6,6);
        this.numLote= 0;
        this.numFabricacion= 0;
        this.nombreComercial= "";
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public LocalDate getFechaApliccion() {
        return fechaApliccion;
    }

    public void setFechaApliccion(LocalDate fechaApliccion) {
        this.fechaApliccion = fechaApliccion;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public int getNumFabricacion() {
        return numFabricacion;
    }

    public void setNumFabricacion(int numFabricacion) {
        this.numFabricacion = numFabricacion;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }
}