package MasterChef;

import repaso2.Persona;

import java.time.LocalDate;

public abstract class Participante extends Persona {
    private String localidad;
    private Color color;

    public Participante(String nombre, String apellido, LocalDate nacimiento, String localidad, Color color){
        super(nombre, apellido, nacimiento);
        this.localidad= localidad;
        this.color= color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
}
