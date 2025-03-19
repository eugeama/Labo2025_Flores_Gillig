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

const int FILAS = 3;
const int COLUMNAS = 4;

void ingresarProductos(Producto matriz[FILAS][COLUMNAS]) {
    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
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
        }
    }
}

int MayorValor(Producto matriz[FILAS][COLUMNAS]) {
    int columna_mayor = 0;
    int max_precio = 0;

    for (int j = 0; j < COLUMNAS; j++) {
        int suma_columna = 0;
        for (int i = 0; i < FILAS; i++) {
            suma_columna += matriz[i][j].precio;
        }
        if (suma_columna > max_precio) {
            max_precio = suma_columna;
            columna_mayor = j;
        }
    }
    return columna_mayor + 1;  // Se devuelve como 1-indexado
}

float calcularPromedio(Producto matriz[FILAS][COLUMNAS]) {
    float suma_precios = 0;
    int total_productos = FILAS * COLUMNAS;

    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
            suma_precios += matriz[i][j].precio;
        }
    }
    return suma_precios / total_productos;
}

int contarProductosConVencimiento(Producto matriz[FILAS][COLUMNAS]) {
    int contador = 0;
    for (int i = 0; i < FILAS; i++) {
        for (int j = 0; j < COLUMNAS; j++) {
            if (matriz[i][j].fecha_de_vencimiento) {
                contador++;
            }
        }
    }
    return contador;
}

int main() {
    Producto matriz[FILAS][COLUMNAS];

    ingresarProductos(matriz);

    int columna_max = MayorValor(matriz);
    string nombre_producto = matriz[1][2].nombre;  // Fila 2 (índice 1), Columna 3 (índice 2)
    float promedio_precios = calcularPromedio(matriz);
    int productos_con_vencimiento = contarProductosConVencimiento(matriz);

    cout << "La columna con el precio total más alto es: " << columna_max << endl;
    cout << "El nombre del producto en fila 2, columna 3 es: " << nombre_producto << endl;
    cout << "El promedio de precios del pasillo es: " << promedio_precios << endl;
    cout << "Cantidad de productos con fecha de vencimiento: " << productos_con_vencimiento << endl;

    return 0;
}
