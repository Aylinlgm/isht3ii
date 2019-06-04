/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

/**
 *
 * @author aylin
 */
public class Palindromes {
    
       public static void main(String[] args) {
        String word = null; 
        boolean resultado= false;
        
        //Impar
        System.out.println("Probando: ana -- Resultado: " + evaluate("ana"));

        //Par
        System.out.println("Probando: anna -- Resultado: " + evaluate("anna"));
        
        //Vacia
        System.out.println("Probando: cadena vacia -- Resultado: " + evaluate(""));
        
         //Unitaria
        System.out.println("Probando: a -- Resultado: " + evaluate("a"));

        //Cadena Grande
        System.out.println("Probando: -+alo..oso/cayac**181oso..5*/1an-na1/*5..oso181**cayac/oso..ola+- -- Resultado: " + evaluate("-+alo..oso/cayac**181oso..5*/1an-na1/*5..oso181**cayac/oso..ola+-"));
        
        //Cadena con Simbolos
        System.out.println("Probando: oso..5*/1an-na1/*5..oso -- Resultado: " + evaluate("oso..5*/1an-na1/*5..oso"));
        
        //Cadena con espacios
        System.out.println("Probando: no deseo yo ese don -- Resultado: " + evaluate("no deseo yo ese don"));

        //Null
        System.out.println("Probando: Null -- Resultado: " + evaluate(null));
        
        //Impar
        System.out.println("Probando: cayac -- Resultado: " + evaluate("cayac"));
        
         //Con espacios
        System.out.println("Probando: anularemos a la somera luna -- Resultado: " + evaluate("anularemos a la somera luna"));
             
         }
         
         
         
       public static boolean evaluate(String word) {
            if (word == null) 
                return false; 
            
            boolean result = true;
             word = word.replace(" ", "");
             int length = word.length(); 
            for (int i = 0; i < length / 2; i++) {
              if (word.charAt(i) != word.charAt(length - 1 - i)) {
                result = false;
                break;
              }
            }
            return result;
}
    
}
