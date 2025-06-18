package duke.choice;

public class Customer {
    String name;
    String size;

    private Clothing[] items;


    public Customer(String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void agregarItems(Clothing[] algunosItems){
        items = algunosItems;
    }
    public Clothing[] getItems(){
        return items;
    }

    double total= 0.0;

    public double totalRopa(){
        for (Clothing item: items){

                total =total+ item.getPrice();
                System.out.println("Descripción del producto: "+
                        item.description+" Precio del producto: "+item.price+" Talle del producto: "+item.size);
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                size = "S";
                break;
            case 4:
            case 5:
            case 6:
                size = "M";
                break;
            case 7:
            case 8:
            case 9:
                size = "L";
                break;
            default:
                size = "X";
        }
    }
}