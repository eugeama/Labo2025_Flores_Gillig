package Bebidas;

public class BebidaNeutra extends Bebida {
    private int coeficienteNeg;
    private int coeficientePos;

    public BebidaNeutra(String nombre, int coeficienteNeg, int coeficientePos){
        super(nombre, coeficientePos, coeficienteNeg);
        this.coeficienteNeg= coeficienteNeg;
        this.coeficientePos= coeficientePos;
    }


    public void setCoeficientePos(int coeficientePos) {
        this.coeficientePos = coeficientePos;
    }

    @Override
    public int getCoeficientePos(){
        return coeficientePos;
    }

    @Override
    public int getCoeficienteNeg() {
        return coeficienteNeg;
    }
}
