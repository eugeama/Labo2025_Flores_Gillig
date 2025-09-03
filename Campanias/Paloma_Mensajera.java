package Campanias;

public class Paloma_Mensajera {
    private String color;
    private String nombre;
    private String especie;
    private Boolean aprendioMapa;

    public Paloma_Mensajera(String color, String nombre, String especie, Boolean aprendioMapa){
        this.color= color;
        this.nombre= nombre;
        this.especie= especie;
        this.aprendioMapa= aprendioMapa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Boolean getAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(Boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }
}
