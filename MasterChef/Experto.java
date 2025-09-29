package MasterChef;

import java.time.LocalDate;

public class Experto extends Participante implements Metodo, Entrada, Principal {
    private static int tiempo= 80;

    public Experto(String nombre, String apellido, LocalDate nacimiento, String localidad, Color color){
        super(nombre, apellido, nacimiento, localidad, color);
    }

    public static int getTiempo() {
        return tiempo;
    }

    public static void setTiempo(int tiempo) {
        Experto.tiempo = tiempo;
    }

    @Override
    public String preparar(){
        int tiempo= getTiempo()-5;
        return "Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: "+ tiempo;
    }

    @Override
    public String cocinarYServir(Plato plato) throws ExcepcionCYS{
        if(plato.getTiempoPrep()>getTiempo()-5){
            throw new ExcepcionCYS("No alcanza el tiempo");
        }
        return "Preparando plato";
    }
}
