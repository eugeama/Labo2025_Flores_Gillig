package Sistema_Sangre;

import java.time.LocalDate;
import java.util.HashSet;

public class Joven extends Paciente implements Costo{
    private static int edadMin= 20;
    private static int edadMax= 30;
    private HashSet<String>deportes;

    public Joven(String apellido, String genero, LocalDate nacimiento, String nombre, TipoSangre sangre, int edad, HashSet<String> deportes) {
        super(apellido, genero, nacimiento, nombre, sangre, edad);
        this.deportes = deportes;
    }

    public HashSet<String> getDeportes() {
        return deportes;
    }

    public void setDeportes(HashSet<String> deportes) {
        this.deportes = deportes;
    }

    public static int getEdadMax() {
        return edadMax;
    }

    public static void setEdadMax(int edadMax) {
        Joven.edadMax = edadMax;
    }

    public static int getEdadMin() {
        return edadMin;
    }

    public static void setEdadMin(int edadMin) {
        Joven.edadMin = edadMin;
    }

    @Override
    public String puedeTratamiento(){
        if(deportes.size()/20== 0 || edadMax-getEdad()>2){
            return "Será un tratamiento costoso, peo lo vamos a lograr";
        }
        else{
            return "lamentamos comunicarte que tu sangre no va a poder ser modificada";
        }
    }

    @Override
    public int costoTratamiento(){
        if(getNacimiento().getYear()/2!=0){
            return getNacimiento().getDayOfMonth()*760000;
        }
        else{
            return getNacimiento().getDayOfYear()*145400;
        }
    }
}
