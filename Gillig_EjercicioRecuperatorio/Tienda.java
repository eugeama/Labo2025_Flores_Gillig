package Gillig_EjercicioRecuperatorio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tienda {
    ArrayList<Producto>productos;


    public Tienda (ArrayList<Producto>productos){
        this.productos=productos;
    }

    public Tienda(){
        this.productos= new ArrayList<>();
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


    public ArrayList<String> productosVencidos(){
        ArrayList<String>respuesta= new ArrayList<>();

        for(Producto producto: productos){
            if(producto.vencido(LocalDate.now()).equals(true)){
                respuesta.add(producto.getNombre() + " " + producto.getMarca());
            }
        }

        return respuesta;
    }

    public String masProductos(){
        int masCantidad= 0;
        String respuesta= "";
        for(Producto producto: productos){
            if(producto.getEmpresa().getProductos().size()>masCantidad) {
                masCantidad= producto.getEmpresa().getProductos().size();
                respuesta= producto.getEmpresa().getNombreEmpresa();
            }
        }

        return respuesta;
    }

    public String beneficioEmpresa(){
        int prodTotales= 0;
        int prodReciclable= 0;
        String respuesta= "No aplica";
        for(Producto producto: productos){
            prodTotales+=1;
            if(producto.envoltorioRe()){
                    prodReciclable+=1;
            }
        }
        int cuenta=(prodReciclable/prodTotales)/100;
        if(cuenta>45){
            respuesta= "Sí aplica";
        }

        return respuesta;
    }
}
