package ejercicios_Curso_Gillig;

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Empleado>empleados = new ArrayList<>();
    private int ultimoempleadoagregadoIndex= -1;

    public Departamento(String nombre, ArrayList<Empleado> empleados) {
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

    public void agregarEmpleado(Empleado empleadoA){
        if(ultimoempleadoagregadoIndex<empleados.size()){
            ultimoempleadoagregadoIndex++;
            empleados.add(empleadoA);
        }
    }


    public ArrayList<Empleado> getEmpleado(){
        ArrayList<Empleado> actualizarEmpleados = new ArrayList<>();

        for (Empleado e: empleados){
            actualizarEmpleados.add(e);
        }
        return actualizarEmpleados;
    }

    public int getEmpleadoT(){
        return ultimoempleadoagregadoIndex+1;
    }

    public Empleado getEmpleadoID(int empId){
        for(Empleado e: empleados){

            if(empId==e.getID()){
                return e;
            }
        }
        return null;
    }


    public double getSalarioTotal(){
        double totalSalario=0.0;
        for (Empleado e: empleados){
            totalSalario+=e.getSalario();
        }
        return totalSalario;
    }

    public double getSalarioP(){
        if(ultimoempleadoagregadoIndex>-1){
            return getSalarioTotal()/empleados.size();
        }
        return 0.0;
    }
    public String toString(){
        return nombre;
    }
}
