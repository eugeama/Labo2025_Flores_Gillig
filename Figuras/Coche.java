package Figuras;

public class Coche {
    private String marca;
    private int modelo;
    private String color;
    private int aceleracion;
    private int velocidad;
    private int frenar;

    public Coche(String mar, int mod, String col, int ace, int vel) {
        this.aceleracion = ace;
        this.velocidad= vel;
        this.marca = mar;
        this.modelo = mod;
        this.color = col;
    }

    public int getAceleracion (){
        return aceleracion;
    }
    public int getVelocidad (){
        return velocidad;
    }
    public String getMarca (){
        return marca;
    }
    public int getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }

    public void setAceleracion (int ace){
        this.aceleracion= ace;
    }
    public void setVelocidad (int vel){
        this.velocidad= vel;
    }
    public void setMarca(String mar){
        this.marca= mar;
    }
    public void setModelo(int mod){
        this.modelo=mod;
    }
    public void setColor(String col){
        this.color=col;
    }

    public float Acelerar(){
        int aceleracionfalt=aceleracion-velocidad;
        int resultado = velocidad + aceleracionfalt;
        return resultado;
    }
    public float Frenar(){
        int freno=(velocidad-velocidad);
        return freno;
    }
    public float VelocidadActual(){
        System.out.println(velocidad);
        return velocidad;
    }

    public static void main(String[] args) {
        Coche c1= new Coche("mercedes", 40, "rojo", 240, 170);

        System.out.println("Marca del auto: "+c1.getMarca());
        System.out.println("Modelo del auto: "+c1.getModelo());
        System.out.println("Color del auto: "+c1.getColor());
        System.out.println("Aceleración del auto: "+c1.Acelerar());
        System.out.println("Freno del auto: "+c1.Frenar());
        System.out.println("Velocidad actual del auto: "+c1.VelocidadActual());
    }
}
