package CodigoPruebaThrow;

public class MainThrows {

    public static void devolverTamanio() throws NullPointerException{
        String nombre = null;
        System.out.println("El largo del nombre es:" + nombre.length());
    }

    public static void main(String[] args) {
        try{
            devolverTamanio();
        }
        catch(NullPointerException errorsin){
            System.out.println("funciona el throws wiwiwri "+errorsin);
        }
    }
}
