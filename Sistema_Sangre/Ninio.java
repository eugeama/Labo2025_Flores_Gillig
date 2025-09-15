package Sistema_Sangre;

import java.time.LocalDate;

public class Ninio extends Paciente implements Costo {
    private int nivelTolerancia;

    public Ninio(String apellido, String genero, LocalDate nacimiento, String nombre, TipoSangre sangre, int edad, int nivelTolerancia) {
        super(apellido, genero, nacimiento, nombre, sangre, edad);
        this.nivelTolerancia = nivelTolerancia;
    }

    public int getNivelTolerancia() {
        return nivelTolerancia;
    }

    public void setNivelTolerancia(int nivelTolerancia) {
        this.nivelTolerancia = nivelTolerancia;
    }

    @Override
    public String puedeTratamiento(){
        if(getEdad()>3){
            return "Tu tratamiento tardará: "+nivelTolerancia+2;
        }
        else{
            return "Aún es muy chico para probar el tratamiento";
        }
    }

    @Override
    public int costoTratamiento(){
        return nivelTolerancia*450000;
    }
}
