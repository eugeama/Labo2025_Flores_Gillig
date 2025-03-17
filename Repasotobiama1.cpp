#include <iostream>
#include <vector>
using namespace std;

struct fecha{
    int dia;
    int mes;
    int anio;
};

struct Empleado {
    string nombre;
    string apellido;
    fecha fecha_de_nacimiento;
    string sexo;
    int salario;
};

Empleado IngresarDatos( vector<Empleado>&Empleados, Empleado empleado, fecha Fecha){
    cout<<"Ingrese el nombre del empleado: "<<endl;
    cin>>empleado.nombre;
    cout<<"Ingrese el apellido del empleado: "<<endl;
    cin>>empleado.apellido;
    cout<<"Ingrese el dia de nacimiento del empleado: "<<endl;
    cin>>empleado.fecha_de_nacimiento.dia;
    cout<<"Ingrese el mes de nacimiento del empleado: "<<endl;
    cin>>empleado.fecha_de_nacimiento.mes;
    cout<<"Ingrese el año de nacimiento del empleado: "<<endl;
    cin>>empleado.fecha_de_nacimiento.anio;
    cout<<"Ingrese el sexo del empleado: "<<endl;
    cin>>empleado.sexo;
    cout<<"Ingrese el salario del empleado: "<<endl;
    cin>>empleado.salario;
}

Empleado MayorSueldo (vector<Empleado>Empleados, vector<Empleado>&Empleados2) {
    Empleado aux= Empleados[0];
    for(int i= 0; i < Empleados.size(); i++){
        if(Empleados[i].salario>aux.salario){
            aux=Empleados[i];
        }

        if (Empleados[i].salario <= 400000) {
            Empleados2.push_back(Empleados[i]);
        }
    }
    return aux;
}

int main (){
    Empleado empleado;
    fecha Fecha;
    int mayorsalario=0;
    vector<Empleado>Empleados;
    vector<Empleado>Empleados2;
    Empleado aux;
    IngresarDatos(Empleados, empleado, Fecha);
    MayorSueldo(Empleados, Empleados2);
    for(int i= 0; i<Empleados2.size(); i++){
    cout<< Empleados2[i].nombre << endl;
    cout<< Empleados2[i].apellido << endl;
    }

}