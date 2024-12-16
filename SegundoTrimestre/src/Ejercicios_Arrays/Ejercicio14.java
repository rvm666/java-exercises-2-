package Ejercicios_Arrays;

import java.util.Random;

public class Ejercicio14 {
    public static void main(String[] args) {
    /*
        Hacer un programa que diga cuantas veces aparece cada uno de los elementos de un array. El programa ha de controlar que un
        número no se analice dos veces; por ejemplo, si hay un 3 en la segunda posición y otro en la sexta, el programa ha de decir
        que el 3 aparece dos veces, pero sólo cuando encuentra el que hay en la tercera posición, cuando encuentre el que hay a la sexta,
        no lo tiene que evaluar. Sugerencia, utilizar un array auxiliar para ir guardando los elementos analizados.
         */
        int numeros[] = new int[10];
        Random random = new Random();
        for (int p = 0; p < numeros.length; p++) {
            numeros[p] = random.nextInt(100);
        }
        int veces = 0;
        int a = 0;
        int b =0;
        int analizados[]  = new int[numeros.length];
        for (int p = 0; p < numeros.length; p++) {
            a = numeros[p];
            while (p < numeros.length) {
                for (int f = 0; f < numeros.length; f++) {
                    b = numeros[f];
                    if (a == numeros[f]) {
                        veces++;
                    }
                    analizados[f] = a;
                }
            }
            System.out.println("El numero " + numeros[p] + " aparece " + veces + " veces");
        }
    }
}
