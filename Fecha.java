public class Fecha {
    private int dia;
    private int mes;
    private int anio;


    public Fecha(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
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

    public void valida(){
        if (dia > 31) {
            this.dia=31;
        }
        if(mes>12){
            this.mes=12;
        }
        if(anio>2025){
            this.anio=2025;
        }
    }

    public void diasMes(int mes){
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            System.out.println("el día tiene 31 días");
        }
        else if(mes==4 || mes==6 || mes==9 || mes==11){
            System.out.println("el día tiene 30 días");
        }
        else{
            System.out.println("el día tiene 28 días");
        }
    }

    public String corta(){
        String fecha=dia+"-"+mes+"-"+anio;
        return fecha;
    }

    public String larga(){
        String fecha= "el dia de la semana es "+dia+"del mes "+mes+"del año "+anio;
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

    public 

    public static void main(String[] args) {

    }
}
