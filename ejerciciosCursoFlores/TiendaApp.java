package duke.choice;

public class TiendaApp {

    public static void main(String[] args) {
        double impuesto = 0.2, total = 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1=new Customer("Pinky", 3);
        Clothing item1 = new Clothing ("Blue jacket", 20.9, "M");
        Clothing item2 = new Clothing ("Orange T-shirt", 10.5, "S");

        System.out.println("El cliente es " + c1.nombre);
        Clothing[] items = {item1, item2};

        item1.descripcion = "Blue Jacket";
        item1.precio = 20.9;
        item1.talle = "M";

        item2.descripcion = "Orange T-Shirt";
        item2.precio = 10.5;
        item2.talle = "S";

        //System.out.println("Item 1: " + item1.descripcion + ", " + item1.precio + ", " + item1.talle);
        //System.out.println("Item 2: " + item2.descripcion + ", " + item2.precio + ", " + item2.talle);

        //total = (item1.precio + item2.precio * 2) * (1 + impuesto);

        System.out.println("Total = " + total);

        int measurement = 3;

        switch (measurement) {
            case 1: case 2: case 3:
                c1.talle = "S";
                break;
            case 4: case 5: case 6:
                c1.talle = "M";
                break;
            case 7: case 8: case 9:
                c1.talle = "L";
                break;
            default:
                c1.talle = "X";
        }
        for (Clothing item : items) {
            total = total + item.precio;
            System.out.println("Item: " + item.descripcion + ", " + item.precio + ", " + item.talle);
        }

        System.out.println("Total = " + total);

    }
}
