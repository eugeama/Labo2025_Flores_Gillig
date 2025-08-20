package Libros;

import java.util.ArrayList;

public class CD {
    ArrayList<Cancion>canciones;

    public ArrayList<Cancion> getCanciones() {

        return canciones;
    }
    public void setCanciones(ArrayList<Cancion> cds) {
        this.canciones = cds;
    }

    public CD() {
        this.canciones = new ArrayList<Cancion>();
        this.canciones.add(new Cancion());
        this.canciones.add(new Cancion("papa","pedro",40,"pipi 243"));
        this.canciones.add(new Cancion("tutu","paco",40,"pipe 243"));
        this.canciones.add(new Cancion("lele","juan",40,"pipa 243"));

    }

    public CD(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }


    public ArrayList<Cancion> agregar(Cancion cancionNueva) {
        canciones.add(cancionNueva);
        return canciones;
    }

    public float numeroCanciones() {
        int total = 0;
        for (Cancion cancion: canciones) {
            total++;
        }
        return total;
    }

    public void verCancion(int posici) {

        System.out.println(canciones.get(posici-1).getTitulo());
    }

    public ArrayList<Cancion> grabaCancion(int posici, Cancion nuevaCancion) {
        for (int i = 0; i < canciones.size(); i++) {
            if (i + 1 == posici) {
                System.out.println("Cancion que se va a reemplazar: " + canciones.get(i).getTitulo());
                System.out.println("Cancion por la que se va a reemplazar: " + nuevaCancion);
                canciones.set(i, nuevaCancion);
            }
        }
        return canciones;
    }
    public ArrayList<Cancion> agrega (Cancion nuevaCancion) {
        canciones.add(nuevaCancion);
        return canciones;
    }

    public ArrayList<Cancion> elimina(int posici) {
        canciones.remove(posici);

        return canciones;
    }

    public static void main(String[] args){
        CD cd = new CD();
        Cancion nuevaCancion=new Cancion();

        System.out.println("Ingrese un nuevo titulo: ");
        nuevaCancion.setTitulo("pipi");

        cd.numeroCanciones();
        cd.verCancion(2);
        cd.grabaCancion(2, nuevaCancion);
        cd.agrega(nuevaCancion);
        cd.elimina(4);


    }
}
