package GestionMascotas;

public class Main {
    public static void main(String[] args) {
        GestorMasc masc= new GestorMasc();

        Perro p1= new Perro("fabra", "Boca" );
        Gato g1= new Gato("silly", "amalia");
        Pez pez1= new Pez("pipi", "pepe");
        Pajaro pa1= new Pajaro("pipu", "pupi", false, "vamos boca", 7);

        masc.addMascota(p1);
        masc.addMascota(g1);
        masc.addMascota(pez1);
        masc.addMascota(pa1);

        System.out.println(pa1.saludar("pupi"));
        System.out.println(g1.saludar("amalia"));
        System.out.println(p1.saludar("Boca"));
        System.out.println(pez1.saludar("pepe"));
    }
}
