package Gillig_EjercicioRecuperatorio;

import java.time.LocalDate;
import java.util.ArrayList;

public class ProdNoPerecederos extends Producto {
    public int peso;
    public Boolean envoltorioReciclable;


    public ProdNoPerecederos (int codigo, String nombre, String marca, Empresa empresa, LocalDate fechaEnvasado, int precio, int peso, Boolean envoltorioReciclable) {
        super(codigo, nombre, marca, empresa, fechaEnvasado, precio);
        this.peso= peso;
        this.envoltorioReciclable= envoltorioReciclable;
    }

    public ProdNoPerecederos (){
        this.peso= 4;
        this.envoltorioReciclable= false;
    }


    public Boolean getEnvoltorioReciclable() {
        return envoltorioReciclable;
    }

    public void setEnvoltorioReciclable(Boolean envoltorioReciclable) {
        this.envoltorioReciclable = envoltorioReciclable;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    Boolean vencido(LocalDate fecha){
            return false;
    }

    @Override
    public int diasVencer(){
        return 0;
    }

    @Override
    Boolean envoltorioRe(){
        Boolean respuesta= false;
        if(getEnvoltorioReciclable().equals(true)){
            respuesta= true;
        }

        return respuesta;
    }
}
