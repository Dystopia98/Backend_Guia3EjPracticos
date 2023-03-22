
import java.util.Scanner;

/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el 
resultado por pantalla y luego volver al menú. El programa deberá 
ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
     ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
          MENU
          1.Sumar
          2.Restar
          3.Multiplicar
          4.Dividir
          5.Salir
          Elejir opción:
 */
public class Ej_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar 2 números enteros positivos.");
        int R = 0;
        double num1 = leer.nextInt(), num2 = leer.nextInt();
        String Salir = "o";
        do {
            System.out.println("     MENÚ");
            System.out.println("     1.Sumar.");
            System.out.println("     2.Restar.");
            System.out.println("     3.Multiplicar.");
            System.out.println("     4.Dividir.");
            System.out.println("     5.Salir.");
            System.out.println("   Elejir opción:");
            R = leer.nextInt();
            switch (R) {
                case 0:
                    System.out.println("     MENÚ");
                    System.out.println("     1.Sumar.");
                    System.out.println("     2.Restar.");
                    System.out.println("     3.Multiplicar.");
                    System.out.println("     4.Dividir.");
                    System.out.println("     5.Salir.");
                    System.out.println("   Elejir opción:");
                    R = leer.nextInt();
                    break;
                case 1:
                    System.out.println("El resultado es :" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado es :" + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado es :" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("El resultado es :" + ( num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    Salir = leer.next();
                    if (Salir.toUpperCase().equals("N")) {
                        System.out.println("Reiniciando programa...");
                        System.out.println("Ingrese 2 números enteros positivos.");
                        num1 = leer.nextInt();
                        num2 = leer.nextInt();
                        R = 0;
                        break;
                    } else if (Salir.toUpperCase().equals("S")) {
                        System.out.println("Saliendo del programa...");
                        R = 5;
                        break;
                    } else {
                        do {
                            System.out.println("Respuesta invalida.");
                            System.out.println("Por favor,use S o N para responder.");
                            Salir = leer.next();
                        } while (!Salir.toUpperCase().equals("S") && !Salir.toUpperCase().equals("N"));
                        if (Salir.toUpperCase().equals("N")){
                            R = 0;
                        }
                        break;
                    }
                default:
                    System.out.println("Respuesta invalida.");
                    break;
            }
        } while (R != 5 && !Salir.toUpperCase().equals("S"));
    }
}
