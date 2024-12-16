package Ejercicios_String;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        /*
          6. Hacer un programa que:
                1. Permita obtener la parte izquierda de una cadena de caracteres, indicando el número de caracteres que se desean
                2. Inicialice la cadena de caracteres a una cadena texto por ejemplo “HOLA MUNDO” y extraiga los 7 primeros caracteres para comprobar que funciona
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres: ");
        String texto = leer.nextLine();
        System.out.println("Introduce la cantidad de caracteres que quiere extrarer de la cadena de texto: ");
        int cantidad = leer.nextInt();
        String cadena = texto.substring(0, cantidad+1);
        System.out.println("La parte extraida es: " + cadena);
    }
}
