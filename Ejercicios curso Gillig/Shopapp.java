package duke.choice;

public class Shopapp{

    public static void main(String[] args) {
        double tax= 0.2, total= 0.0;

        Customer c1=new Customer("Pinky", 3);
        Clothing item1 = new Clothing ("Blue jacket", 20.9, "M");
        Clothing item2 = new Clothing ("Orange T-shirt", 10.5, "S");

        Clothing[] items ={item1, item2, new Clothing("Green Scarf", 5.0, "S"),
                new Clothing("Blue T-shirt", 10.5, "S")};

        System.out.println("Precio mínimo: "+Clothing.minPrice);


        int measurement= 3;
        c1.agregarItems(items);
        //c1.setSize(measurement);
        System.out.println("El cliente es"+c1.name+ ", "+c1.getSize()+ ", "+c1.totalRopa());

        for (Clothing item: c1.getItems()){
            System.out.println("item: "+ item);
        }
    }
}