package SistemaPoblacion;

import java.util.HashMap;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    HashMap<Integer, Integer> contorno;

    public Lugar(String nombre, int codigo, HashMap<Integer, Integer> contorno) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.contorno = contorno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashMap<Integer, Integer> getContorno() {
        return contorno;
    }
    public void setContorno(HashMap<Integer, Integer> contorno) {
        this.contorno = contorno;
    }

    public abstract int calcularPoblacion();
    public abstract void alta(int cantidadAg);
    public abstract void baja(int cantidadAg);
    public abstract void modificacion(int codigoB, int cantidadN);
}


