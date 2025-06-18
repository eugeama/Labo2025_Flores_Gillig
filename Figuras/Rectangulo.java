package Figuras;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int ba, int al) {
        this.base=ba;
        this.altura=al;
    }

    public Rectangulo() {
        this.base=0;
        this.altura=0;
    }

    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
    public void setBase(int ba){
        this.base= ba;
    }
    public void setAltura(int al){
        this.altura= al;
    }

    public float calcularArea(){
        int resultadoAr=((base*altura)/2);
        return resultadoAr;
    }
    public float calcularPerimetro(){
        int resultadoPer= ((base+altura)*2);
        return resultadoPer;
    }
    public static void main(String[] args) {
        Rectangulo r1= new Rectangulo(8, 4);

        System.out.println("Rectangulo base: "+r1.getBase());
        System.out.println("Rectangulo base: "+r1.getAltura());
        System.out.println("Area: "+r1.calcularArea());
        System.out.println("Perímetro: "+r1.calcularPerimetro());
    }
}
