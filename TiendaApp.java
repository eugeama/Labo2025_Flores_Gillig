package duke.choice;

public class TiendaApp {

    public static void main(String[] args) {
        double impuesto = 0.2, total = 0.0;

        Customer cliente = new Customer();
        Clothing prenda1 = new Clothing("Buzo", 25.5, "M");
        Clothing prenda2 = new Clothing("Remera", 20.5, "L");

        cliente.nombre = "Tobi";

        System.out.println("El nombre del cliente es: " + cliente.nombre);
        System.out.println("Descripción: " + prenda1.descripcion + ", Precio: " + prenda1.precio + ", Talle: " + prenda1.talle);
        System.out.println("Descripción: " + prenda2.descripcion + ", Precio: " + prenda2.precio + ", Talle: " + prenda2.talle);


        total = (prenda1.precio + prenda2.precio * 2) * (1 + impuesto);
        System.out.println("Precio final (con impuestos): " + total);
    }
}
