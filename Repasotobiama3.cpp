#include <iostream>
#include <vector>
using namespace std;

struct Producto{
    int NumProducto;
    string ProductosNombre;
    int Cantidad;
    int Precio;
};

struct Fecha{
    int dia;
    int mes;
    int anio;
};

struct GestionPedidos{
    int NumPedido;
    string NombreCliente;
    vector<Producto>Productos;
    vector<int>Cantidades;
    vector<int>Precios;
    Fecha fecha;
    bool Cancelado;
};

Producto ConseguirProducto(int prod, vector<Producto>produc){
    for(int i; i<produc.size();i++){
        if(produc[i].NumProducto==prod){
            return produc[i];
        }
    }
}

int NuevoPedido(vector<GestionPedidos>&pedidos, vector<Producto>produc){
    Producto prodd;
    GestionPedidos aux;
    int prod;
    int cant;
    int precio=0;
    string respuesta="no";

    cout<<"Ingrese numero de pedido"<<endl;
    cin>>aux.NumPedido;
    cout<<aux.NombreCliente;
    while(respuesta != "no"){
        cout<<"Ingrese el id del producto: "<<endl;
        cin>>prod;

        Producto p = ConseguirProducto(prod, produc);
        if(p.NumProducto!=0){
        aux.Productos.push_back(ConseguirProducto(prod, produc));
        cout<<"ingrese las cantidades"<<endl;
        cin>>cant;
        aux.Cantidades.push_back(cant);
        cout<<"Ingrese el precio"<<endl;
        cin>>precio;
        precio+=precio;
        aux.Precios.push_back(precio);
        cout<<"¿ingresar otro producto? si/no"<<endl;
        cin>>respuesta;
        }
    }

    return 0;
};

int CancelarPedido (vector<GestionPedidos>&pedidos){
    int NumPedidoCan;
    cout<<"Ingrese el número del pedido que se quiere borrar"<<endl;
    cin>>NumPedidoCan;
    for(int i=0; i<pedidos.size(); i++){
        if(NumPedidoCan == pedidos[i].NumPedido){
            pedidos[i].Cancelado=true;
        }
    }
    return 0;
};

int PedidosTotales(vector<GestionPedidos>&pedidos){
    for(int i=0;i<pedidos.size();i++){
        if(pedidos[i].Cancelado==false){
            cout<<"número de pedido: "<<pedidos[i].NumPedido<<endl;
            for(int j=0; j < pedidos[i].Precios.size(); j++){
                cout<<"precio del producto: "<<pedidos[i].Precios[j]<<endl;  
            }
        }
    }
};

int IngresoTotal (vector<GestionPedidos>&pedidos){
    int TotalDelDia;
    for(int i=0;i<pedidos.size();i++){
         if(pedidos[i].Cancelado==false){
            for(int j=0; j < pedidos[i].Precios.size(); j++){
                TotalDelDia+=pedidos[i].Precios[j];
            }
        }
    }
    return TotalDelDia;
};

int main(){
    GestionPedidos Pedido;
    vector<GestionPedidos>pedidos;
    vector<Producto>produc;
    int respuesta;
        NuevoPedido(pedidos, produc);
        CancelarPedido(pedidos);
        PedidosTotales(pedidos);
        IngresoTotal (pedidos);
}
