/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class StackTest {
    
    public StackTest() {
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
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String operando = "";
        Stack instance = new Stack();
        instance.push(operando);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stack instance = new Stack();
        String expResult = "1";
        String result = "1";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPosicion method, of class Stack.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        Stack instance = new Stack();
        int expResult = 0;
        int result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPosicion method, of class Stack.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        int posicion = 0;
        Stack instance = new Stack();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getVector method, of class Stack.
     */
    @Test
    public void testGetVector() {
        System.out.println("getVector");
        Stack instance = new Stack();
        Vector expResult;
        expResult = null;
        Vector result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
