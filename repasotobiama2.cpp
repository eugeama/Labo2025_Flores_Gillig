#include <iostream>
#include <vector>
using namespace std;

struct Producto {
    string nombre;
    string codigo_barra;
    string marca;
    int precio;
    bool fecha_de_vencimiento;
};

Producto matriz[3][4];

int MayorValor() {
    int columna_max = 0;
    int mayor_precio = 0;

    for (int j = 0; j < 4; j++) {
        int suma_columna = 0;
        for (int i = 0; i < 3; i++) {
            suma_columna += matriz[i][j].precio;
        }
        if (suma_columna > mayor_precio) {
            mayor_precio = suma_columna;
            columna_max = j;
        }
    }
    return columna_max;
}

int main() {
    int suma_precios = 0;
    int total_productos = 0;
    int productos_con_vencimiento = 0;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            cout << "Ingrese nombre del producto en fila " << i + 1 << ", columna " << j + 1 << ": ";
            cin >> matriz[i][j].nombre;
            cout << "Ingrese código de barra: ";
            cin >> matriz[i][j].codigo_barra;
            cout << "Ingrese marca: ";
            cin >> matriz[i][j].marca;
            cout << "Ingrese precio: ";
            cin >> matriz[i][j].precio;
            cout << "Tiene fecha de vencimiento? (1: Sí, 0: No): ";
            cin >> matriz[i][j].fecha_de_vencimiento;

            suma_precios += matriz[i][j].precio;
            total_productos++;

            if (matriz[i][j].fecha_de_vencimiento) {
                productos_con_vencimiento++;
            }
        }
    }

    int columna_max = MayorValor();

    string nombre_producto = matriz[1][2].nombre;

    float promedio = suma_precios / (float)total_productos;

    cout << "La columna con el precio total más alto es " << columna_max + 1 << endl;
    cout << "El nombre del producto en fila 2, columna 3 es: " << nombre_producto << endl;
    cout << "El promedio de precios del pasillo es: " << promedio << endl;
    cout << "Cantidad de productos con fecha de vencimiento: " << productos_con_vencimiento << endl;

    return 0;
}

