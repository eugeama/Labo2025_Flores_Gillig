package Computadoras;

public class Salida extends Componente {
    private String pantallaImpresora;


    public Salida(String fabricante, String modelo, int precio, int stock, String pantallaImpresora){
        super(fabricante, modelo, precio, stock);
        this.pantallaImpresora= pantallaImpresora;
    }


    public String getPantallaImpresora() {
        return pantallaImpresora;
    }

    public void setPantallaImpresora(String pantallaImpresora) {
        this.pantallaImpresora = pantallaImpresora;
    }
}
