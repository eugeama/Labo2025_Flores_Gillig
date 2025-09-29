package MasterChef;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Intermedio extends Participante implements Metodo, Principal {
    private HashMap<String, Integer> stock;

    public Intermedio(String nombre, String apellido, LocalDate nacimiento, String localidad, Color color, HashMap<String, Integer> stock){
        super(nombre, apellido, nacimiento, localidad, color);
        this.stock= stock;
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<String, Integer> stock) {
        this.stock = stock;
    }

    @Override
    public String preparar(){
        String ingredientes= "";
        for(Map.Entry<String, Integer> stockD: stock.entrySet()){
            if(stockD.getValue()>1){
                ingredientes+=" -"+stockD.getKey();
            }
        }
        return "Mi stock a utilizar es de "+ingredientes;
    }

    @Override
    public String cocinarYServir(Plato plato) throws ExcepcionCYS{
        for(String ingrediente: plato.getIngredientes()) {
            if (!stock.containsKey(ingrediente) && stock.get(ingrediente)<1) {
                throw new ExcepcionCYS("No tiene los ingredientes necesarios");
            }
        }
        return "Preparando plato";
    }
}
