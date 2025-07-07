package Gillig_EjercicioRecuperatorio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Empleado {
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;
    public LocalDate fechaIngreso;
    public int salario;
    ArrayList<Producto> productoRegalos;


    public Empleado(String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, int salario,
    ArrayList<Producto> productoRegalos){
        this.nombre= nombre;
        this.apellido= apellido;
        this.fechaNacimiento= fechaNacimiento;
        this.fechaIngreso= fechaIngreso;
        this.salario= salario;
        this.productoRegalos= productoRegalos;
    }

    public Empleado(){
        this.nombre= "pepe";
        this.apellido= "lolo";
        this.fechaNacimiento= LocalDate.now();
        this.fechaIngreso= LocalDate.now();
        this.salario= 1500;
        this.productoRegalos= new ArrayList<>();
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductoRegalos() {
        return productoRegalos;
    }

    public void setProductoRegalos(ArrayList<Producto> productoRegalos) {
        this.productoRegalos = productoRegalos;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void agregarProducto(Producto producto){
        productoRegalos.add(producto);
    }

    public int aniosEmpresa(){
        int respuesta= (int) ChronoUnit.YEARS.between(getFechaIngreso(), LocalDate.now());

        return respuesta;
    }
}
