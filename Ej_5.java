import java.util.Scanner;
/*
Escriba un programa en el cual se ingrese un 
valor límite positivo, y a continuación solicite números al usuario 
hasta que la suma de los números introducidos supere el límite inicial.
*/
public class Ej_5 {
 public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("Valor límite positivo.");
     int numero,suma = 0 , limite = leer.nextInt();
     do {
         numero = leer.nextInt();
         suma = suma + numero ;
         System.out.println(suma);
     } while (suma <= limite) ;
 }   
}
