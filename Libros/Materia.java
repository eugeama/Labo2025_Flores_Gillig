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

    public Materia(){
        this.nombre= "Organización de las computadoras";
        this.contenidos= new ArrayList<String>();
        this.contenidos.add("semaforos");
        this.contenidos.add("reloj");
        this.contenidos.add("direccionamiento");
        Alumno a1 = new Alumno();
        this.alumnos.add(a1);
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

        this.contenidos = contenidos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        alumnos = alumnos;
    }

    public int promedioEdadAlumnos(){
        int edades= 0;
        int cantidad= 0;
        for(Alumno alumno: alumnos){
            edades+=alumno.calcularEdad(2025);
            cantidad++;
        }
        return edades/cantidad;
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
        return promedios/cantidad;
    }

    public static void main(String[] args) {
        Materia materia = new Materia("historia");
        ArrayList<String>nuevosContenidos= new ArrayList<String>();
        ArrayList<Integer>Notas= new ArrayList<Integer>();

        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();
        a2.getNotas().add(2);
        a2.getNotas().add(10);
        a2.getNotas().add(7);
        a2.getNotas().add(4);

        a1.getNotas().add(2);
        a1.getNotas().add(8);
        a1.getNotas().add(5);
        a1.getNotas().add(3);
        nuevosContenidos.add("ww2");
        nuevosContenidos.add("La caída de Constantinopla");
        nuevosContenidos.add("El desembarque de Normandia");

        materia.setContenidos(nuevosContenidos);
        materia.getAlumnos().add(a1);
        materia.getAlumnos().add(a2);

        System.out.println("El promedio de edad es: "+materia.promedioEdadAlumnos());
        System.out.println("El promedio de notas es: "+materia.promedioNotasAlumnos());

    }
}
