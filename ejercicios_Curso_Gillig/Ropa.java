package ejercicios_Curso_Gillig;

public class Ropa implements Comparable<Ropa> {
    private String descripcion;
    private double precio;
    private char talle ='s';
    private final double tarifaMin =1.2;
    private final int tarifaMax =10;

    public Ropa(String descripcion, double precio, char talle){
        this.descripcion =descripcion;
        this.precio =precio;
        this.talle =talle;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        precio = precio * tarifaMin;
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio < tarifaMax) {
            precio = tarifaMax;
        }
        this.precio = precio;
    }

    public char getTalle() {
        return talle;
    }

    public void setTalle(char talle) {
        this.talle = talle;
    }

    @Override
    public int compareTo(Ropa o) {
        return this.descripcion.compareTo(o.descripcion);
    }


}
