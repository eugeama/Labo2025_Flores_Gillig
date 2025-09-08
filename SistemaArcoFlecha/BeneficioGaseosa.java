package SistemaArcoFlecha;

import java.util.HashSet;

public class BeneficioGaseosa extends Beneficio implements Acumulable{
    private HashSet<String>gaseosas;

    public BeneficioGaseosa(String nombre, String creador, HashSet<String>gaseosas){
        super(nombre, creador);
        this.gaseosas= gaseosas;
    }

    public HashSet<String> getGaseosas() {
        return gaseosas;
    }

    public void setGaseosas(HashSet<String> gaseosas) {
        this.gaseosas = gaseosas;
    }

    @Override
    public int aplicarDescuentoExtra() {
        return 1000;
    }
}
