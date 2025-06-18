package Objetos;

public class Circulo {
    private int radio;


    public Circulo() {

        this.radio = 2;

    }

    public Circulo(int radio) {

        this.radio = radio;

    }

    public double calcularArea() {
        double resultadoAr = (Math.PI * (radio*radio));
        return resultadoAr;
    }

    public double calcularPerimetro() {
        double resultadoPer= (2*Math.PI*radio);
        return resultadoPer;
    }


    //getter
    public int getRadio() {
        return radio;
    }

    //setter
    public void setRadio(int radio) {
        this.radio=radio;
    }

        public static void main (String[]args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(5);

            System.out.println("Radio: "+ c1.getRadio());
            System.out.println("Perímetro: "+ c1.calcularPerimetro());
            System.out.println("Área: "+ c1.calcularArea());

            System.out.println("Radio: "+ c2.getRadio());
            System.out.println("Perímetro: "+ c2.calcularPerimetro());
            System.out.println("Área: "+ c2.calcularArea());

    }
}