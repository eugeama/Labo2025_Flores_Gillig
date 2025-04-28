package Libros;

import java.util.ArrayList;

public class Alumno {
    private String AlumnoNom;
    private String AlumnoAp;
    private Fecha fechaNa;
    ArrayList<Integer> Notas;


    public Alumno(String AlumnoNom, String AlumnoAp, int dia, int mes, int anio) {
        this.AlumnoNom = AlumnoNom;
        this.AlumnoAp = AlumnoAp;
        this.fechaNa = new Fecha(dia, mes, anio);
        this.Notas = new ArrayList<Integer>();
    }

    public Alumno(){
        this.AlumnoNom= "sdas";
        this.AlumnoAp= "gfhlshf";
        this.fechaNa.dia=2;
        this.fechaNa.mes=2;
        this.fechaNa.anio=2008;
        this.Notas = new ArrayList<Integer>();
        this.Notas.add(3);
        this.Notas.add(8);
        this.Notas.add(6);
        this.Notas.add(10);
    }


    public String getAlumnoNom() {
        return AlumnoNom;
    }

    public void setAlumnoNom(String alumnoNom) {
        AlumnoNom = alumnoNom;
    }

    public String getAlumnoAp() {
        return AlumnoAp;
    }

    public void setAlumnoAp(String alumnoAp) {
        AlumnoAp = alumnoAp;
    }

    public Fecha getFechaNa() {
        return fechaNa;
    }

    public void setFechaNa(Fecha fecha) {

        this.fechaNa = fecha;
    }

    public ArrayList<Integer> getNotas() {

        return Notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        Notas = notas;
    }


    public void agregaNotas(int nota) {
        Notas.add(nota);

    }

    public int menorNota() {

        int meNota = 10;
        for (Integer nota : Notas) {
            if (nota < meNota) {
                meNota = nota;
            }

        }

        return meNota;
    }

    public int mayorNota() {

        int maNota = 0;
        for (Integer nota : Notas) {

            if (nota > maNota) {
                maNota = nota;
            }
        }
        return maNota;
    }

    public int calcularEdad (int fechaActual){
        int edad= fechaActual - getFechaNa().anio;
        return edad;
    }


    public static void main(String[] args) {
        Alumno alumno = new Alumno("agfs", "asdf", 2, 6, 2006);

        alumno.agregaNotas(8);
        alumno.agregaNotas(9);
        alumno.agregaNotas(6);
        alumno.agregaNotas(3);
        System.out.println("la mayor nota del alumno es: "+ alumno.mayorNota());
        System.out.println("La menor nota del alumno es: "+ alumno.menorNota());

    }

}
