/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author piedad
 */
public class CalculadoraTest {
    private Calculadora calcu;
    private double resul;
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
              calcu=new Calculadora();  

    }
    
    @After
    public void tearDown() {
                calcu=null;

    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        double number1 = 20.0;
        double number2 = 10.0;
        double expResult = 30.0;
        resul = calcu.suma(number1, number2);
        assertEquals(expResult, resul, 0.0);
        
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        double number1 = 20.0;
        double number2 = 10.0;
         double expResult = 10.0;
        resul = calcu.resta(number1, number2);
        assertEquals(expResult, resul, 0.0);
       
    }

    /**
     * Test of multiplicacion method, of class Calculadora.
     */
    @Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        double number1 = 20.0;
        double number2 = 10.0; 
        double expResult = 200.0;
        resul = calcu.multiplicacion(number1, number2);
        assertEquals(expResult, resul, 0.0);
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double number1 = 20.0;
        double number2 = 10.0;
        double expResult = 2.0;
        resul = calcu.division(number1, number2);
        assertEquals(expResult, resul, 0.0);
    }
    
}
