
import java.util.Scanner;

/*
Crear un programa que pida una palabra y si esa palabra es igual a “eureka” 
el programa pondrá un mensaje de Correcto, 
sino mostrará un mensaje de Incorrecto. 
          Nota: investigar la función equals() en Java.

 */

public class Ej_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Palabra.");
        String Palabra = leer.next();
        if (Palabra.equals("eureka")) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("¡Incorrecto!");
        }
    }
}
