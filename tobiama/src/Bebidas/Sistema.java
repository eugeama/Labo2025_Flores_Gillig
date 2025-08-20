package Bebidas;

import java.util.ArrayList;

public class Sistema {
    ArrayList<IdentificacionPersona>Consumidores;

    public ArrayList<IdentificacionPersona> getConsumidores() {
        return Consumidores;
    }

    public void setConsumidores(ArrayList<IdentificacionPersona> consumidores) {
        Consumidores = consumidores;
    }

    public int mejorCoeficiente (){
        int coeficienteMayor=0;

        for(IdentificacionPersona persona: Consumidores){
            int consumos= persona.coeficienteHidratacion(persona.getConsumos());
            if (consumos > coeficienteMayor){
                coeficienteMayor= consumos;
            }
        }
        return coeficienteMayor;
    }

    public int peorCoeficiente (){
        int coeficienteMenor=0;

        for(IdentificacionPersona persona: Consumidores){
            int consumos= persona.coeficienteHidratacion(persona.getConsumos());
            if (consumos < coeficienteMenor){
                coeficienteMenor= consumos;
            }
        }
        return coeficienteMenor;
    }

    public void ingresoConsumo (Bebida bebidaIng, int cantIng, int DNIIng){
        for(IdentificacionPersona persona: Consumidores){
            if(persona.getDNI()==DNIIng){
                ListaConsumo lc = new ListaConsumo(bebidaIng, cantIng);
                persona.getConsumos().add(lc);
            }
        }
    }
}
