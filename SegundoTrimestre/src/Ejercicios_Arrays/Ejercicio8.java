package Ejercicios_Arrays;

import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
    /*
		 *  8. Hacer un programa que:
    				1. Lea una secuencia de 20 valores numéricos reales y los almacene en un array de nombre “números”
    				2. Muestra en pantalla cuál es el valor máximo, así como la posición que ocupa en el array. En el caso de aparecer repetido mostrará sólo el de menor índice
		 */
        double numeros[] = new double[20];
        Random random = new Random();
        for (int f = 0; f < numeros.length; f++) {
            numeros[f] = random.nextDouble(100);
        }
        double mayor = 0;
        for (int p = 0; p < numeros.length; p++) {
            if(numeros[p] > mayor) {
                mayor = numeros[p];
            }
        }
        System.out.println("Numeros del array: ");
        for (int p = 0; p < numeros.length; p++) {
            System.out.print(numeros[p] + " " + "\n");
        }
        System.out.println("El numero mayores es: " + mayor);
    }
}
