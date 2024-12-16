package Ejercicios_Arrays;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        /*
		 * 3.	Hacer un programa que:
				1.	Lea una secuencia de 15 números enteros almacenándolos en un array de nombre “números”
				2.	Los visualice en el dispositivo estándar de salida en orden inverso al de entrada
		 */
        int numeros[] = new int[15];
        Random random = new Random();
        for(int p = 0; p < numeros.length; p++) {
            numeros[p] = random.nextInt(500);
        }
        System.out.print("En orden de entrada: ");
        for (int p = 0; p < numeros.length; p++) {
            System.out.print(numeros[p] + ", ");
        }
        System.out.println();
        System.out.print("En orden inverso: ");
        for (int p = numeros.length; p > 0; p--) {
            System.out.print(numeros[p-1] + ", ");
        }
    }
}
