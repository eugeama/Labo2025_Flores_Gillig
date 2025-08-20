package CodigoPruebaThrow;

public class ExceptionPersonalizada extends NullPointerException {
    public ExceptionPersonalizada(String mensajito){
        super(mensajito);
    }
}
