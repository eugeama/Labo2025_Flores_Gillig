package Biblioteca_Virtual;

import java.util.HashMap;
import java.util.Map;

public class Sistema {
    private HashMap<Autor, Libro>librosEscritos;
    private HashMap<Libro, Integer> libros;
    private HashMap<Usuario, Integer>usuarios;

    public Sistema(HashMap<Autor, Libro>librosEscritos, HashMap<Libro, Integer> libros, HashMap<Usuario, Integer>usuarios){
        this.librosEscritos= librosEscritos;
        this.libros= libros;
        this.usuarios= usuarios;
    }

    public Sistema(){
        this.libros= new HashMap<>();
        this.usuarios= new HashMap<>();
    }

    public HashMap<Autor, Libro> getLibrosEscritos() {
        return librosEscritos;
    }

    public void setLibrosEscritos(HashMap<Autor, Libro> librosEscritos) {
        this.librosEscritos = librosEscritos;
    }

    public HashMap<Libro, Integer> getLibros() {
        return libros;
    }

    public void setLibros(HashMap<Libro, Integer> libros) {
        this.libros = libros;
    }

    public HashMap<Usuario, Integer> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<Usuario, Integer> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarLibro(Libro nuevoLibro){
        libros.put(nuevoLibro, 0);
    }

    public void borrarLibro(Libro libroABorrar){
        for(Map.Entry<Libro, Integer> tLibros: libros.entrySet()){
            if(tLibros.getKey().equals(libroABorrar)){
                libros.remove(tLibros);
            }
        }
    }

    public void modificarLibro(Libro libroViejo, Libro libroNuevo){
        for(Map.Entry<Libro, Integer> tLibros: libros.entrySet()){
            if(tLibros.getKey().equals(libroViejo)){
                libros.remove(tLibros);
                libros.put(libroNuevo, 0);
            }
        }
    }

    public String prestarLibro(Libro libroAPrestar, Usuario usuarioP) throws LimiteDePrestamosAlcanzadoException, MembresiaException {
        for(Map.Entry<Libro, Integer> tLibros: libros.entrySet()){
            if(tLibros.getKey().equals(libroAPrestar)){
                if(tLibros.getValue()==tLibros.getKey().getDescargaDisp()) {
                    throw new LimiteDePrestamosAlcanzadoException("El libro super{o el límite de descargas");
                }
                else {
                    for (Map.Entry<Usuario, Integer> tUsuarios : usuarios.entrySet()) {
                        if (tUsuarios.getKey().equals(usuarioP)) {
                            if (tUsuarios.getValue() == tUsuarios.getKey().getMembresia().getPrestamo()) {
                                throw new MembresiaException("El usuario alcanzó el límite de prestamos disponibles");
                            }
                            else {
                                tUsuarios.setValue(tUsuarios.getValue() + 1);
                                tLibros.setValue(tLibros.getValue() + 1);
                            }
                        }
                    }
                }
            }
        }
        return "Libro prestado";
    }
}