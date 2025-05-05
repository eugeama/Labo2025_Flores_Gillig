package duke.choice;

public class Shopapp{

    public static void main(String[] args) {
        double tax= 0.2, total= 0.0;

        Customer c1=new Customer("Pinky", 3);
        Clothing item1 = new Clothing ("Blue jacket", 20.9, "M");
        Clothing item2 = new Clothing ("Orange T-shirt", 10.5, "S");

        Clothing[] items ={item1, item2, new Clothing("Green Scarf", 5.0, "S"),
                new Clothing("Blue T-shirt", 10.5, "S")};




        // System.out.println("Descripción del producto: "+item1.description+" Precio del producto: "+item1.price+" Talle del producto: "+item1.size);
        // System.out.println("Descripción del producto: "+item2.description+" Precio del producto: "+item2.price+" Talle del producto: "+item2.size);
    
        // total= (item1.price + item2.price*2)*1+tax;

        int measurement= 3;
        c1.agregarItems(items);
        //c1.setSize(measurement);
        System.out.println("El cliente es"+c1.name+ ", "+c1.getSize()+ ", "+c1.totalRopa());

        for (Clothing item: c1.getItems()){
            System.out.println("items: "+item.getDescription());
        }
    }
}