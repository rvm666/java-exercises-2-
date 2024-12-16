package Ejercicios_Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
		 * 5. Hacer un programa que:
    			1. Cree un array bidimensional de 5x5 y nombre “diagonal”
    			2. Inicialice la matriz de forma que los componentes pertenecientes a la diagonal de la matriz valgan 1 y el resto 0
    			3. Muestre el contenido del array en pantalla
		 */
        int diagonal[][] = new int [5][5];
        for (int f = 0; f < diagonal.length; f++) {
            for (int c = 0; c < diagonal[f].length; c++) {
                if (f == c) {
                    diagonal[f][c] = 1;
                }
            }
        }
        for(int f = 0; f < diagonal.length; f++) {
            for(int c = 0; c < diagonal[f].length; c++) {
                System.out.print(diagonal[f][c] + " ");
            }
            System.out.println();
        }
    }
}
