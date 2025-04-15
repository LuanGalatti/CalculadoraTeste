package modelo;

import modelo.Calculadora;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

class CalculadoraTest {

    /**
     * Test of getSoma method with a empty constructor, of class Calculadora.
     */
    @Test
    void testGetSomaConstrutorVazio() {
        Calculadora calculadora = new Calculadora();
        double expResult = 0.0;
        double result = calculadora.getSoma();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getSoma method, of class Calculadora.
     */
    @Test
    void testGetSoma() {
        Calculadora instance = new Calculadora(4.0, 2.0);
        double expResult = 6.0;
        double result = instance.getSoma();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getDiferenca method, of class Calculadora.
     */
    @Test
    void testGetDiferenca() {
        Calculadora instance = new Calculadora(4.0, 2.0);
        double expResult = 2.0;
        double result = instance.getDiferenca();
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of getProduto method, of class Calculadora.
     */
    @Test
    void testGetProduto() {
        Calculadora instance = new Calculadora(4.0, 2.0);
        double expResult = 8.0;
        double result = instance.getProduto();
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of getQuociente method, of class Calculadora.
     */
    @Test
    void testGetQuociente() {
        Calculadora instance = new Calculadora(4.0, 2.0);
        double expResult = 2.0;
        double result = instance.getQuociente();
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of getExponencial method, of class Calculadora.
     */
    @Test
    void testGetExponencial() {
        Calculadora instance = new Calculadora(4.0, 2.0);
        double expResult = 16.0;
        double result = instance.getExponencial();
        assertEquals(expResult, result, 0);

    }
}
