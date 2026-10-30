<<<<<<< HEAD
import java.util.Scanner;

public class CiclosJOP {
=======
package CiclosJOP;

import java.util.Scanner;

public class Ejercicio02 {
>>>>>>> 8594eccd7b74c18170a6ea7a47d065418ef13e4a
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        int numero = scanner.nextInt();
        
        while (numero != 0) { // El ciclo se repite mientras el número sea diferente de cero
            if (numero > 0) {
                System.out.println("El número " + numero + " es POSITIVO.");
            } else {
                System.out.println("El número " + numero + " es NEGATIVO.");
            }
            
            System.out.print("Digite otro número (0 para salir): ");
            numero = scanner.nextInt();
        }
        
        System.out.println("El programa ha finalizado porque ingresó el número 0.");
        scanner.close();
    }
}