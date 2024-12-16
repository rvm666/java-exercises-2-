package Ejercicios_String;
import java.util.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Programa que ordena por orden alfabético varias palabras.
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce las palabras que quieras separadas por espacios: ");
        String[] palabras = leer.nextLine().split(" ");
        String[] ordenadas = palabras.clone();
        for (int p = 0; p < ordenadas.length; p++) {
            for (int i = 0; i < ordenadas.length - 1; i++) {
                if (ordenadas[i].compareTo(ordenadas[i + 1]) > 0) {
                    String aux = ordenadas[i];
                    ordenadas[i] = ordenadas[i + 1];
                    ordenadas[i + 1] = aux;

                }
            }
        }
        System.out.println(Arrays.toString(palabras));
        System.out.println(Arrays.toString(ordenadas));
    }
}
