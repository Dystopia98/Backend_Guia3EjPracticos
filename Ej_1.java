
import java.util.Scanner;
/*
Crear un programa que dado un número determine si es par o impar.
*/

/**
 *
 * @author Nico
 */
public class Ej_1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("Número.");
       int N = leer.nextInt();
       if (N == 0){
           System.out.println("Número par.");
       } else if (N == 1){
           System.out.println("Número impar.");
       } else if ((N%2)== 0) {
            System.out.println("Número par.");
        } else if (N%2 != 0) {
            System.out.println("Número impar.");
        }
    }
    
}
