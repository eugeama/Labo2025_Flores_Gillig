package SistemaArcoFlecha;

import java.util.HashSet;

public class BeneficioComida extends Beneficio implements Acumulable{
    private HashSet<String> comidas;

    public BeneficioComida(String nombre, String creador, HashSet<String> comidas) {
        super(nombre, creador);
        this.comidas = comidas;
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<String> comidas) {
        this.comidas = comidas;
    }

    @Override
    public int aplicarDescuentoExtra() {
        return 4500;
    }
}
