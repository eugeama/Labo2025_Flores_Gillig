package Gillig_EjercicioRecuperatorio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class ProdPerecederos extends Producto {
    public LocalDate fechaVencimiento;
    public int diasConsumo;


    public ProdPerecederos (int codigo, String nombre, String marca, Empresa empresa, LocalDate fechaEnvasado, int precio, LocalDate fechaVencimiento, int diasConsumo) {
        super(codigo, nombre, marca, empresa, fechaEnvasado, precio);
        this.fechaVencimiento = fechaVencimiento;
        this.diasConsumo = diasConsumo;
    }


    public ProdPerecederos(){
        this.fechaVencimiento = LocalDate.now();
        this.diasConsumo = 7;
    }

    public int getDiasConsumo() {
        return diasConsumo;
    }

    public void setDiasConsumo(int diasConsumo) {
        this.diasConsumo = diasConsumo;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    @Override
     Boolean vencido(LocalDate fecha){
        if(fecha.isAfter(getFechaVencimiento())) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int diasVencer(){
        int respuesta= -1;
        if(vencido(LocalDate.now()).equals(false)){
            respuesta= (int) ChronoUnit.DAYS.between(LocalDate.now(), getFechaVencimiento());
        }
            return respuesta;
    }

    @Override
    Boolean envoltorioRe(){
        return false;
    }

    public String puedeConsumirse() {
        String respuesta= "No se puede consumir";
        if(vencido(LocalDate.now()).equals(true) && LocalDate.now().isAfter(getFechaVencimiento().plusDays(getDiasConsumo()))){
            respuesta="Puede consumirse";
        }

        return respuesta;
    }
}
