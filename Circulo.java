public class Circulo {
    private int radio;


    public Circulo() {

        this.radio = 2;

    }

    public Circulo(int radio) {

        this.radio = radio;

    }

    public float calcularArea(int Pi) {
        int resultadoAr = (Pi * (radio*radio));
        return resultadoAr;
    }

    public float calcularPerimetro(int Pi) {
      int resultadoPer= (2*Pi*radio);
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
        int Pi= (int) Math.PI;
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(5);

            System.out.println("Radio: "+ c1.getRadio());
            System.out.println("Perímetro: "+ c1.calcularPerimetro(Pi));
            System.out.println("Área: "+ c1.calcularArea(Pi));

            System.out.println("Radio: "+ c2.getRadio());
            System.out.println("Perímetro: "+ c2.calcularPerimetro(Pi));
            System.out.println("Área: "+ c2.calcularArea(Pi));

    }
}