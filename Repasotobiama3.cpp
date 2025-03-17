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
    GestionPedidos Pedido;
    int prod;
    int cant;
    int precio=0;
    string respuesta="no";

    cout<<"Ingrese numero de pedido"<<endl;
    cin>>Pedido.NumPedido;
    cout<<Pedido.NombreCliente;
    while(respuesta != "no"){
        cout<<"Ingrese el id del producto: "<<endl;
        cin>>prod;

        Producto p = ConseguirProducto(prod, produc);
        if(p.NumProducto!=0){
        Pedido.Productos.push_back(ConseguirProducto(prod, produc));
        cout<<"ingrese las cantidades"<<endl;
        cin>>cant;
        Pedido.Cantidades.push_back(cant);
        cout<<"Ingrese el precio"<<endl;
        cin>>precio;
        precio+=precio;
        Pedido.Precios.push_back(precio);
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

    cout<<"¿qué quiere hacer?"<<endl;
    cout<<"1.Ingresar un nuevo pedido."<<endl;
    cout<<"2.Cancelar un pedido."<<endl;
    cout<<"3.Mostrar los pedidos en curso y el total de cada uno."<<endl;
    cout<<"4.Calcular el ingreso total del día."<<endl;
    cin>>respuesta;

    if(respuesta == 1){
        NuevoPedido(pedidos, produc);
    }
    else if(respuesta == 2){
        CancelarPedido(pedidos);
    }
    else if(respuesta == 3){
        PedidosTotales(pedidos);
    }
    else if(respuesta == 4){
        IngresoTotal (pedidos);
    }
    else{
        cout<<"respuesta no válida"<<endl;
    }
}