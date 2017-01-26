/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora3;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author piedad
 */
@RunWith(Parameterized.class)
public class parametrizadaSuma {
    private double nume1;
    private double nume2;
    private double result;
    public parametrizadaSuma(double nume1,double nume2,double result) {
        this.nume1=nume1;
        this.nume2=nume2;
        this.result=result;
    }
    @Parameters
    public static Collection<Object[]> numeros()
    {
       return Arrays.asList(new Object[][]{
           {20,10,30},{30,-2,28},{2,-2,0},{2,-10,-8}
           });
               
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testSuma() {
    Calculadora calcu=new Calculadora();
    double resultado=calcu.suma(nume1,nume2);
    assertEquals(result,resultado,0.0);
    
    
    } 
   /* @Test
    public void testSuma() {
    Calculadora calcu=new Calculadora();
    double resultado=calcu.suma(nume1,nume2);
    assertEquals(result,resultado,0.0);
    
    
    }*/
}
