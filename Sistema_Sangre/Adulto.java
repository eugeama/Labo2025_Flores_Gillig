package Sistema_Sangre;

import java.time.LocalDate;

public class Adulto extends Paciente {
    public Adulto(String apellido, String genero, LocalDate nacimiento, String nombre, TipoSangre sangre, int edad) {
        super(apellido, genero, nacimiento, nombre, sangre, edad);
    }
}
