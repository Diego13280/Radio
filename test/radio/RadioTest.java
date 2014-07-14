/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of subirEstacion method, of class Radio.
     */
    @Test
    public void testSubirEstacion() {
        System.out.println("subirEstacion");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.subirEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bajarEstacion method, of class Radio.
     */
    @Test
    public void testBajarEstacion() {
        System.out.println("bajarEstacion");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.bajarEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Guardar method, of class Radio.
     */
    @Test
    public void testGuardar() {
        System.out.println("Guardar");
        int pos = 0;
        double x = 0.0;
        Radio instance = new Radio();
        instance.Guardar(pos, x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Radio.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        int pos = 0;
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.sacar(pos);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarFrecuencia method, of class Radio.
     */
    @Test
    public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        boolean frec = false;
        Radio instance = new Radio();
        instance.cambiarFrecuencia(frec);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEncendido method, of class Radio.
     */
    @Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionAM method, of class Radio.
     */
    @Test
    public void testGetEstacionAM() {
        System.out.println("getEstacionAM");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacionAM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionFM method, of class Radio.
     */
    @Test
    public void testGetEstacionFM() {
        System.out.println("getEstacionFM");
        Radio instance = new Radio();
        double expResult = 0.0;
        double result = instance.getEstacionFM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class Radio.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
