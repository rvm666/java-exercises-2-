package Ejercicios_Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*
		 * 12. Hacer un programa que:
    				1. Cree un array bidimiensional de 5x15 elementos de tipo entero y nombre “marco”
    				2. Cargar el array con valores 0 y 1 de la siguiente forma
		 */
        int cuadrado[][] = new int [5][15];
        for(int f = 0; f < cuadrado.length; f++) {
            for(int c = 0; c < cuadrado[f].length; c++) {
                if (f==0 || f==cuadrado.length -1 || c==0 || c==cuadrado[f].length -1) {
                    cuadrado[f][c] = 1;
                }
            }
        }
        for(int f = 0; f < cuadrado.length; f++) {
            for(int c = 0; c < cuadrado[f].length; c++) {
                System.out.print(cuadrado[f][c] + " ");
            }
            System.out.println("\n");
        }
    }
}
