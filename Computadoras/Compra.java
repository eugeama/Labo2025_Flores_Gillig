package Computadoras;

import java.sql.Array;
import java.util.ArrayList;

public class Compra {
    private CPU dispCPU;
    ArrayList<Entrada> dispEntrada;
    ArrayList<Salida> dispSalida;
    Cliente compraCliente;


    public Compra(String fabricante, String modelo, int precio, int stock, String tecladoMouse, String pantallaImpresora, String nombre, String apellido, int celular, String metodoPago, int tarjeta){
        this.dispCPU=new CPU(fabricante, modelo, precio, stock);
        this.dispEntrada=new ArrayList<Entrada>();
        this.dispSalida=new ArrayList<Salida>();
        this.compraCliente= new Cliente(nombre, apellido, celular, metodoPago, tarjeta);
    }


    public CPU getDispCPU() {
        return dispCPU;
    }

    public void setDispCPU(CPU dispCPU) {
        this.dispCPU = dispCPU;
    }

    public ArrayList<Entrada> getDispEntrada() {
        return dispEntrada;
    }

    public void setDispEntrada(ArrayList<Entrada> dispEntrada) {
        this.dispEntrada = dispEntrada;
    }

    public ArrayList<Salida> getDispSalida() {
        return dispSalida;
    }

    public void setDispSalida(ArrayList<Salida> dispSalida) {
        this.dispSalida = dispSalida;
    }

    public Cliente getCompraCliente() {
        return compraCliente;
    }

    public void setCompraCliente(Cliente compraCliente) {
        this.compraCliente = compraCliente;
    }
}
