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

int MayorSueldo (vector<Empleado>&Empleados, vector<Empleado>&Empleados2, int mayorsalario) {
    for(int i= 0; i < Empleados.size(); i++){
        if(Empleados[i].salario>mayorsalario){
            mayorsalario=Empleados[i].salario;
        }

        if (Empleados[i].salario <= 400000) {
            Empleados2.push_back(Empleados[i]);
        }
    }
}

int main (){
    Empleado empleado;
    int mayorsalario;
    vector<Empleado>Empleados;
    vector<Empleado>Empleados2;
    MayorSueldo(Empleados, Empleados2, mayorsalario);
    cout<< mayorsalario << endl;
    for(int i= 0; i<Empleados2.size(); i++){
    cout<< Empleados2[i].nombre << endl;
    cout<< Empleados2[i].apellido << endl;
    }

}