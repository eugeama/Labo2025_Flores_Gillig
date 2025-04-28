package Libros;

import java.util.ArrayList;

public class Alumno {
    private String AlumnoNom;
    private String AlumnoAp;
    private Fecha fechaNa;
    ArrayList<Integer> Notas;


    public Alumno(String AN, String AP, int dia, int mes, int anio) {
        this.AlumnoNom = AN;
        this.AlumnoAp = AP;
        this.fechaNa = new Fecha(anio, dia, mes);
        this.Notas = new ArrayList<Integer>();
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
        if(Notas.isEmpty()) return 0;

        int meNota = Notas.get(0);
        for (Integer nota : Notas) {
            if (nota < meNota) {
                meNota = nota;
            }

        }

        return meNota;
    }

    public int mayorNota() {
        if(Notas.isEmpty()) return 0;

        int maNota = Notas.get(0);
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
