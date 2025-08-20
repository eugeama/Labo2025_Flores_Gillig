package repaso2;

public class Fecha {
    int dia;
    int mes;
    int anio;


    public Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
    }

    public Fecha(){
        this.dia= 3;
        this.mes=5;
        this.anio=2025;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int valida(){
        if (dia > 31) {
            this.dia=31;
        }
        if(mes>12){
            this.mes=12;
        }
        if(anio>2025){
            this.anio=2025;
        }
        return dia;
    }

    public String diasMes(int mes){
        String meses;
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            meses ="el día tiene 31 días";
        }
        else if(mes==4 || mes==6 || mes==9 || mes==11){
            meses ="el día tiene 30 días";
        }
        else{
            meses="el día tiene 28 días";
        }
        return meses;
    }

    public String corta(){
        String fecha=dia+"-"+mes+"-"+anio;
        return fecha;
    }

    public String larga(){
        String fecha= "el dia de la semana es "+dia+" del mes "+mes+" del año "+anio;
        return fecha;
    }

    public int siguiente(){
        int diaAvan= dia + 1;
        return diaAvan;
    }

    public int anterior(){
        int diaAtras= dia - 1;
        return diaAtras;
    }

    public boolean igualQue(Fecha Fecha1, Fecha Fecha2){
        if (Fecha1.equals(Fecha2)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean menorQue(Fecha Fecha1, Fecha Fecha2){
        if (Fecha1.dia < Fecha2.dia){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean mayorQue(Fecha Fecha1, Fecha Fecha2){
        if (Fecha1.dia > Fecha2.dia){
            return true;
        }
        else {
            return false;
        }
    }



    public static void main(String[] args) {
        Fecha Fecha1= new Fecha(1,5,2025);
        Fecha Fecha2 = new Fecha();

        System.out.println("La fecha es: "+ Fecha1.valida());
        System.out.println("El día es: "+ Fecha1.diasMes(5));
        System.out.println("La fecha escrita de forma corta: "+ Fecha1.corta());
        System.out.println("La fecha escrita de forma larga: "+ Fecha1.larga());
        System.out.println("El día siguiente a ese: "+ Fecha1.siguiente());
        System.out.println("El día anterior a ese: "+ Fecha1.anterior());
        System.out.println("¿Esa fecha es igual a la segunda fecha?: "+ Fecha1.igualQue(Fecha1, Fecha2));
        System.out.println("¿Esa fecha es mayor a la segunda fecha?: "+ Fecha1.menorQue(Fecha1, Fecha2));
        System.out.println("¿Esa fecha es menor a la segunda fecha?: "+ Fecha1.mayorQue(Fecha1, Fecha2));

    }
}