package Recetas;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TesterReceta {

    private PlatoPrincipal principal;
    private Postre postre;
    private Entrada entrada;

    @Before
    public void setUp() {
        String[] pasos1 = {"Paso 1", "Paso 2"};
        String[] pasos2 = {"Uno", "Dos", "Tres", "Cuatro"};

        principal = new PlatoPrincipal("Milanesa", Nivel.FACIL, pasos2, 30, 2);
        postre = new Postre("Tarta", Nivel.MEDIO, pasos1, 180, true);
        entrada = new Entrada("Bruschetta", Nivel.FACIL, pasos1, true);

        Recetario.limpiar();
        Recetario.agregarReceta(principal);
        Recetario.agregarReceta(postre);
        Recetario.agregarReceta(entrada);
    }

    @Test
    public void testCantidadRecetas() {
        int total = Recetario.contarRecetas();
        assertEquals(3, total);
    }

    @Test
    public void testRecetaConMasPasos() {
        Plato resultado = Recetario.recetaConMasPasos();
        assertEquals("Milanesa", resultado.getNombre());
    }

    @Test
    public void testMostrarInstrucciones() {
        principal.mostrarInstrucciones();
        postre.mostrarInstrucciones();
        entrada.mostrarInstrucciones();
    }

    @Test
    public void testPasosGuardados() {
        assertEquals(4, principal.getPasos().length);
        assertEquals("Paso 1", postre.getPasos()[0]);
    }

    @Test
    public void testFiltrarPorDificultad() {
        assertEquals(2, Recetario.buscarPorDificultad(Nivel.FACIL).size());
        assertEquals(1, Recetario.buscarPorDificultad(Nivel.MEDIO).size());
    }
}

