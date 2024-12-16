package Ejercicios_String;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        /*
        Programa que convierte un texto en minúsculas a mayúsculas.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un texto en miniscula: ");
        String texto = leer.nextLine();
        texto = texto.toUpperCase();
        System.out.println(texto);
    }
}
