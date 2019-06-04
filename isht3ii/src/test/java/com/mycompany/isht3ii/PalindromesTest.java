/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aylin
 */
public class PalindromesTest {
    
    public PalindromesTest() {
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
     * Test of main method, of class Palindromes.
     */
   @Test
    public void pruebaImpar() {
          Palindromes instance = new Palindromes();
        
        System.out.println("PRUEBA #1 - CUANDO ES IMPAR");
        
        //given
        String word = "ana";        
        boolean resultadoEsperado = true;
        
        //when
        boolean resultadoObtenido = instance.evaluate(word);
        
        //then
        assertEquals("PRUEBA #1 FAILED!",resultadoEsperado, resultadoObtenido);
    }
    /**
     * Test of evaluate method, of class Palindromes.
     */
    @Test
    public void pruebaPar() {
        System.out.println("PRUEBA #2 - CUANDO ES PAR");
        
        String word = "anna";
        Palindromes instance = new Palindromes();
        
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        
       assertEquals("PRUEBA #2 FAILED!",expResult, result);
       
    }
    
     @Test
    public void pruebaVacia() {
        System.out.println("PRUEBA #3 - CADENA VACIA");
        
        String word = "";
        Palindromes instance = new Palindromes();
        
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        
       assertEquals("PRUEBA #3 FAILED!",expResult, result);
       
    }
    

    
          @Test
    public void pruebaUnitaria() {
        System.out.println("PRUEBA #4 - CADENA UNITARIA");
        
        String word = "a";
        Palindromes instance = new Palindromes();
        
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        
       assertEquals("PRUEBA #4 FAILED!",expResult, result);
       
    }
    
    
    @Test
    public void pruebaCadenaGrande() {
        System.out.println("PRUEBA #5 - CADENA GRANDE");
        
        String word = "-+alo..oso/cayac**181oso..5*/1an-na1/*5..oso181**cayac/oso..ola+-";
        Palindromes instance = new Palindromes();
        
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        
       assertEquals("PRUEBA #5 FAILED!",expResult, result);
       
    }
    
     @Test
    public void pruebaDigitosLetrasSimbolors() {
        System.out.println("PRUEBA #6 - CADENA CON DIGITOS, LETRAS y SIMBOLOS");
        
        String word = "oso..5*/1an-na1/*5..oso";
        Palindromes instance = new Palindromes();
        
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        
       assertEquals("PRUEBA #6 FAILED!",expResult, result);
       
    }
    
       @Test
    public void pruebaCadenaEspacios() {
        System.out.println("PRUEBA #7 - CADENA CON ESPACIOS");
        
        String word = "no deseo yo ese don";
        Palindromes instance = new Palindromes();
        
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        
       assertEquals("PRUEBA #7 FAILED!",expResult, result);
       
    }
    
       @Test
    public void pruebaNula() {
        System.out.println("PRUEBA #8 - CADENA NULA");
        
        String word = null;
        Palindromes instance = new Palindromes();
        
        boolean expResult = false;
        boolean result = instance.evaluate(word);
        
       assertEquals("PRUEBA #8 FAILED!",expResult, result);
       
    }
      
}
