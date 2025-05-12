package repaso;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


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

        assertEquals(peli.getNombre(), video.peliculaMayorDuracion());
        assertEquals(est.getNumero(), video.peliculaMayorDuracion());
    }
}
