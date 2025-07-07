package Gillig_EjercicioRecuperatorio;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Producto {
    public int codigo;
    public String nombre;
    public String marca;
    public Empresa empresa;
    public LocalDate fechaEnvasado;
    public int precio;


    public Producto(int codigo, String nombre, String marca, Empresa empresa, LocalDate fechaEnvasado, int precio) {
        this.codigo= codigo;
        this.nombre= nombre;
        this.marca= marca;
        this.empresa= empresa;
        this.fechaEnvasado= fechaEnvasado;
        this.precio= precio;
    }

    public Producto(){
        this.codigo= 2145;
        this.nombre= "papa";
        this.marca= "pepo";
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        this.empresa= new Empresa(productos, "pipi 2345", "pipu", empleados);
        this.fechaEnvasado= LocalDate.now();
        this.precio= 1500;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    abstract Boolean vencido(LocalDate fecha);

    abstract int diasVencer();

    abstract Boolean envoltorioRe();
}
