
public class RopaNueva implements Comparable<RopaNueva>

{
        private String descripcion;
        private double precio;
        private char talle='S';
        private final double min_impuesto=1.2;
        private final int min_precio=10;

        public RopaNueva(String descripcion, double precio, char talle){
                this.descripcion=descripcion;
                this.precio=precio;
                this.talle=talle;

        }

        public String getDescripcion() {
                return descripcion;
        }

        public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
        }

        public double getPrecio() {
                precio = precio * min_impuesto;
                return precio;
        }

        public void setPrecio(double precio) {
                if(precio<min_precio) {
                        precio = min_precio;
                }
                this.precio = precio;
        }

        public char getTalle() {
                return talle;
        }

        public void setTalle(char talle) {
                this.talle = talle;
        }

        public static void main(String[] args) {

        }

        @Override
        public int compareTo(RopaNueva o) {
                return this.descripcion.compareTo(o.descripcion);
        }


}

