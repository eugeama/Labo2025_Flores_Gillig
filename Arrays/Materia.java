package Libros;

import java.util.ArrayList;

public class Materia {
    private String nombre;
    ArrayList<String>contenidos;
    ArrayList<Alumno>alumnos;


    public Materia(String nom){
        this.nombre = nom;
        this.contenidos= new ArrayList<String>();
        this.alumnos = new ArrayList<Alumno>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getContenidos() {
        return contenidos;
    }

    public void setContenidos(ArrayList<String> contenidos) {

        contenidos = contenidos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        alumnos = alumnos;
    }


    public void agregarContenidos(String nuevoContenido){
        contenidos.add(nuevoContenido);
    }

    public int promedioEdadAlumnos(){
        int edades= 0;
        int cantidad= 0;
        for(Alumno alumno: alumnos){
            edades+=alumno.calcularEdad(2025);
            cantidad++;
        }
        int promedioEd= edades/cantidad;
        return promedioEd;
    }

    public int promedioNotasAlumnos(){
        int promedios= 0;
        int cantidad= 0;

        for(Alumno alumno: alumnos){
            for(Integer nota: alumno.getNotas()) {
                promedios += nota;
                cantidad++;
            }
        }
        int promedioN= promedios/cantidad;
        return promedioN;
    }

    public static void main(String[] args) {
        Materia materia = new Materia("dbfdsl");
        ArrayList<Alumno>alumnos= new ArrayList<Alumno>();

        materia.setNombre("historia");
        materia.agregarContenidos("WW2");
        materia.agregarContenidos("La caída de Constantinopla");
        materia.agregarContenidos("El desembarque de Normandia");
        materia.promedioEdadAlumnos();
        materia.promedioNotasAlumnos();
    }
}
