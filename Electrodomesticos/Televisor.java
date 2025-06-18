package Electrodomesticos;

public class Televisor extends Producto {
    private Tecnologia tecnologia;
    private int resolucionPixeles;

    public Televisor (String nombre, int precio, int stock, Tipo tipo, Tecnologia tecnologia, int resolucionPixeles){
        super(nombre, precio, stock, tipo);
        this.tecnologia= tecnologia;
        this.resolucionPixeles= resolucionPixeles;
    }

    public Televisor () {
        super("", 0, 0, Tipo.MULTIMEDIA);
        this.tecnologia = Tecnologia.CUATROK;
        this.resolucionPixeles = 0;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getResolucionPixeles() {
        return resolucionPixeles;
    }

    public void setResolucionPixeles(int resolucionPixeles) {
        this.resolucionPixeles = resolucionPixeles;
    }
}
