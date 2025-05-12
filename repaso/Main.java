package repaso;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Estanteria estanteria = new Estanteria();
        Pelicula pelicula = new Pelicula();
        Videoclub videoclub = new Videoclub();
        ArrayList<Persona> agregarDirectores = new ArrayList<>();
        ArrayList<Persona> agregarDirectores2 = new ArrayList<>();
        ArrayList<Persona> agregarActores = new ArrayList<>();
        ArrayList<Persona> agregarActores2 = new ArrayList<>();
        ArrayList<Pelicula> agregarPeliculas = new ArrayList<>();
        ArrayList<Pelicula> agregarPeliculas2 = new ArrayList<>();
        ArrayList<Estanteria> agregarEstanterias = new ArrayList<>();
        ArrayList<Estanteria> agregarEstanterias2 = new ArrayList<>();


        Persona director1 = new Persona("pepe", 20, "carlos antonio lopez");
        Persona director2 = new Persona("juan", 40, "carlos antonio lopez");
        Persona director3 = new Persona("nini", 36, "carlos antonio lopez");
        Persona director4 = new Persona("pipi", 52, "carlos antonio lopez");
        Persona actor1 = new Persona("lolo", 25, "carlos antonio lopez");
        Persona actor2 = new Persona("anita", 49, "carlos antonio lopez");
        Persona actor3 = new Persona("toti", 29, "carlos antonio lopez");
        Persona actor4 = new Persona("nati", 60, "carlos antonio lopez");
        Pelicula p1 = new Pelicula("duro de matar", "accion", 120);
        Pelicula p2 = new Pelicula("sillys", "thriller", 190);
        Pelicula p3 = new Pelicula("pipis", "aventura", 240);
        Pelicula p4 = new Pelicula("duro de sillys", "aventura", 60);
        Estanteria e1 = new Estanteria(1);
        Estanteria e2 = new Estanteria(2);
        Estanteria e3 = new Estanteria(3);
        Estanteria e4 = new Estanteria(4);
        Videoclub v1 = new Videoclub("carlos antonio lopez", 4090, "comuna 11");
        Videoclub v2 = new Videoclub("pipi lupu", 6080, "comuna 11");
        Videoclub v3 = new Videoclub("tititu", 9128, "comuna 10");
        Videoclub v4 = new Videoclub("lili lala", 7643, "comuna 12");

        agregarDirectores.add(director1);
        agregarDirectores.add(director2);
        agregarDirectores2.add(director3);
        agregarDirectores2.add(director4);
        agregarActores.add(actor1);
        agregarActores.add(actor2);
        agregarActores2.add(actor3);
        agregarActores2.add(actor4);
        agregarPeliculas.add(p1);
        agregarPeliculas.add(p2);
        agregarPeliculas.add(p3);
        agregarPeliculas2.add(p4);
        agregarPeliculas2.add(p1);
        agregarPeliculas2.add(p2);
        agregarEstanterias.add(e1);
        agregarEstanterias.add(e2);
        agregarEstanterias.add(e3);
        agregarEstanterias2.add(e4);
        agregarEstanterias2.add(e1);
        agregarEstanterias2.add(e2);

        p1.setDirectores(agregarDirectores);
        p2.setDirectores(agregarDirectores2);
        p3.setDirectores(agregarDirectores2);
        p4.setDirectores(agregarDirectores);
        p1.setActores(agregarActores);
        p2.setActores(agregarActores2);
        p3.setActores(agregarActores2);
        p4.setActores(agregarActores);
        e1.setPeliculas(agregarPeliculas);
        e2.setPeliculas(agregarPeliculas2);
        e3.setPeliculas(agregarPeliculas2);
        e4.setPeliculas(agregarPeliculas);
        v1.setEstanterias(agregarEstanterias);
        v2.setEstanterias(agregarEstanterias2);
        v3.setEstanterias(agregarEstanterias2);
        v4.setEstanterias(agregarEstanterias);

        estanteria.altaPeliculas(p1);
        estanteria.altaPeliculas(p2);
        estanteria.altaPeliculas(p3);
        estanteria.altaPeliculas(p4);
        videoclub.altaEstanteria(e1);
        videoclub.altaEstanteria(e2);
        videoclub.altaEstanteria(e3);
        videoclub.altaEstanteria(e4);
        sistema.altaVideoclub(v1);
        sistema.altaVideoclub(v2);
        sistema.altaVideoclub(v3);
        sistema.altaVideoclub(v4);


        System.out.println(videoclub.peliculaMayorDuracion());

        ArrayList<Persona> actoresGrandes = pelicula.actoresMayores(p2);
        for (Persona p : actoresGrandes) {
            System.out.println("el actor más grande es: " + p.getNombre());
        }

        ArrayList<Persona> directoresTodos = estanteria.directorEstanteria();
        for (Persona p : directoresTodos) {
            System.out.println("Los directores que aparecen en más de una peli son: " + p.getNombre());
        }

        ArrayList<String> direcciones = sistema.dirVideoclub("comuna 11");
        for (String v : direcciones) {
            System.out.println("los videoclubs que pertenecen a esa comuna son: " + v);
        }

        ArrayList<String> lasPeliculasMenores = sistema.peliculaMenorUbicacion();
        for (String v : lasPeliculasMenores) {
            System.out.println(v);
        }

        ArrayList<Estanteria>peliculasTotales= sistema.masPeliculas();
        for (Estanteria e : peliculasTotales) {
            System.out.println(e);
        }

        ArrayList<String>todasPeliculasGenero=videoclub.peliculaPorGenero("aventura");
        for(String v: todasPeliculasGenero) {
            System.out.println("Las peliculas de ese género son: "+v);
        }
    }
}
