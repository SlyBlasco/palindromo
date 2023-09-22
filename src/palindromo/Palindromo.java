/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author Luis Blasco
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner para poner nuestro palindromo.
        System.out.println("Ingrese el texto aqui: ");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        // La siguiente variable empieza a poner todos los caracteres en minuscula y reemplaza todos los caracteres que no nos interesan.
        String oracionCompleta = oracion.toLowerCase().replace("!","").replace("¡","").replace(",","").replace(" ", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        // La siguiente variable invierte los caracteres de nuestro String oracionCompleta
        String oracionInvertida = new StringBuilder(oracionCompleta).reverse().toString();
        
        // Preguntamos que si la oracion (bien estructurada) es igual a la oracion inversa.
        if(oracionCompleta.equals(oracionInvertida)){
            System.out.println("Si es palindromo");
        } else{
            System.out.println("No es palindromo");
        }
    }
    
}
