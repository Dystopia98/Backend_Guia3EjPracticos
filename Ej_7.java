
import java.util.Scanner;

/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas 
por el usuario. Las cadenas deben llegar con un formato fijo: 
tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el 
formato se consideran correctas, la secuencia especial “&&&&&” 
marca el final de los envíos (llamémosla FDE), y toda secuencia 
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando 
la cantidad de lecturas correctas e incorrectas recibidas. 
     Para resolver el ejercicio deberá investigar cómo se utilizan 
     las siguientes funciones de Java Substring(), Length(), equals().
 */
public class Ej_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena = "";
        int cor = 0, incor = 0;
        System.out.println("Ingresar cadena de 5 caracteres");
        System.out.println("Ingrese &&&&& para finalizar los envios.");
        do {
            cadena = leer.next();
            if (cadena.equals("&&&&&")){
                cor = cor ;
                incor = incor ;
                break;
            }
            if (cadena.length() == 5) {
                if (cadena.substring(4, 5).toUpperCase().equals("O") && cadena.substring(0, 1).toUpperCase().equals("X")) {
                    cor = cor + 1;
                    continue;
                } else {
                    incor = incor + 1;
                }
            } else {
                incor = incor + 1;
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("Cadenas correctas :" + cor);
        System.out.println("Cadenas incorrectas :" + incor);
    }
}
