package Ejercicios_Arrays;

import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
    /*
		 1.	Hacer un programa que:
				1.	Cree un array unidimensional de nombre “vector” y 15 elementos, siendo sus componentes de tipo numérico entero
				2.	Cargar el array con valores aleatorios que sean introducidos por teclado
				3.	Calcular la suma de los primeros N elementos almacenados en el array
				4.	Muestre el resultado obtenido así como el contenido del array en pantalla
		 */
        int vector[] = new int[15];
        Random random = new Random();
        for(int p = 0; p < vector.length; p++) {
            vector[p] = random.nextInt(200);
        }
        int n = random.nextInt(16);

        int suma = 0;
        for (int p = 0; p <= n; p++) {
            suma = suma + vector[p];
        }
        for (int p = 0; p < vector.length; p++) {
            System.out.println("Numero aleatorio " + (p + 1) + ": "+ vector[p]);
        }
        System.out.println("La suma de los primeros " + n + " numeros es " + suma);
    }
}
