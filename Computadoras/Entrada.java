package Computadoras;

public class Entrada extends Componente {
    private String tecladoMouse;


    public Entrada(String fabricante, String modelo, int precio, int stock, String tecladoMouse) {
        super(fabricante, modelo, precio, stock);
        this.tecladoMouse = tecladoMouse;
    }


    public String getTecladoMouse() {
        return tecladoMouse;
    }

    public void setTecladoMouse(String tecladoMouse) {
        this.tecladoMouse = tecladoMouse;
    }


}
