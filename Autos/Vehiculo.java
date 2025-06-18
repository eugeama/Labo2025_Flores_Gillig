package Autos;

public class Vehiculo extends Fecha{
    private String marca;
    private String modelo;
    private Color color;
    private int cantRuedas;

    public Vehiculo(String marca, String modelo, Color color, int cantRuedas){
        this.marca= marca;
        this.modelo= modelo;
        this.color= color;
        this.cantRuedas=cantRuedas;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }
}
