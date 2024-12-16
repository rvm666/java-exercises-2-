package Ejercicios_Arrays;

import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
    /*
         * Hacer un programa que sume los números que hay en las posiciones pares de una lista de diez elementos.
                *
         *
         * f = fila
                * p = posción
                * (son lo mismo)
         */
        int numeros[] = new int [10];
        Random random = new Random();
        for (int f = 0; f < numeros.length; f++) {
            numeros[f] = random.nextInt(100);
        }
        int suma = 0;
        for (int p = 0; p < numeros.length; p++) {
            if (p % 2 == 0) {
                suma = suma + numeros[p];
            }
        }
        for (int p = 0; p < numeros.length; p++) {
            System.out.print(numeros[p] + " ");
        }
        System.out.println("\nLa suma es: " + suma);
    }
}
