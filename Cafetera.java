public class Cafetera {
    private int cantidadMaxima;
    private int cantidadActual;
    private int capacidad;
    private int taza;
    private int cantidad;

 
    public Cafetera() {
        this.cantidadMaxima = 100;
        this.cantidadActual = 0;
    }

    public Cafetera(int cantMax, int cantAct, int cap, int taz, int cant){
        this.cantidadMaxima=cantMax;
        this.cantidadActual=cantAct;
        this.capacidad=cap;
        this.taza=taz;
        this.cantidad=cant;
    }

    public void setCantidad(int cant){
        this.cantidad= cant;
    }

    public void setTaza (int taz){
        this.taza = taz;
    }

    public int getcantidadMaxima(){
        return cantidadMaxima;
    }
    public int getcantidadActual(){
        return cantidadActual;
    }
    public int getcapacidad(){
        return capacidad;
    }
    public int gettaza(){
        return taza;
    }
    public int getcantidad(){
        return cantidad;
    }


        public void setCantidadAct(){
        this.cantidadActual=llenarCafetera();
    }


    public void cafeteraCantidad(){
        if (cantidadActual > cantidadMaxima){
            this.cantidadActual= 100;
        }
    }

    public int llenarCafetera(){
        if (cantidadActual < cantidadMaxima){
            this.cantidadActual= 100;
        }
        return cantidadActual;
    }

    public void servirTaza(int capacidad){
        if (taza != capacidad){
            taza = capacidad;
        }
    }

    public void vaciarCafetera(){
        if(cantidadActual != 0){
            cantidadActual = 0;
        }
    }

    public void agregarCafe (int cantidad){
        if (cantidadActual != cantidad){
            cantidadActual= cantidad;
        }
    }

    public static void main(String[] args) {
        Cafetera c1= new Cafetera(100, 80, 90, 0, 90);

        System.out.println("capacidad máxima de la cafetera: "+ c1.getcantidadMaxima());
        System.out.println("capacidad actual de la cafetera: "+ c1.getcantidadActual());
        System.out.println("capacidad de la cafetera: "+ c1.getcapacidad());
        System.out.println("cuanto tiene la taza actualmente: "+ c1.gettaza());
        System.out.println("cantidad a la que se quiere llenar: "+ c1.getcantidad());
}
