package GestionMascotas;

import java.util.ArrayList;

public class GestorMasc {
    private ArrayList<Mascota> mascotas=new ArrayList<>();

    public void addMascota(Mascota m) {
        mascotas.add(m);
    }

    public void eliminarMascota(String nombre) {
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equals(nombre)) {
                mascotas.remove(i);
            }
        }
    }
    public void modificarDuenio(String nombre, String nuevoDuenio) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(nombre)) {
                mascota.setDuenio(nuevoDuenio);
            }
        }
    }
    public Mascota buscarMascota(String nombre) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(nombre)) {
                return mascota;
            }
        }
        return null;
    }
}

