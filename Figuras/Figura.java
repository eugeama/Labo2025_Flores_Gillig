package Figuras;

import Objetos.Circulo;


public abstract class Figura {
    abstract float calcularArea();
    abstract float calcularPerimetro();

    public static void main(String[] args) {
        Circulo c1=new Circulo();
        Rectangulo r1=new Rectangulo();
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());


    }

}