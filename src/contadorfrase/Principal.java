/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorfrase;

import java.util.Scanner;

/**
 *
 * @author Usuari
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== CONTADOR DE CARACTER A CARACTER EN UNA CADENA DE CARACTERS ===");
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Dona'm una frase: ");
        cadena = sc.nextLine(); 
        ContadorFrase frase = new ContadorFrase(cadena);
        frase.ContadorCadena(cadena);
        System.out.println(frase.toString());
    }
    
}
