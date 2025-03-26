#include <iostream>
#include <vector>
using namespace std;

struct Jugador {
    string nombre;
    bool es_arquero;
};

struct Equipo {
    string nombre;
    vector<Jugador> jugadores;
    int goles_a_favor = 0;
    int goles_en_contra = 0;
    int puntos = 0;
    vector <char> historial;

    Equipo(string nombreEquipo) {
        nombre = nombreEquipo;
        for (int i = 0; i < 11; i++) {
            Jugador jugador;
            cout << "Ingrese el nombre del jugador (el primer jugador será el arquero)" << i + 1 << " del equipo " << nombre << ": ";
            cin >> jugador.nombre;
            jugador.es_arquero = (i == 0); 
            jugadores.push_back(jugador);
        }
    }
};

struct Partido {
    string equipo_local;
    string equipo_visitante;
    int goles_local=0;
    int goles_visitante=0;
    string fecha;
    string estadio;
    
    void registrarPartido() {
        cout << "Ingrese el nombre del equipo local: ";
        cin >> equipo_local;
        cout << "Ingrese el nombre del equipo visitante: ";
        cin >> equipo_visitante;
        cout << "Ingrese los goles del equipo local: ";
        cin >> goles_local;
        cout << "Ingrese los goles del equipo visitante: ";
        cin >> goles_visitante;
        cout << "Ingrese la fecha del partido: ";
        cin >> fecha;
        cout << "Ingrese el estadio donde se jugó el partido: ";
        cin >> estadio;
    }
    
               
        for (int i = 0; i < cantequipos; i++) {
           cout << "Equipo: " << equipos[i].nombre << " - Posición: " << i + 1 << endl;
        }
};

void ordenarEquipos(vector<Equipo>& equipos) {
    int cantequipos = equipos.size();
    for (int i = 0; i < cantequipos - 1; i++) {
        for (int j = 0; j < cantequipos - i - 1; j++) {
            int difGolA = equipos[j].goles_a_favor - equipos[j].goles_en_contra;
            int difGolB = equipos[j + 1].goles_a_favor - equipos[j + 1].goles_en_contra;

            if (equipos[j].puntos < equipos[j + 1].puntos or
                (equipos[j].puntos == equipos[j + 1].puntos and difGolA < difGolB)) {
                
                Equipo temp = equipos[j];
                equipos[j] = equipos[j + 1];
                equipos[j + 1] = temp;
            }
        }
    }
}           

void asignarPosiciones(vector<Equipo>& equipos) {
    cout << "Tabla de Posiciones:"<< endl;;
    for (int i = 0; i < equipos.size(); i++) {
        cout << "Posición " << i + 1 << ": " << equipos[i].nombre << endl;
        cout << "Goles a favor: " << equipos[i].goles_a_favor << endl;
        cout << "Goles en contra: " << equipos[i].goles_en_contra << endl;
        cout << "Puntos: " << equipos[i].puntos << endl;
        cout << "Historial: " << equipos[i].historial << endl;
        
    }
}

void actualizarEquipos(vector<Equipo>& equipos, Partido& partido) {
    for (size_t i = 0; i < equipos.size(); i++) {
        if (partido.equipo_local == equipos[i].nombre) {
            equipos[i].goles_a_favor += partido.goles_local;
            equipos[i].goles_en_contra += partido.goles_visitante;

            if (partido.goles_local > partido.goles_visitante) {
                equipos[i].puntos += 3;
                equipos[i].historial += "V";
            } else if (partido.goles_local == partido.goles_visitante) {
                equipos[i].puntos += 1;
                equipos[i].historial += "E";
            } else {
                equipos[i].historial += "D";
            }
        } 
        if (partido.equipo_visitante == equipos[i].nombre) {
            equipos[i].goles_a_favor += partido.goles_visitante;
            equipos[i].goles_en_contra += partido.goles_local;

            if (partido.goles_visitante > partido.goles_local) {
                equipos[i].puntos += 3;
                equipos[i].historial += "V";
            } else if (partido.goles_visitante == partido.goles_local) {
                equipos[i].puntos += 1;
                equipos[i].historial += "E";
            } else {
                equipos[i].historial += "D";
            }
        }
    }
}

void mostrarPartido(vector<Partido>& partidos, string local, string visitante) {
    for (auto partido : partidos) {
        if ((partido.equipo_local == local && partido.equipo_visitante == visitante) ||
            (partido.equipo_local == visitante && partido.equipo_visitante == local)) {
            
            cout << "Partido encontrado:";
            cout << partido.equipo_local << " (" << partido.goles_local << ") vs ";
            cout << partido.equipo_visitante << " (" << partido.goles_visitante << ")";
            cout << "Fecha:" << partido.fecha << " | Estadio: " << partido.estadio <<endl;
            return;
        }
    }
    cout << "No se encontró un partido entre " << local << " y " << visitante << endl;
}




int main() {
    vector<Equipo> equipos;
    vector<Partido> partidos;

    for (int i = 0; i < 24; i++) {
        string nombreEquipo;
        cout << "Ingrese el nombre del equipo " << i + 1 << ": ";
        cin >> nombreEquipo;
        equipos.push_back(Equipo(nombreEquipo));
    }

    int cantidad_partidos;
    cout << "Ingrese la cantidad de partidos: ";
    cin >> cantidad_partidos;

    for (int i = 0; i < cantidad_partidos; i++) {
        Partido partido;
        partido.registrarPartido();
        actualizarEquipos(equipos, partido);
        partidos.push_back(partido);
    }

    ordenarEquipos(equipos);
    asignarPosiciones(equipos);

    string equipo1, equipo2;
    cout << "Ingrese los nombres de dos equipos para ver su partido:";
    cin >> equipo1 >> equipo2;
    mostrarPartido(partidos, equipo1, equipo2);

    return 0;
}
