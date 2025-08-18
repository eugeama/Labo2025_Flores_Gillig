package CodigoPruebaThrow;

public class MainTryCatch {
        public static void main(String[] args) {
            try {
                String nombre = null;
                System.out.println("El largo del nombre es:" + nombre.length());
            }
            catch(NullPointerException a){
                System.out.println("Ingresar un nombre");
            }
        }
    }
