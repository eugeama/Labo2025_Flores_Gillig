package objetos;

import java.util.ArrayList;

public class Departamento2 {
    private String nombre;
    private ArrayList<Empleado>empleados = new ArrayList<>();
    private int ultimoempleadoagregadoIndex= -1;

    public Departamento2(String nombre, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void addEmp(Empleado anEmpleadoe){
        if(ultimoempleadoagregadoIndex<empleados.size()){
            ultimoempleadoagregadoIndex++;
            empleados.add(anEmpleadoe);
        }
    }


    public ArrayList<Empleado> getEmpleado(){
        ArrayList<Empleado> actualizarEmpleados = new ArrayList<>();

        for (Empleado e: empleados){
            actualizarEmpleados.add(e);
        }
        return actualizarEmpleados;
    }

    public int getEmpleadosCount(){
        return ultimoempleadoagregadoIndex+1;
    }

    public Empleado getEmpleadoById(int empId){
        for(Empleado e: empleados){

            if(empId==e.getID()){
                return e;
            }
        }
        return null;
    }


    public double getSueldo(){
        double totalSalario=0.0;
        for (Empleado e: empleados){
            totalSalario+=e.getSueldo();
        }
        return totalSalario;
    }

    public double getSueldoPromedio(){
        if(ultimoempleadoagregadoIndex>-1){
            return getSueldo()/empleados.size();
        }
        return 0.0;
    }
    public String toString(){
        return nombre;
    }
}

