package CodigoPruebaThrow;

public class MainPersonalizado {
    public static void devolverTamanio() throws ExceptionPersonalizada {
        String nombre = null;
        if (nombre == null) {
            throw new ExceptionPersonalizada("falta un nombre wiwi");
        } else {
            System.out.println("El largo del nombre es:" + nombre.length());
        }
    }

    public static void main(String[] args) {
        try{
            devolverTamanio();
        }
        catch(ExceptionPersonalizada personalizadowii){
            System.out.println(personalizadowii);
        }
    }
}
