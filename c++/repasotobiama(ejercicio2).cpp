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

void ingresarProductos(Producto matriz[3][4]) {
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
        }
    }
}

int MayorValor(Producto matriz[3][4]) {
    int columna_mayor = 0;
    int max_precio = 0;

    for (int j = 0; j < 4; j++) {
        int suma_columna = 0;
        for (int i = 0; i < 3; i++) {
            suma_columna += matriz[i][j].precio;
        }
        if (suma_columna > max_precio) {
            max_precio = suma_columna;
            columna_mayor = j;
        }
    }
    return columna_mayor + 1;
}

float calcularPromedio(Producto matriz[3][4]) {
    float suma_precios = 0;
    int total_productos = 3 * 4;

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            suma_precios += matriz[i][j].precio;
        }
    }
    return suma_precios / total_productos;
}

int contarProductosConVencimiento(Producto matriz[3][4]) {
    int contador = 0;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            if (matriz[i][j].fecha_de_vencimiento) {
                contador++;
            }
        }
    }
    return contador;
}

int main() {
    Producto matriz[3][4];

    ingresarProductos(matriz);

    int columna_max = MayorValor(matriz);
    string nombre_producto = matriz[1][2].nombre;  
    float promedio_precios = calcularPromedio(matriz);
    int productos_con_vencimiento = contarProductosConVencimiento(matriz);

    cout << "La columna con el precio total más alto es: " << columna_max << endl;
    cout << "El nombre del producto en fila 2, columna 3 es: " << nombre_producto << endl;
    cout << "El promedio de precios del pasillo es: " << promedio_precios << endl;
    cout << "Cantidad de productos con fecha de vencimiento: " << productos_con_vencimiento << endl;

    return 0;
}

