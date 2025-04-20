package duke.choice;

import java.lang.classfile.instruction.ThrowInstruction;

public class Shopapp{

    public static void main(String[] args) {
        double tax= 0.2, total= 0.0;

        Customer c1=new Customer();
        Clothing item1 = new Clothing ("Blue jacket", 20.9, "M");
        Clothing item2 = new Clothing ("Orange t-shirt", 10.5, "S");

        c1.name="Pinky";

        System.out.println("El cliente es"+c1.name);
        System.out.println("Descripción del producto: "+item1.description+" Precio del producto: "+item1.price+" Talle del producto: "+item1.size);
        System.out.println("Descripción del producto: "+item2.description+" Precio del producto: "+item2.price+" Talle del producto: "+item2.size);
    
        total= (item1.price + item2.price*2)*1+tax;
        System.out.println("Total:"+total);
    }
}