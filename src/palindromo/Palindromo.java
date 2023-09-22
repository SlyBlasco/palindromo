/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author luism
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese el texto aqui: ");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        String oracionCompleta = oracion.toLowerCase().replace("!","").replace("¡","").replace(",","").replace(" ", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        String oracionInvertida = new StringBuilder(oracionCompleta).reverse().toString();
        
        System.out.println(oracionCompleta);
        System.out.println(oracionInvertida);
        
        if(oracionCompleta.equals(oracionInvertida)){
            System.out.println("Si es palindromo");
        } else{
            System.out.println("No es palindromo");
        }
    }
    
}
