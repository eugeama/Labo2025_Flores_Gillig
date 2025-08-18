package CodigoPruebaThrow;

public class MainThrows {

    public static void devolverTamanio() throws NullPointerException{
        String nombre = null;
        System.out.println("El largo del nombre es:" + nombre.length());
    }
}
