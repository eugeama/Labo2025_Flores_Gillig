package Almuerzos;

public class Alumno extends PersonaAlmuerzo {
    private String division;


    public Alumno(String nombre, String apellido, String division){
        super(nombre, apellido);
        this.division= division;
    }


    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
