
import java.util.Scanner;

/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo,si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
     * * * *
     *     *
     *     *
     * * * *
 */
public class Ej_8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la dimensión del cuadrado.");
        int D = leer.nextInt();
        for (int i = 0; i < D; i++) {
            for (int j = 0; j < D; j++) {
                if ((i > 0 && i < D-1 ) && ( j > 0 && j < D-1)){
                    System.out.print("  ");
                } else
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
