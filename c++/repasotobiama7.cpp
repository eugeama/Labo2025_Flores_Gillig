#include <iostream>
#include <vector>
using namespace std;

struct Equipo {
    string nombre;
    int puntos;
};

struct Piloto{
    string NombrePiloto;
    int NumAuto;
    Equipo NombreEquipo;
    int PosicionIn;
    int PosicionFin;
    Equipo Puntos;
    bool VueltaRapida;
};

struct Vuelta_rapida {
    int numero_vuelta;
    int tiempo;
    Piloto nombre_piloto;
};

void CargarPilotos(vector<Piloto> pilotos){
    Piloto pilotoss;
    for(int i= 20; i>1;i--){
        cout<<"Ingrese el nombre del piloto con posición de llegada número "<<i<<endl;
        cin>>pilotoss.NombrePiloto;
        cout<<"Ingrese el número de auto"<<endl;
        cin>>pilotoss.NumAuto;
        cout<<"Ingrese el nombre del equipo"<<endl;
        cin>>pilotoss.NombreEquipo.nombre;
        cout<<"Ingrese la posición inicial"<<endl;
        cin>>pilotoss.PosicionIn;
        pilotoss.PosicionFin= "posicion" [i];
        cout<<"Ingrese si hizo una vuelta rápida"<<endl;
        cin>>pilotoss.VueltaRapida;
        pilotos.push_back(pilotoss);
    }
}

void Puntajes(vector<Piloto> pilotos){
    Piloto pilotoss;
    Equipo equiposs;
    int puntos=0;
    for(int i= 20; i>1;i--){
        if(pilotos[i].PosicionFin==10){
            puntos+=25;
        }
        else if(pilotos[i].PosicionFin==9){
            puntos+=18;
        }
        else if(pilotos[i].PosicionFin==8){
            puntos+=15;
        }
        else if(pilotos[i].PosicionFin==7){
            puntos+=12;
        }
        else if(pilotos[i].PosicionFin==6){
            puntos+=10;
        }
        else if(pilotos[i].PosicionFin==5){
            puntos+=8;
        }
        else if(pilotos[i].PosicionFin==4){
            puntos+=6;
        }
        else if(pilotos[i].PosicionFin==3){
            puntos+=4;
        }
        else if(pilotos[i].PosicionFin==2){
            puntos+=2;
        }
        else if(pilotos[i].PosicionFin==1){
            puntos+=1;
        }
        else {
            puntos=0;
        }

        if(pilotos[i].VueltaRapida==true and pilotos[i].PosicionFin>0){
            puntos+=1;
        }

        pilotos[i].NombreEquipo.puntos+= puntos;
    }
}

void OrdenarTabla(vector<Equipo> equipos, vector<Piloto> pilotos){
    for (int i= 0; i<equipos.size()-1; i++) {
        for (int ii= 0; ii<equipos.size()-i-1; ii++) {
            if (equipos[ii].puntos <equipos[ii + 1].puntos) {
                Equipo temp =equipos[ii];
                equipos[ii] =equipos[ii + 1];
                equipos[ii + 1] = temp;
            }
        }
    }
}

void MostrarTabla(vector<Equipo> equipos, vector<Piloto> pilotos){
    cout << "Equipos ordenados de mayor a menor en base al puntaje: " << endl;
    for (int iii=0;iii<equipos.size();iii++) {
        cout << "Nombre: "<<equipos[iii].nombre<<" "<<"Puntaje: "<<equipos[iii].puntos<<endl;
    }
}

int main(){
    vector<Equipo> equipos;
    vector<Piloto> pilotos;
    for (int i = 0; i < 24; i++){
       CargarPilotos(pilotos);
       Puntajes(pilotos);
    }
    OrdenarTabla(equipos, pilotos);
    MostrarTabla(equipos, pilotos);
 }
