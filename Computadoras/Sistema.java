package Computadoras;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Sistema {
    ArrayList<Entrada>dispEntrada;
    ArrayList<Salida>dispSalida;
    ArrayList<Compra>compras;


    public Sistema(ArrayList<Entrada> dispEntrada, ArrayList<Salida> dispSalida){
        this.dispEntrada= dispEntrada;
        this.dispSalida=dispSalida;
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


    public void agregarPerifericoEntrada(Entrada nuevoDispositivo){
        dispEntrada.add(nuevoDispositivo);
    }

    public void agregarPerifericoSalida(Salida nuevoDispositivo){
        dispSalida.add(nuevoDispositivo);
    }

    public void agregarCompra(Compra nuevaCompra){
        compras.add(nuevaCompra);

        for(Entrada entrada: nuevaCompra.getDispEntrada()){
            if (entrada.getTecladoMouse().equals("Teclado") || entrada.getTecladoMouse().equals("Mouse")) {
                entrada.setStock(entrada.getStock() - 1);
            }
        }

        for (Salida salida : nuevaCompra.getDispSalida()) {
            if (salida.getPantallaImpresora().equals("Pantalla") || salida.getPantallaImpresora().equals("Impresora")) {
                salida.setStock(salida.getStock() - 1);
            }
        }
    }

    public int precioTotal(){
        int precioFinal= 0;
        for(Compra compra: compras){
            for (Entrada entrada : dispEntrada) {
                precioFinal=precioFinal+ entrada.getPrecio();
            }
            for (Salida salida : dispSalida) {
                precioFinal=precioFinal+salida.getPrecio();
            }
        }
        return precioFinal;
    }

    public int cantDispositivosVendida (Compra computadora){
        int dispositivos= 0;
        for(Entrada entrada: computadora.getDispEntrada()){
            dispositivos++;
        }
        for (Salida salida : computadora.getDispSalida()) {
            dispositivos++;
        }

        return dispositivos;
    }
}
