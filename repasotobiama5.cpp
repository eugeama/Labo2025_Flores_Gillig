#include <iostream>
#include <vector>
using namespace std;

struct ProductosMac{
    string Nombre;
    bool Promocion;
    int CantidadVentas;
    int Precio;
    string Categoria;
};

struct Fecha{
    int Dia;
    int Mes;
    int Anio;
};

struct PedidosMac{
    string NombreCliente;
    vector<ProductosMac>ProductoPedido;
    vector<ProductosMac>CantidadProducto;
    Fecha fecha;
    int PrecioTotal;
};

void IngresarProductos(vector<ProductosMac>&productoss){
    ProductosMac producto;
    string respuesta="si";
    while(respuesta=="si"){
        cout<<"Ingrese el nombre del producto"<<endl;
        cin>>producto.Nombre;
        cout<<"Ingrese si tiene promoción o no (true/false)"<<endl;
        cin>>producto.Promocion;
        cout<<"Ingrese la cantidad de ventas"<<endl;
        cin>>producto.CantidadVentas;
        cout<<"Ingrese el precio"<<endl;
        cin>>producto.Precio;
        cout<<"Ingrese la categoría"<<endl;
        cin>>producto.Categoria;
        
        productoss.push_back(producto);
        cout<<"¿querés ingresar otro producto? si/no"<<endl;
        cin>>respuesta;
    }
}

int RegistrarPedido (vector<ProductosMac>productoss, vector<PedidosMac>pedidoss){
    ProductosMac productos;
    PedidosMac pedidos;
    string prod;
    int cantidad;
    string respuesta;
    int precio= 0;
    int descuento= 0;
    cout<<"Ingrese el nombre del cliente: "<<endl;
    cin>>pedidos.NombreCliente;
    while(respuesta!="si"){
        cout<<"Ingrese el producto pedido:"<<endl;
        cin>>prod;
        cout<<"Ingrese la cantidad de ese producto: "<<endl;
        cin>>cantidad;
        for(int i=0;i<productoss.size();i++){
            if(prod==productoss[i].Nombre){
                pedidos.ProductoPedido.push_back(productoss[i]);
                productoss[i].CantidadVentas+=cantidad;
            }
        }

        if(productos.Nombre == prod){
            if(productos.Promocion=true){
                descuento= productos.Precio*(20/100);
                precio=precio+descuento;
            }
            else{
                precio=precio+productos.Precio;
            }
        }
        pedidos.PrecioTotal=precio;
        pedidoss.push_back(pedidos);
        cout<<"¿querés agregar otro producto? si/no"<<endl;
        cin>>respuesta;
    }
    cout<<"Ingrese el dia: "<<endl;
    cin>>pedidos.fecha.Dia;
    cout<<"Ingrese el mes: "<<endl;
    cin>>pedidos.fecha.Mes;
    cout<<"Ingrese el año: "<<endl;
    cin>>pedidos.fecha.Anio;
}

int ConsultarPedido (vector<PedidosMac>pedidoss){
    ProductosMac productos;
    PedidosMac pedidos;
    string resp;
    cout<<"Ingrese el nombre del cliente del pedido que busca: "<<endl;
    cin>>resp;
    for(int i=0;i<pedidoss.size();i++){
        if(resp == pedidoss[i].NombreCliente){
            cout<<pedidoss[i].NombreCliente<<endl;
            for(int ii=0;ii<pedidoss[i].ProductoPedido.size();ii++){
                cout<<pedidoss[i].ProductoPedido[ii]<<endl;
            }
            for(int iii=0;iii<pedidoss[i].CantidadProducto.size();iii++){
                cout<<pedidoss[i].CantidadProducto[iii]<<endl;
            }
            cout<<pedidoss[i].fecha.Dia<<"/"<<pedidoss[i].fecha.Mes<<"/"<<pedidoss[i].fecha.Anio<<endl;
            cout<<pedidoss[i].PrecioTotal<<endl;
        }
    }
}

int ProductoMaMe (){
    ProductosMac productos;
    int orden;

}

int main() {
    vector<ProductosMac>productoss;
    vector<PedidosMac>pedidoss;
    PedidosMac pedidos;
    string respuesta;
    cout<<"por favor ingrese todos los productos primero"<<endl;
    IngresarProductos(productoss);
    cout<<"¿Qué quiere hacer?"<<endl;
    cout<<"1.Registrar un pedido"<<endl;
    cout<<"2.Consultar un pedido"<<endl;
    cout<<"3.Mostrar los productos"<<endl;
    cin>>respuesta;
    if(respuesta=="1"){
        RegistrarPedido(productoss, pedidoss);
    }
    else if(respuesta=="2"){
        ConsultarPedido(pedidoss);        
    }
    else if(respuesta=="3"){
        //ProductoMaMe(productoss);      
    }
    else{
        cout<<"No es válido"<<endl;
    }
}
