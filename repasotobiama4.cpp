#include <iostream>
#include <vector>
using namespace std;

struct Fecha {
    int dia;
    int mes;
    int anio;
};

struct Paciente {
    string nombre;
    int edad;
    int numero_hist_clinica;
    Fecha proxima_cita;
};

int main() {
    vector<Paciente> pacientes;

    int cantidad_pacientes;
    cout << "Ingrese la cantidad de pacientes: ";
    cin >> cantidad_pacientes;

    for (int i = 0; i < cantidad_pacientes; i++) {
        Paciente paciente;
        
        cout << "Ingrese el nombre: ";
        cin >> paciente.nombre;
        cout << "Ingrese la edad: ";
        cin >> paciente.edad;
        cout << "Ingrese número de historia clínica: ";
        cin >> paciente.numero_hist_clinica;
        cout << "Ingrese día de la próxima cita: ";
        cin >> paciente.proxima_cita.dia;
        cout << "Ingrese mes de la próxima cita: ";
        cin >> paciente.proxima_cita.mes;
        cout << "Ingrese año: ";
        cin >> paciente.proxima_cita.anio;

        pacientes.push_back(paciente);
    }


    int dia_buscar, mes_buscar, anio_buscar;
    cout << "Ingrese el día del que quiera ver las citas programadas: ";
    cin >> dia_buscar;
    cout << "Ingrese el mes: ";
    cin >> mes_buscar;
    cout << "Ingrese el año: ";
    cin >> anio_buscar;

    bool encontrado = false;

    for (int i = 0; i < pacientes.size(); i++) {
        if (pacientes[i].proxima_cita.dia == dia_buscar && 
            pacientes[i].proxima_cita.mes == mes_buscar && 
            pacientes[i].proxima_cita.anio == anio_buscar) {
            cout << "Paciente: " << pacientes[i].nombre << endl;
            cout << "Historia clínica: " << pacientes[i].numero_hist_clinica << endl;
            cout << "Edad: " << pacientes[i].edad << endl;
            cout << "Fecha de la cita: " << pacientes[i].proxima_cita.dia << "/"
                 << pacientes[i].proxima_cita.mes << "/"
                 << pacientes[i].proxima_cita.anio << endl;
            encontrado = true;
        }
    }

    if (!encontrado) {
        cout << "No hay citas programadas esa fecha" << endl;
    }

    
    for (int i = 0; i < pacientes.size(); i++) {  
            cout << "Nombre: " << pacientes[i].nombre << endl;
            cout << "Edad: " << pacientes[i].edad << endl;
            cout << "Número de Historia Clínica: " << pacientes[i].numero_hist_clinica << endl;
            cout << "Próxima cita: " << pacientes[i].proxima_cita.dia << "/"
                 << pacientes[i].proxima_cita.mes << "/" << pacientes[i].proxima_cita.anio << endl;
        }

    int num_historia;
    cout << "Ingrese el número de historia clínica: ";
    cin >> num_historia;

    bool se_encuentra = false;

    for (int i = 0; i < pacientes.size(); i++) {
        if (pacientes[i].numero_hist_clinica==num_historia) {
            pacientes[i].proxima_cita = {0, 0, 0};
            se_encuentra = true;
            break;
        }
       
    }
    
    if (!se_encuentra) {
        cout << "No se encontró un paciente con ese número de historia clínica." << endl;
    }
    return 0;
}    