/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fruteriaed;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class ColaTest {
    
    public ColaTest() {
    }

    /**
     * Test of mostrar method, of class Cola.
     */
    @Test
    public void testMostrar() {
        
    }

    /**
     * Test of despachar method, of class Cola.
     */
    @Test
    public void testDespacharCuandoHay20Clientes() {
        // 1.- Preparar datos de la prueba
        Cola fru = new Cola(20);
        
        // 2.- Probar
        fru.despachar();
        
        // 3.- Verificar
        assertEquals( 20, fru.nclientes);
        assertEquals( 20, fru.nclientes);
        assertEquals( 20, fru.nclientes);
                
    }

    /**
     * Test of adelantar method, of class Cola.
     */
    @Test
    public void testAdelantar() {
    }

    /**
     * Test of retrasar method, of class Cola.
     */
    @Test
    public void testRetrasar() {
    }

    /**
     * Test of mostrarDespachados method, of class Cola.
     */
    @Test
    public void testMostrarDespachados() {
    }
    
}
