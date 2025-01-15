package RepasoRecu1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // Declaración de variables e instanciación objetos
        Random rnd = new Random();
        Scanner lector = new Scanner(System.in);
        int opcion;
        int aux;
        int[] vacunados_noviembre = new int[28];
        int[] vacunados_noviembre_copia;
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        boolean duplicados;
        int index;
        double suma_vacunas;

        // Pregunto al usuario mientras no de una respuesta correcta
        do {
            System.out.println("Seleccione que tipo de relleno del array desea hacer:");
            System.out.println("1. Manual");
            System.out.println("2. Aleatorio");
            opcion = lector.nextInt();

        } while ((opcion < 1) || (opcion > 2));

        // En el ELSE no pregunto si la opción es 2 porque
        // solo puede ser 1 o 2
        if (opcion == 1) {
            // En el llenado manual no controlo duplicados tal como
            // se especificó el día del examen en el aula
            for (int i = 0; i <= vacunados_noviembre.length - 1; i++) {
                System.out.println("Indique el valor de vacunados para el día " + (i + 1) + " del mes: ");
                vacunados_noviembre[i] = lector.nextInt();
            }
        } else {
            // En el llenado aleatorio SI controlo duplicados tal como
            // se especificó el día del examen en el aula
            index = 0;
            do {
                // Genero un número aleatorio de 1 a 100
                vacunados_noviembre[index] = rnd.nextInt(0, 101);

                // Busco duplicados en los elementos que he introducido
                // hasta la posición actual
                duplicados = false;
                for (int i = 0; (i < index) && !duplicados; i++)
                    duplicados = (vacunados_noviembre[index] == vacunados_noviembre[i]);

                // Si no hay elementos duplicados aumento el índice
                // sino, vuelvo a generar un elemento para la misma
                // posición en la próxima iteración del bucle
                // y ese proceso se repite mientras el número esté
                // duplicado
                if (!duplicados)
                    index++;
            } while ((index < vacunados_noviembre.length));
        }

        // ************************************************
        // En este punto tengo el array relleno con valores
        // manualmente o aleatoriamente
        // ************************************************

        // Realizo una copia del array
        vacunados_noviembre_copia = vacunados_noviembre.clone();

        // Ordeno la copia del array usando el algoritmo de la burbuja
        // en una de sus versiones simples optimizadas (un bucle y sin booleanos)
        for (int i = 0; i <= vacunados_noviembre_copia.length - 2; i++) {
            if (vacunados_noviembre_copia[i] > vacunados_noviembre_copia[i + 1]) {
                aux = vacunados_noviembre_copia[i];
                vacunados_noviembre_copia[i] = vacunados_noviembre_copia[i + 1];
                vacunados_noviembre_copia[i + 1] = aux;

                // Como hay cambios, reinicializo el contador
                i = -1;
            }
        }

        // Calculo la media total y la muestro
        // Me da igual usar uno u otro array
        // ya que hago cálculos sobre el total
        suma_vacunas = 0;
        for (int i = 0; i <= vacunados_noviembre.length - 1; i++)
            suma_vacunas += vacunados_noviembre[i];

        System.out.printf("La media total de vacunas es de %.2f al día", (suma_vacunas / vacunados_noviembre.length));
        System.out.println("\n");

        // Muestro la media por día de la semana
        // Es importante usar el array NO ORDENADO
        // sino los datos no se corresponderán a los días
        // de la semana
        // Reutilizo la variable suma_vacunas
        // Me desplazo por el array con un offset semanal
        for (int i = 0; i <= ((vacunados_noviembre.length / 4) - 1); i++) {
            suma_vacunas = vacunados_noviembre[i];
            for (int j = 1; j <= 3; j++)
                suma_vacunas += vacunados_noviembre[i + (j * 7)];
            System.out.printf("La media de vacunas el " + diasSemana[i] + " es de %.2f", (suma_vacunas / 4));
            System.out.println();
        }

        // Por último muestro los arrays sin ordenar y ordenado
        System.out.println();
        System.out.println("El array original sin ordenar es el siguiente:");
        for (int i = 0; i <= vacunados_noviembre.length - 1; i++) {
            System.out.print(vacunados_noviembre[i] + " ");
        }

        System.out.println();
        System.out.println("El array ordenado es el siguiente:");
        for (int i = 0; i <= vacunados_noviembre_copia.length - 1; i++) {
            System.out.print(vacunados_noviembre_copia[i] + " ");
        }
    }
}