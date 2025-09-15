package Sistema_Sangre;

import java.time.LocalDate;

public class Geronte extends Paciente {

    public Geronte(String apellido, String genero, LocalDate nacimiento, String nombre, TipoSangre sangre, int edad) {
        super(apellido, genero, nacimiento, nombre, sangre, edad);
    }
}
