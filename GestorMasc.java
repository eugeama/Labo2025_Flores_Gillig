package Mascotas;

public class GestorMasc {
    private ArrayList<Mascota> mascotas;

    public GestorMasc() {
        mascotas = new ArrayList<>();
    }
    public boolean altaMascota(Mascota m) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(m.getNombre())) {
                return false; // nombre repetido
            }
        }
        mascotas.add(m);
        return true;
    }

    public boolean eliminarMascota(String nombre) {
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).getNombre().equals(nombre)) {
                mascotas.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean modificarDuenio(String nombre, String nuevoDuenio) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(nombre)) {
                mascota.setDuenio(nuevoDuenio);
                return true;
            }
        }
        return false;
    }
    public Mascota buscarMascota(String nombre) {
        for (Mascota mascota : mascotas) {
            if (mascota.getNombre().equals(nombre)) {
                return mascota;
            }
        }
        return null;
    }
       public String saludar(String nombreMascota, String duenioQueSaluda) {
        Mascota m = buscarMascota(nombreMascota);
        if (m == null) {
            return "Mascota no encontrada";
        }
        if (m instanceof Pez) {
            Pez p = (Pez) m;
            String respuesta = p.saludar(duenioQueSaluda);
            if (p.getVidas() <= 0) {
                eliminarMascota(nombreMascota);
            }
            return respuesta;
        }

        return m.saludar(duenioQueSaluda);
    }
/////FALTA MÉTODO ALIMENTAR
}

