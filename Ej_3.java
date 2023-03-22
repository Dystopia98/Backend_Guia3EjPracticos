
import java.util.Scanner;
/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un 
mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
     Nota: investigar la función Length() en Java.
*/
public class Ej_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Frase o palabra de 8 caracteres.");
        String frase;
        frase = leer.next();
        if ( frase.length() == 8 ) {
            System.out.println("CORRECTO");
        } else 
            System.out.println("INCORRECTO");
        }
    }
