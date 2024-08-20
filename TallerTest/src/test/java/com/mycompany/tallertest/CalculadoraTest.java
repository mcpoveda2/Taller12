/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.tallertest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class CalculadoraTest {

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
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSuma_TCS01() {
        System.out.println("suma");
        double a = -3.0;
        double b = -5.0;
        Calculadora instance = new Calculadora();
        double expResult = -8.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuma_TCS02() {
        System.out.println("suma");
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuma_TCS03() {
        System.out.println("suma");
        double a = 10.0;
        double b = 5.0;
        Calculadora instance = new Calculadora();
        double expResult = 15.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuma_TCS04() {
        System.out.println("suma");
        double a = -7.0;
        double b = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = -4.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSuma_TCS05() {
        System.out.println("suma");
        double a = 7.0;
        double b = -3.0;
        Calculadora instance = new Calculadora();
        double expResult = 4.0;
        double result = instance.suma(a, b);
        assertEquals(expResult, result, 0);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testResta_TCR01() {
        double a = -3.0;
        double b = -5.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testResta_TCR02() {
        double a = -5.0;
        double b = -3.0;
        Calculadora instance = new Calculadora();
        double expResult = -2.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testResta_TCR03() {
        double a = 0.0;
        double b = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testResta_TCR04() {
        double a = 10.0;
        double b = 5.0;
        Calculadora instance = new Calculadora();
        double expResult = 5.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testResta_TCR05() {
        double a = 5.0;
        double b = 10.0;
        Calculadora instance = new Calculadora();
        double expResult = -5.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testResta_TCR06() {
        double a = -7.0;
        double b = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = -10.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testResta_TCR07() {
        double a = 3.0;
        double b = -7.0;
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.resta(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMultiplicacion_TCM01() {
        double a = -3.0;
        double b = -5.0;
        Calculadora instance = new Calculadora();
        double expResult = 15.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMultiplicacion_TCM02() {
        double a = 0.0;
        double b = 10.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMultiplicacion_TCM03() {
        double a = 10.0;
        double b = 5.0;
        Calculadora instance = new Calculadora();
        double expResult = 50.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testMultiplicacion_TCM04() {
        double a = -7.0;
        double b = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = -21.0;
        double result = instance.multiplicacion(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDivision_TCD01() {
        double a = -10.0;
        double b = -5.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivision_TCD02() {
        double a = 10.0;
        double b = 0;
        Calculadora instance = new Calculadora();
        instance.division(a, b);
    }

    @Test
    public void testDivision_TCD03() {
        double a = 10.0;
        double b = 5.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDivision_TCD04() {
        double a = -15.0;
        double b = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = -5.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testDivision_TCD05() {
        double a = 0.0;
        double b = 10.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testExponenciacion() {
        System.out.println("exponenciacion");
        double base = 0.0;
        double exponente = 1;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testRadicacion() {
        System.out.println("radicacion");
        double numero = 0.0;
        double indice = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.0;
        double result = instance.radicacion(numero, indice);
        assertEquals(expResult, result, 0);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSonAmigos() {
        System.out.println("sonAmigos");
        int a = 0;
        int b = 0;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSumaDivisores() {
        System.out.println("sumaDivisores");
        int x = 0;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.sumaDivisores(x);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSonAmigos_TCNAC01() {
        System.out.println("sonAmigos_TCNAC01");
        int a = 220;
        int b = 284;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSonAmigos_TCNAC02() {
        System.out.println("sonAmigos_TCNAC02");
        int a = 1184;
        int b = 1210;
        Calculadora instance = new Calculadora();
        boolean expResult = true;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSonAmigos_TCNAC03() {
        System.out.println("sonAmigos_TCNAC03");
        int a = 10;
        int b = 5;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSonAmigos_TCNAC04() {
        System.out.println("sonAmigos_TCNAC04");
        int a = 0;
        int b = 1;
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.sonAmigos(a, b);
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    @Test
    public void testExponenciacion_TCE01() {
        System.out.println("exponenciacion_TCE01");
        double base = 2.0;
        double exponente = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = 8.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE02() {
        System.out.println("exponenciacion_TCE02");
        double base = 2.0;
        double exponente = 0.0;
        Calculadora instance = new Calculadora();
        double expResult = 1.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE03() {
        System.out.println("exponenciacion_TCE03");
        double base = 2.0;
        double exponente = -2.0;
        Calculadora instance = new Calculadora();
        double expResult = 0.25;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE04() {
        System.out.println("exponenciacion_TCE04");
        double base = -2.0;
        double exponente = 3.0;
        Calculadora instance = new Calculadora();
        double expResult = -8.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test
    public void testExponenciacion_TCE05() {
        System.out.println("exponenciacion_TCE05");
        double base = -2.0;
        double exponente = 2.0;
        Calculadora instance = new Calculadora();
        double expResult = 4.0;
        double result = instance.exponenciacion(base, exponente);
        assertEquals(expResult, result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testExponenciacion_TCE06() {
        System.out.println("exponenciacion_TCE06");
        double base = 0.0;
        double exponente = 0.0;
        Calculadora instance = new Calculadora();
        instance.exponenciacion(base, exponente);
    }
}
