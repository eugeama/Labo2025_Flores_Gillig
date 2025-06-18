package Autos;

public abstract class Auto extends Vehiculo {
    private String patente;
    private boolean descapotable;

    public Auto(String marca, String modelo, Color color, int cantRuedas, String patente, boolean descapotable){
        super(marca, modelo, color, cantRuedas);
        this.patente= patente;
        this.descapotable= descapotable;
    }


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }



}
