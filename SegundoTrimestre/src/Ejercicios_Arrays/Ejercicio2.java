package Ejercicios_Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
    /*
		 * 2.	Hacer un programa en el que dado el siguiente array de nombre origen:
				1.	Lo recorre metiendo en un segundo array de nombre destino todos aquellos elementos que sean pares y mayores de 25
				2.	Muestre en pantalla el contenido de los dos arrays unidimensionales
		 */
        int origen[] = {10, 25, 26, 40, 37, 45, 90, 76, 78, 81, 58, 32};
        int destino[] = new int[origen.length];
        for (int p = 0; p < origen.length; p++) {
            if(origen[p] % 2 == 0 && origen[p] > 25) {
                destino[p] = origen[p];
            }
        }
        for (int p = 0; p < origen.length; p++) {
            System.out.println(origen[p]);
        }
        System.out.println("Los numeros pares y mayores que 25 son: ");
        for (int p = 0; p < destino.length; p++)
            System.out.println(destino[p]);
    }
}
