package Gillig_EjercicioRecuperatorio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {
    ArrayList<Producto>productos;
    public String domicilio;
    public String nombreEmpresa;
    ArrayList<Empleado>empleados;


    public Empresa(ArrayList<Producto> productos, String domicilio, String nombreEmpresa, ArrayList<Empleado> empleados) {
        this.productos= productos;
        this.domicilio= domicilio;
        this.nombreEmpresa= nombreEmpresa;
        this.empleados= empleados;

    }

    public Empresa(){
        this.productos= new ArrayList<>();
        this.domicilio= "pipi 2345";
        this.nombreEmpresa= "aoao";
        this.empleados= new ArrayList<>();
    }


    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public int calcularProductos(){
        int respuesta= 0;
        for(Empleado empleado: empleados){
            respuesta+=empleado.productoRegalos.size();
        }

        return respuesta;
    }

    public int cantPaga(){
        int respuesta= 0;
        for(Empleado empleado: empleados){
            respuesta=empleado.salario;
        }

        return respuesta;
    }

    public ArrayList<String> empleadosMayores(){
        int edad= 0;
        ArrayList<String>respuesta= new ArrayList<>();
        for(Empleado empleado: empleados){
            edad= LocalDate.now().getYear() - empleado.getFechaNacimiento().getYear();
                if(edad>60){
                    respuesta.add(empleado.getNombre());
                }
        }

        return respuesta;
    }

}
