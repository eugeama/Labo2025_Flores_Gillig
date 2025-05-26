package Almuerzos;

import java.util.ArrayList;
import java.time.LocalDate;

public class Sistema {
    ArrayList<Pedido> pedidos;
    ArrayList<Plato>platos;


    public void agregarPlato(Plato nuevoPlato){
        platos.add(nuevoPlato);
    }

    public void eliminarPlato(Plato platoEliminar){
        for(Plato plato: platos){
            if(plato.equals(platoEliminar)){
                platos.remove(plato);
            }
        }
    }

    public void modificarPlato(Plato platoViejo, Plato platoModificado){
        for(Plato plato: platos){
            if(plato.equals(platoViejo)){
                platos.remove(plato);
                platos.add(platoModificado);
            }
        }
    }

    public void agregarPedido(Pedido nuevoPedido){
        pedidos.add(nuevoPedido);
        listaPedidos(nuevoPedido);
    }

    public ArrayList<Pedido> listaPedidos(Pedido masPedido){
        ArrayList<Pedido>todoPedidos= new ArrayList<Pedido>();
        todoPedidos.add(masPedido);
        return todoPedidos;
    }

    public boolean esProfe() {
        boolean esProfe=false;

        return esProfe
    }

    public ArrayList<Pedido> platosACocinar(){
        ArrayList<Pedido>platosCocinados= new ArrayList<>();
        double porcentaje=0;
        for(Pedido pedido: pedidos){
            if(pedido.getEstadoEntrega().equals("A preparar") && pedido.getFechaEntrega().equals(LocalDate.now())){
                if(esProfe(){

            }
        }
        return ;
    }
}
}
