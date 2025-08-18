package CodigoPruebaThrow;

public class MainThrow {

    public static void devolverTamanio() {
        String nombre = null;
        try{
            if(nombre.equals(null)){
                throw new NullPointerException("ingrese un nombre");
            }
            System.out.println("El largo del nombre es:" + nombre.length());
        }
        catch(NullPointerException n){
            System.err.println(n);
        }
    }

    public static void main(String[] args) {
        devolverTamanio();
    }
}
