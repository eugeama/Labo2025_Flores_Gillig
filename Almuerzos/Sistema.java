package Almuerzos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sistema {
    ArrayList<Pedido> pedidos;
    ArrayList<Plato> platos;
<<<<<<< HEAD


    public void agregarPlato(Plato nuevoPlato) {
=======
    Pedido pedido= new Pedido();


    public Sistema(ArrayList<Pedido>pedidos, ArrayList<Plato>platos) {
        this.pedidos = pedidos;
        this.platos= platos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }


    public void agregarPlato(Plato nuevoPlato) {

>>>>>>> 7776519b08aa00d9ea4291da2600844c37c58cfc
        platos.add(nuevoPlato);
    }

    public void eliminarPlato(Plato platoEliminar) {
        for (Plato plato : platos) {
            if (plato.equals(platoEliminar)) {
                platos.remove(plato);
            }
        }
    }

    public void modificarPlato(Plato platoViejo, Plato platoModificado) {
        for (Plato plato : platos) {
            if (plato.equals(platoViejo)) {
                platos.remove(plato);
                platos.add(platoModificado);
            }
        }
    }

    public void agregarPedido(Pedido nuevoPedido) {
        pedidos.add(nuevoPedido);
        listaPedidos(nuevoPedido);
    }

    public ArrayList<Pedido> listaPedidos(Pedido masPedido) {
        ArrayList<Pedido> todoPedidos = new ArrayList<Pedido>();
        todoPedidos.add(masPedido);
        return todoPedidos;
    }

<<<<<<< HEAD


    public ArrayList<Pedido> platosACocinar() {
        ArrayList<Pedido> platosCocinados = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            if (pedido.getEstadoEntrega().equals("A preparar") && pedido.getFechaEntrega().equals(LocalDate.now())) {
=======
    public void modificarPedido(Pedido pedido, int index){

        pedidos.set(index, pedido);
    }

    public void checkPrecio(Pedido pedido, int numPedido){
        if(pedido.getSolicitante().getClass().getCanonicalName().equals("Profesor")){
            pedido.getPlatos().setPrecio(pedido.getPlatos().getPrecio()+(pedido.getPlatos().getPrecio()*0.10));
        }
        modificarPedido(pedido, numPedido);
    }

    public ArrayList<Plato> cuantosPlatosPorDia(LocalDate dia){
        ArrayList<Plato>platosACrear=new ArrayList<>();
        for(Pedido p:pedidos){
            if(p.getFechaCreacion().equals(dia)){
                platosACrear.add(p.getPlatos());
>>>>>>> 7776519b08aa00d9ea4291da2600844c37c58cfc
            }

        }
<<<<<<< HEAD
        return;
=======
        return platosACrear;
    }
    public Map<Plato, Integer> platosMasPedidos(){
        Map<Plato, Integer> counter=new HashMap<>();
        for(Pedido p:pedidos){
            Plato plato=p.getPlatos();
            counter.put(plato, counter.getOrDefault(plato, 0)+1);
        }
        return counter;
    }
    public ArrayList<Plato> top3() {
        Map<Plato, Integer>counter=platosMasPedidos();
        int n = counter.size();

        ArrayList<Map.Entry<Plato, Integer>> entryList=new ArrayList<>();
        entryList.addAll(counter.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        ArrayList<Plato>topPlatos=new ArrayList<>();
        for (int i = 0; i < Math.min(3, entryList.size()); i++) {
            topPlatos.add(entryList.get(i).getKey());
        }
        return topPlatos;
>>>>>>> 7776519b08aa00d9ea4291da2600844c37c58cfc
    }
}
