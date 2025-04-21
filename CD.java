package Libros;

import java.util.ArrayList;

public class CD {
    private int posici;
    private String nuevacancion;
    ArrayList<Cancion>cds = new ArrayList<Cancion>();
    ArrayList<Cancion>cds2 = new ArrayList<Cancion>();


    public CD() {
        cds.add(new Cancion("papa","pedro",40,"pipi 243",1));
        cds.add(new Cancion("tutu","paco",40,"pipe 243",2));
        cds.add(new Cancion("lele","juan",40,"pipa 243",3));

    }

    public CD(ArrayList<Cancion> cds2, int posicion) {
        cds2.add(new Cancion("Billie Jean","Catriel",24,"Acha 45",1));
        cds2.add(new Cancion("Thriller","Van Halen",32,"Losa 78",2));
        cds2.add(new Cancion("Bad","Luck Ra",56,"Pong 921",3));
    }

    public ArrayList<Cancion> getCds() {
        return cds;
    }
    public void setCds(ArrayList<Cancion> cds) {
        this.cds = cds;
    }


    public ArrayList<Cancion> getCds2() {
        return cds2;
    }
    public void setCds2(ArrayList<Cancion> cds2) {
        this.cds2 = cds2;
    }


    public int getPosicion() {
        return posici;
    }
    public void setPosicion(int pos){
        this.posici= pos;
    }


    public float numeroCanciones() {
        int total = 0;
        for (Cancion cd: cds) {
            total++;
        }
        return total;
    }

    public void verCancion(int posici) {
        System.out.println(cds.get(posici-1).getTitulo());
    }

    public float grabaCancion(int posici, Cancion nuevaCancion) {
        for(Cancion cd: cds)
        if (cd.getPosicion() == posici){
            cd.getTitulo()=nuevacancion;
        }
    }

    public float agrega(Cancion cancion) {
        ArrayList<String>canciones = new ArrayList<String>();
        canciones.add(new String("Intergalactic"));
    }
    public float elimina(int posicion) {

    }
    public static void main(String[] args){
    }
}
