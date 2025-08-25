package Biblioteca_Virtual;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Sistema s= new Sistema();

        Autor a1= new Autor("n", 456, LocalDate.of(2024, 05, 3));
        Autor a2= new Autor("n", 456, LocalDate.of(2024, 05, 3));
        Autor a3= new Autor("n", 456, LocalDate.of(2024, 05, 3));

        Libro l1= new Libro("pipis", a1, Generos.AVENTURA);
        Libro l2= new Libro("pipus", a2, Generos.CIENCIA_FICCION);
        Libro l3= new Libro("pipos", a3, Generos.ROMANCE);

        Usuario u1= new Usuario("pepito24", 3465, LocalDate.of(2024, 05, 3), "pipi@gmail.com", Membresias.BRONCE);
        Usuario u2= new Usuario("pepito25", 3465, LocalDate.of(2024, 05, 3), "pipi@gmail.com", Membresias.PLATA);
        Usuario u3= new Usuario("pepito26", 3465, LocalDate.of(2024, 05, 3), "pipi@gmail.com", Membresias.ORO);

        HashMap<Libro, Integer>libros= new HashMap<>();
        libros.put(l1, 145);
        libros.put(l2, 50);
        libros.put(l3, 144);
        HashMap<Usuario, Integer>usuarios= new HashMap<>();
        usuarios.put(u1, 5);
        usuarios.put(u2, 10);
        usuarios.put(u3, 50);

        s.setLibros(libros);
        s.setUsuarios(usuarios);

        try{
            s.prestarLibro(l1, u1);
        }
        catch(LimiteDePrestamosAlcanzadoException prestamo){
            prestamo.getMessage();
        }
        catch(MembresiaException membresia){
            membresia.getMessage();
        }

        System.out.println(s.prestarLibro(l1, u1));
    }
}
