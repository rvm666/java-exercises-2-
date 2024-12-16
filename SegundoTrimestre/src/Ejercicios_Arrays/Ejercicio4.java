package Ejercicios_Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
		  4. Hacer un programa que:
    				1. Cree un array bidimensional de 10x10
    				2. Inicialice la matriz de forma que las filas pares se rellenen a uno y las impares a cero
    				3. Una vez inicializada la matriz, muestre su contenido en pantalla
		 */
        int array[][] = new int[10][10];
        for(int f = 0; f < array.length; f++) {
            for(int c = 0; c < array[f].length; c++) {//array[f].length=10, es el número de columnas
                if (f % 2 == 0) {
                    array[f][c] = 1;
                } else {
                    array[f][c] = 0;
                }
            }
        }
        for(int f = 0; f < array.length; f++) {
            for(int c = 0; c < array[f].length; c++) {
                System.out.print(array[f][c] + " ");
            }
            System.out.println();
        }
    }
}
