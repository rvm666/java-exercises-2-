package Ejercicios_String;
import java.util.Scanner;
import static java.lang.String.valueOf;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        Entrar una serie de caracteres en una tabla, y mirar si esta es un “palíndromo” o no lo es.
        Un palíndromo son aquellas palabras que se leen igual de izquierda a derecha que de derecha a izquierda,
        por ejemplo ALLA.
         */
       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = teclado.nextLine();
        StringBuilder texto = new StringBuilder(palabra);
        if (palabra.compareTo(valueOf(texto.reverse())) == 0) {
            System.out.println("Palindromo");
        } else {
            System.out.println("No palindromo");
        }
    }
}
