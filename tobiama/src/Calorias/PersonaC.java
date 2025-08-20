package Calorias;
import SistemaPeso.Persona;

import java.time.LocalDate;
import java.util.HashMap;

public class PersonaC extends Persona {
    HashMap<Plato, Integer> consumidos;
    private int calorias;

    public PersonaC(HashMap<Plato, Integer> consumidos, String nombre, String apellido, LocalDate nacimiento, int calorias) {
        super(nombre, apellido, nacimiento, null, null);
        this.consumidos = consumidos;
        this.calorias= calorias;
    }

    public PersonaC() {
        super("nombre", "apellido", LocalDate.of(2000, 0, 0), null, null);
        this.consumidos = new HashMap<>();
        this.calorias= 0;
    }

    public HashMap<Plato, Integer> getConsumidos() {
        return consumidos;
    }

    public void setConsumidos(HashMap<Plato, Integer> consumidos) {
        this.consumidos = consumidos;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
}