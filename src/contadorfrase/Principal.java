package contadorfrase;
import java.util.Scanner;

/**
 *
 * @author Xavi Bermejo Borrella
 * @since 03/02/2025 11:44 AM
 * @version 1.0
 */
public class Principal {
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