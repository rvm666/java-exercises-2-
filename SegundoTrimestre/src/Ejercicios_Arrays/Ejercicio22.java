package Ejercicios_Arrays;

import java.util.Random;

public class Ejercicio22 {
    public static void main(String[] args) {
    /*
            22. Hacer un programa que:
    1. Un array bidimensional de longitud 6x8 de nombre “matrículas” donde las filas representan grupos de alumnos y las columnas asignaturas
    2. Un segundo array bidimensional de longitud 8x13 de nombre “asignaturas” donde cada fila se corresponde con el nombre de una asignatura (Álgebra, Cálculo, Programación, Inglés, Estadística, Física, Historia, Tecnología) (Nota: inicializarlo de tal manera que ocupen todos los nombre como el máximo que es programación (13 caracteres))
    3. Mostrar en pantalla una tabla con el total de alumnos matriculados por asignatura
         */
        int matriculas[][] = new int [6][8];
        Random random = new Random();
        for (int f = 0; f < matriculas.length; f++) {
            for (int c = 0; c < matriculas[f].length; c++) {
                matriculas[f][c] = random.nextInt(50);
            }
        }
        String asignaturas[][] = new String[8][13];
        asignaturas[0][0] = "Algebra";
        for (int f = 0; f < asignaturas.length; f++) {
            for (int c = 0; c < asignaturas[f].length; c++) {
                System.out.print(asignaturas[f][c] + " ");
            }
            System.out.println();
        }


        for (int f = 0; f < matriculas.length; f++) {
            for (int c = 0; c < matriculas[f].length; c++) {
                System.out.print(matriculas[f][c] + " ");
            }
            System.out.println();
        }
    }
}
