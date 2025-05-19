package Libros;

import CurlingP.Persona2;

import java.util.ArrayList;


public class Alumno extends Persona2 {
    private ArrayList<Integer> Notas;

    public Alumno(){
        super(0,0,0,"","");
        this.Notas = new ArrayList<Integer>();
        this.Notas.add(3);
        this.Notas.add(8);
        this.Notas.add(6);
        this.Notas.add(10);
    }


    public Alumno(String AlumnoNom, int edad, String direccion, String AlumnoAp, int dia, int mes, int anio) {
        super(dia,mes,anio,AlumnoNom,AlumnoAp);
        this.Notas = new ArrayList<Integer>();
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
        int edad= fechaActual - getAnio();
        return edad;
    }


    public static void main(String[] args) {
        Alumno alumno = new Alumno("pepe", 30, "calle", "pipi", 2,5,2001);

        alumno.agregaNotas(8);
        alumno.agregaNotas(9);
        alumno.agregaNotas(6);
        alumno.agregaNotas(3);
        System.out.println("la mayor nota del alumno es: "+ alumno.mayorNota());
        System.out.println("La menor nota del alumno es: "+ alumno.menorNota());

    }

}
