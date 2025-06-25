package GestionMascotas;

public class Pez extends Mascota {
private static int cantVidas=10;

    public Pez(String nombre, String duenio) {
        super(nombre, duenio);
    }

    public static int getCantVidas() {
        return cantVidas;
    }

    public static void setCantVidas(int cantVidas) {
        Pez.cantVidas = cantVidas;
    }

    @Override
    public String saludar(String duenioQueSaluda) {
        GestorMasc gestor= new GestorMasc();
        if (duenioQueSaluda.equals(getDuenio())){
            cantVidas=cantVidas-1;
        }
        else {
            gestor.eliminarMascota(getNombre());
        }

        if (getCantVidas() <= 0) {
           gestor.eliminarMascota(getNombre());
        }
        return " ";
    }

    @Override
    public String tipoDeMascota() {
        return "Pez";
    }

    @Override
    public void alimentar(){
        cantVidas++;
    }
}
