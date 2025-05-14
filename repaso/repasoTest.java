package repaso;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class repasoTest {

    @Test
    public void testPeliculaMayorDuracion() {
        Videoclub video = new Videoclub();
        Estanteria est = new Estanteria();
        Pelicula peli = new Pelicula();
        Pelicula p1 = new Pelicula("duro de matar", "accion", 120);
        Pelicula p2 = new Pelicula("sillys", "thriller", 190);
        Pelicula p3 = new Pelicula("pipis", "aventura", 240);
        Pelicula p4 = new Pelicula("duro de sillys", "aventura", 60);
        est.altaPeliculas(p1);
        est.altaPeliculas(p2);
        est.altaPeliculas(p3);
        est.altaPeliculas(p4);
        video.altaEstanteria(est);

        assertEquals(p3.getNombre(), video.peliculaMayorDuracion().getNombre());
    }

    @Test
    public void testActoresMayores(){
        Videoclub video = new Videoclub();
        Estanteria est = new Estanteria();
        Pelicula peli = new Pelicula();
        ArrayList<Persona> agregarActores = new ArrayList<>();
        Persona actor1 = new Persona("lolo", 25, "carlos antonio lopez");
        Persona actor2 = new Persona("anita", 49, "carlos antonio lopez");
        agregarActores.add(actor1);
        agregarActores.add(actor2);
        peli.setActores(agregarActores);

        assertEquals(actor1.);
    }
}
