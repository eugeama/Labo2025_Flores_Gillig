package Bebidas;

public class BebidaAlcoholica extends Bebida {
    private int cantAlcohol;

    public BebidaAlcoholica(String nombre, int cantAlcohol){
        super(nombre, 0, cantAlcohol*20);
        this.cantAlcohol= cantAlcohol;
    }

    @Override
    public int getCoeficientePos(){
        return 0;
    }

    @Override
    public int getCoeficienteNeg(){
        return cantAlcohol*20;
    }

}
