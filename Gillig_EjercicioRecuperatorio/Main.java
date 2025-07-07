package Gillig_EjercicioRecuperatorio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tienda t1 = new Tienda(new ArrayList<>());

        Empresa e1 = new Empresa(new ArrayList<>(), "pepe pipi 2323", "pepe", new ArrayList<>());
        Empresa e2 = new Empresa(new ArrayList<>(), "pepe pipo 2323", "popo", new ArrayList<>());

        ProdPerecederos pp1 = new ProdPerecederos(32, "papa", "pipu", e1, LocalDate.of(2022, 4, 1), 60, LocalDate.of(2022, 5, 1), 10);
        ProdPerecederos pp2 = new ProdPerecederos(33, "zanahoria", "verdulita", e1, LocalDate.of(2023, 3, 10), 55, LocalDate.of(2023, 4, 5), 15);
        ProdPerecederos pp3 = new ProdPerecederos(34, "tomate", "hortifresh", e2, LocalDate.of(2023, 6, 20), 70, LocalDate.of(2023, 7, 10), 20);
        ProdPerecederos pp4 = new ProdPerecederos(35, "lechuga", "greenGarden", e1, LocalDate.of(2023, 8, 15), 40, LocalDate.of(2023, 9, 1), 12);
        ProdPerecederos pp5 = new ProdPerecederos(36, "frutilla", "berryFresh", e2, LocalDate.of(2023, 10, 5), 65, LocalDate.of(2023, 10, 20), 8);


        ProdNoPerecederos pnp1 = new ProdNoPerecederos(50, "arroz", "donGrano", e1, LocalDate.of(2023, 1, 15), 80, 1000, true);
        ProdNoPerecederos pnp2 = new ProdNoPerecederos(51, "harina", "laMolina", e2, LocalDate.of(2023, 2, 10), 90, 1000, false);
        ProdNoPerecederos pnp3 = new ProdNoPerecederos(52, "azúcar", "dulceVida", e2, LocalDate.of(2023, 3, 5), 100, 500, true);
        ProdNoPerecederos pnp5 = new ProdNoPerecederos(54, "lentejas", "nutriLeg", e2, LocalDate.of(2023, 5, 22), 95, 1000, true);

        Empleado em1 = new Empleado("carlos", "ipv4", LocalDate.of(2024, 1, 2), LocalDate.of(2015, 2, 3), 2500, new ArrayList<>());
        Empleado em2 = new Empleado("carlos", "ipv6", LocalDate.of(1990, 3, 15), LocalDate.of(2010, 5, 10), 2700, new ArrayList<>());
        Empleado em3 = new Empleado("luis", "perez", LocalDate.of(1985, 7, 22), LocalDate.of(2012, 8, 14), 2600, new ArrayList<>());
        Empleado em4 = new Empleado("maria", "rojas", LocalDate.of(1992, 11, 5), LocalDate.of(2017, 1, 9), 2400, new ArrayList<>());
        Empleado em5 = new Empleado("jose", "hernandez", LocalDate.of(1988, 2, 28), LocalDate.of(2016, 6, 19), 2550, new ArrayList<>());
        Empleado em6 = new Empleado("elena", "diaz", LocalDate.of(1995, 9, 12), LocalDate.of(2018, 4, 23), 2450, new ArrayList<>());

        e1.agregarProducto(pp1);
        e1.agregarProducto(pp2);
        e1.agregarProducto(pnp1);
        e1.agregarProducto(pp4);

        e1.agregarEmpleado(em1);
        e1.agregarEmpleado(em2);
        e1.agregarEmpleado(em3);

        em1.agregarProducto(pp1);
        em1.agregarProducto(pp2);
        em1.agregarProducto(pnp1);
        em1.agregarProducto(pp4);

        em2.agregarProducto(pp2);
        em2.agregarProducto(pp4);
        em2.agregarProducto(pnp1);

        em3.agregarProducto(pp2);
        em3.agregarProducto(pp1);
        em3.agregarProducto(pnp1);
        em3.agregarProducto(pp4);

        e2.agregarProducto(pp3);
        e2.agregarProducto(pnp2);
        e2.agregarProducto(pnp3);
        e2.agregarProducto(pp5);
        e2.agregarProducto(pnp5);

        e2.agregarEmpleado(em4);
        e2.agregarEmpleado(em5);
        e2.agregarEmpleado(em6);

        em4.agregarProducto(pp3);
        em4.agregarProducto(pnp2);
        em4.agregarProducto(pp5);
        em4.agregarProducto(pnp5);

        em5.agregarProducto(pnp2);
        em5.agregarProducto(pnp3);
        em5.agregarProducto(pp5);
        em5.agregarProducto(pp3);

        em6.agregarProducto(pnp2);
        em6.agregarProducto(pp5);
        em6.agregarProducto(pnp5);
        em6.agregarProducto(pp3);
        em6.agregarProducto(pnp3);

        t1.agregarProducto(pp1);
        t1.agregarProducto(pp2);
        t1.agregarProducto(pp3);
        t1.agregarProducto(pp4);
        t1.agregarProducto(pp5);
        t1.agregarProducto(pnp1);
        t1.agregarProducto(pnp2);
        t1.agregarProducto(pnp3);
        t1.agregarProducto(pnp5);


        System.out.println("Los productos vencidos son: "); //2
        for(String producto: t1.productosVencidos()) {
            System.out.println(producto);
        }

        System.out.println("Productos necesarios: "+e1.calcularProductos()); //3

        System.out.println("La empresa que mayor cantidad de productos le ofrece es: "+t1.masProductos()); //4

        System.out.println("Necesitan: "+e1.cantPaga()); //5

        System.out.println("Los días que faltan para que venza son: "+pnp1.diasVencer());
        System.out.println("Los días que faltan para que venza son: "+pp1.diasVencer());//6

        System.out.println("La tienda "+t1.beneficioEmpresa()); //7

        System.out.println("Los años que lleva trabajando en la empresa son: "+em1.aniosEmpresa()); //8

        System.out.println("La respuesta es: "+pp1.puedeConsumirse()); //9

        System.out.println("Los empleados mayores son: "); //10
        for(String empleado: e1.empleadosMayores()){
            System.out.println(empleado);
        }

    }
}
