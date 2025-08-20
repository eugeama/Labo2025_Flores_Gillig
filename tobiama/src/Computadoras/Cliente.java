package Computadoras;

public class Cliente {
    private String nombre;
    private String apellido;
    private int celular;
    private String metodoPago;
    private int tarjeta;


    public Cliente(String nombre, String apellido, int celular, String metodoPago, int tarjeta){
        this.nombre=nombre;
        this.apellido=apellido;
        this.celular=celular;
        this.metodoPago=metodoPago;
        this.tarjeta=tarjeta;
    }

    public Cliente(){
        this.nombre="";
        this.apellido="";
        this.celular=0;
        this.metodoPago="";
        this.tarjeta=0;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }
}
