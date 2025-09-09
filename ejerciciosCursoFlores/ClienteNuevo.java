import java.time.LocalDate;
import java.util.ArrayList;

public class ClienteNuevo extends Persona

{
    private char size;
    private ArrayList<RopaNueva> items;
    
    public void addItems(ArrayList<RopaNueva> someItems){
        items=someItems;
    }

    public ClienteNuevo(int dni, int edad, LocalDate fechaNacimiento, String nombre, char size, ArrayList<RopaNueva>items) {
        super(dni, edad, nombre, fechaNacimiento);

        this.size = size;
        this.items = items;
    }
    public ClienteNuevo() {
        super(100101010, 18, "juan", LocalDate.now());
        this.size = size;
        this.items = new ArrayList<>();
    }

    public ClienteNuevo(char size, ArrayList<RopaNueva>items) {

        this.size = size;
        this.items = items;
    }

    public double getCostoTotal(){
        double total=0.0;

            for (RopaNueva item : items){
                if(getSize()==item.getSize()) {
                    System.out.println("Iteams datos:"+" "+item.getDescription()+" "+ item.getPrice()+ " "+item.getSize());
                    total = total + item.getPrice();
            }
        }
            return total;
    }
    public double getPromedioCosto(){
    double promedio=0.0;
    int cantidad=0;
    double promi =0.0;

    for (RopaNueva item : items){
        if(getSize()==item.getSize()) {
            System.out.println("Items datos:"+" "+item.getDescription()+" "+ item.getPrice()+ " "+item.getSize());
            promedio = promedio + item.getPrice();
            cantidad = cantidad+1;
        }
    }
    try{
       promi=promedio/cantidad;
    }
    catch (ArithmeticException e){
        System.out.println("no podes dividir por cero");
    }
    return promi;
}

    public ArrayList<RopaNueva> getItems() {
        return items;
    }

    public void setItems(ArrayList<RopaNueva>items) {
        this.items = items;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
    public void setSize(int mesurement){
        switch(mesurement){
            case 1,2,3:
                size = 's';
                break;
                case 4, 5, 6:
                    size='m';
                    break;
                    case 7, 8 ,9:
                        size='l';
                        break;
                        default:
                            size='x';
        }
    }
