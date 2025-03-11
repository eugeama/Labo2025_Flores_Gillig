#include <iostream>
#include <vector>
using namespace std;

struct GestionPedidos{
    int NumPedido;
    string NombreCliente;
    vector<string>Productos;
    vector<int>Cantidades;
    vector<int>Precios;
    bool Cancelado;
};

int NuevoPedido (){
    GestionPedidos Pedido;
    string prod;
    int cant;
    int precio;

    cout<<"Ingrese numero de pedido"<<endl;
    cin>>Pedido.NumPedido;
    cout<<Pedido.NombreCliente;
    while(prod != "listo"){
        cout<<"Ingrese todos los productos necesarios. Para terminar ponga 'listo'"<<endl;
        cin>>prod;
        cout<<"ingrese las cantidades"<<endl;
        cin>>cant;
        cout<<"Ingrese el precio"<<endl;
        cin>>precio;
        if(prod != "listo"){
            Pedido.Productos.push_back(prod);
            Pedido.Cantidades.push_back(cant);
            Pedido.Precios.push_back(precio);
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
                TotalDelDia=TotalDelDia+pedidos[i].Precios[j];
            }
        }
    }
    return TotalDelDia;
};

int main(){
    GestionPedidos Pedido;
    vector<GestionPedidos>pedidos;
    int respuesta;

    cout<<"¿qué quiere hacer?"<<endl;
    cout<<"1.Ingresar un nuevo pedido."<<endl;
    cout<<"2.Cancelar un pedido."<<endl;
    cout<<"3.Mostrar los pedidos en curso y el total de cada uno."<<endl;
    cout<<"4.Calcular el ingreso total del día."<<endl;
    cin>>respuesta;

    if(respuesta == 1){
        NuevoPedido();
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