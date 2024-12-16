package Ejercicios_Arrays;

import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*
         * 10.	Hacer un programa que intercambie el primer y el último elemento de una lista.
         */
        int lista[] = new int [10];
        Random random = new Random();
        for (int f = 0; f < lista.length; f++) {
            lista[f] = random.nextInt(100);
        }
        System.out.println("Lista inicial: ");
        for (int p = 0; p < lista.length; p++) {
            System.out.print(lista[p] + " ");
        }
        int primero = 0;
        int ultimo = 0;
        for (int p = 0; p < lista.length; p++) {
            if (p == 0) {
                primero = lista[p];
            } else if (p == lista.length -1) {
                ultimo = lista[p];
            }
        }
        for (int p = 0; p < lista.length; p++) {
            if (p == 0) {
                lista[p] = ultimo;
            } else if (p == lista.length -1) {
                lista[p] = primero;
            }
        }
        System.out.println("\nLista final: ");
        for (int p = 0; p < lista.length; p++) {
            System.out.print(lista[p] + " ");
        }
    }
}
