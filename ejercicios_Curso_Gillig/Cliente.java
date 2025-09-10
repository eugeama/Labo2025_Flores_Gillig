package ejercicios_Curso_Gillig;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Persona

{

    private char talle;
    private ArrayList<Ropa> items;


    public void addItems(ArrayList<Ropa> itemsA){
        items=itemsA;

    }

    public Cliente(int dni, int edad, LocalDate fechaNacimiento, String nombre, char talle, ArrayList<Ropa>items) {
        super(dni, edad, nombre, fechaNacimiento);
        this.talle = talle;
        this.items = items;
    }
    public Cliente() {
        super(100101010, 18, "juan", LocalDate.now());
        this.talle = talle;
        this.items = new ArrayList<>();
    }

    public Cliente(char talle, ArrayList<Ropa>items) {

        this.talle = talle;
        this.items = items;
    }

    public double getPrecioTotal(){
        double total=0.0;

        for (Ropa item : items){
            if(getTalle()==item.getTalle()) {
                System.out.println("Iteams datos:"+" "+item.getDescripcion()+" "+ item.getPrecio()+ " "+item.getTalle());
                total = total + item.getPrecio();


            }
        }
        return total;
    }
    public double getCostoP(){
        double promedio=0.0;
        int cantidad=0;
        double promi =0.0;

        for (Ropa item : items){
            if(getTalle()==item.getTalle()) {
                System.out.println("Iteams datos:"+" "+item.getDescripcion()+" "+ item.getPrecio()+ " "+item.getTalle());
                promedio = promedio + item.getPrecio();
                cantidad = cantidad+1;


            }
        }
        try{
            promi=promedio/cantidad;
        }
        catch (ArithmeticException e){
            System.out.println("no dividas por cero");
        }
        return promi;
    }

    public ArrayList<Ropa> getItems() {
        return items;
    }

    public void setItems(ArrayList<Ropa>items) {
        this.items = items;
    }

    public char getTalle() {
        return talle;
    }

    public void setSize(char size) {
        this.talle = size;
    }
    public void setSize(int mesurement){
        switch(mesurement){
            case 1,2,3:
                talle = 's';
                break;
            case 4, 5, 6:
                talle='m';
                break;
            case 7, 8 ,9:
                talle='l';
                break;
            default:
                talle='x';
        }

    }
}
