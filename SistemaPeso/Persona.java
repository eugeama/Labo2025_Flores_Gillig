package SistemaPeso;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private HashMap<LocalDate, Double>peso;
    private HashMap<LocalDate, Double>altura;

    public Persona(String nombre, String apellido, LocalDate nacimiento, HashMap<LocalDate, Double>peso, HashMap<LocalDate, Double>altura){
        this.nombre= nombre;
        this.apellido= apellido;
        this.nacimiento= nacimiento;
        this.peso= peso;
        this.altura= altura;
    }

    public Persona() {
        this.nombre= "nombre";
        this.apellido= "apellido";
        this.nacimiento= LocalDate.of(2006,06,03);
        this.peso= new HashMap<LocalDate, Double>();
        this.altura=new HashMap<LocalDate, Double>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public HashMap<LocalDate, Double> getPeso() {
        return peso;
    }

    public void setPeso(HashMap<LocalDate, Double> peso) {
        this.peso = peso;
    }

    public HashMap<LocalDate, Double> getAltura() {
        return altura;
    }

    public void setAltura(HashMap<LocalDate, Double> altura) {
        this.altura = altura;
    }

    public String fechaPart(LocalDate fechaE){
        double pesoO= 0;
        double alturaO= 0;
        if(getPeso().containsKey(fechaE) || getAltura().containsKey(fechaE)){
            pesoO= getPeso().get(fechaE);
            alturaO= getAltura().get(fechaE);
        }

        return "Peso: "+pesoO+" altura: "+alturaO;
    }

    public String promedioAnio(int anioE){
        double pesos= 0;
        double alturas= 0;
        double pesoC= 0;
        double alturaC= 0;
        for (Map.Entry<LocalDate, Double>alturaT : altura.entrySet()) {
            for (Map.Entry<LocalDate, Double>pesoT : peso.entrySet()) {
                pesos= pesoT.getValue();
                alturas= alturaT.getValue();
                if (alturaT.getKey().getYear() == anioE || pesoT.getKey().getYear() == anioE) {
                    pesoC= pesoT.getValue();
                    alturaC= alturaT.getValue();
                }
            }
        }
        double pesosT= pesoC/pesos;
        double alturasT= alturaC/alturas;
        return "el promedio de peso es: "+pesosT+" y la altura: "+alturasT;
    }

    public double porcAltura(LocalDate fecha1, LocalDate fecha2) {
        double resultado= 0;
        double alturas= 0;

        for (Map.Entry<LocalDate, Double>alturasT : altura.entrySet()) {
            alturas=alturasT.getValue();
        }

        resultado= ((getAltura().get(fecha2) - getAltura().get(fecha1))/alturas)*100;

        return resultado;
    }
}
