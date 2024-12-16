package Ejercicios_Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
    /*
		 * 6. Hacer un programa que:
    			1. Cree un array bidimensional de 10x5 y nombre “datos”
    			2. Inicialice la matriz de forma que cada elemento guarde el número de fila a la que pertenece
		 */
        int datos[][] = new int[10][5];
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                datos[f][c] = f;
            }
        }
        for(int f = 0; f < datos.length; f++) {
            for(int c = 0; c < datos[f].length; c++) {
                System.out.print(datos[f][c] + " ");
            }
            System.out.println();
        }
    }
}
