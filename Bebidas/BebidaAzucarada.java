package Bebidas;

public class BebidaAzucarada extends Bebida {
    private int cantAzucar;

    public BebidaAzucarada(String nombre, int cantAzucar){
        super(nombre, 1, cantAzucar*10);
        this.cantAzucar= cantAzucar;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    @Override
    public int getCoeficientePos(){
        return 1;
    }

    @Override
    public int getCoeficienteNeg(){
        return cantAzucar*10;
    }
}
