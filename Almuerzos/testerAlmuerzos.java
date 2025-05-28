package Almuerzos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class testerAlmuerzos {
    private Alumno a1;
    private Pedido p1;
    private Plato p2;
    private Plato p3;
    private PersonaAlmuerzo pp1;
    private Profesor ppp1;
    private Plato pppp1;
    private Sistema s1;
    ArrayList<Pedido> pedidos;
    ArrayList<Plato> platos;

    @BeforeEach
    public void setup(){
        p1=new Pedido();
        pppp1=new Plato();
        p2=new Plato("acelga", 2000);
        p3=new Plato("a", 30);
        pedidos=new ArrayList<>();
        pedidos.add(new Pedido(27, 5, 2025, "Laura", "Martínez", "Entregado"));
        pedidos.add(p1);
        pedidos.add(p1);
        pedidos.add(new Pedido(27, 5, 2025, "Juan", "García", "A preparar"));

        pedidos.add(new Pedido(27, 5, 2025, "Carlos", "Pérez", "A preparar"));
        platos=new ArrayList<>();
        platos.add(pppp1);
        platos.add(new Plato("milanguche de sanguinesa con exprimon limido", 10));
        platos.add(p2);
        s1=new Sistema(pedidos, platos);
    }

    @Test
    public void TestAddPlatos(){
        s1.agregarPlato(new Plato("a", 1));
        assertEquals(3, platos.size());
    }
    @Test
    public void TestRemovePlatos(){
        s1.eliminarPlato(new Plato("b", 13));
        assertEquals(1, s1.getPlatos().size());
    }
    @Test
    public void TestModifyPlatos(){
        s1.modificarPlato(new Plato("b", 13), new Plato("a", 23));
        assertEquals("b", s1.getPlatos().getFirst().getNombre());
    }
    @Test
    public void TestCuantosPlatosPorDia(){
        s1.cuantosPlatosPorDia(LocalDate.of(1990, 2, 13));
        assertNotEquals(0, platos.size());
    }
    @Test
    public void TestPlatosMasPedidos(){
        assertNotEquals(0, s1.platosMasPedidos().size());
        System.out.println(s1.platosMasPedidos().size());
    }
    @Test
    public void TestTop3(){
        assertNotEquals(0, s1.top3().size());
    }
    @Test
    public void TestCheckPrecio(){
        s1.checkPrecio(p1, 2);
    }
}
