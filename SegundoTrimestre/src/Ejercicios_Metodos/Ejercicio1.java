package Ejercicios_Metodos;

import java.util.Scanner;

public class Ejercicio1 {
    //Definir una clase con los siguientes métodos:
    //    • Método que me diga si un número es perfecto, abundante, defectuoso, odioso, primo, amigo, enemigo…
    //    • Método que imprima una pirámide a partir de lo que diga el usuario
    //Definir una clase Tester para utilizar OperacionesVarias.
    public static int introducir(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        int n = lector.nextInt();
        return n;
    }

    public static int opcion(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Elija una opción: \n1. Saber si un numero es perfecto, abundante, defectuoso, odioso, primo, amigo o enemigo. \n2. Imprimir una piramide. \n3. Salir");
        return lector.nextInt();
    }

    public static void perfecto(){
        int n = introducir();
        int resultado = 0;
        for (int p = 1; p <= n/2; p++ ){
            if (n % p == 0){
                resultado = resultado + p;
            }
        }
        if (resultado == n){
            System.out.println("El numero " + n + " es un numero perfecto");
        } else {
            System.out.println("El numero " + n + " no es un numero perfecto");
        }
    }

    public static void abundante(){
        int n = introducir();
        int resultado = 0;
        for (int p = 1; p <= n/2; p++ ){
            if (n % p == 0){
                resultado = resultado + p;
            }
        }
        if (resultado > n){
            System.out.println("El numero " + n + " es un numero abundante");
        } else {
            System.out.println("El numero " + n + " no es un numero abundante");
        }
    }

    public static void defectuoso(){
        int n = introducir();
        int resultado = 0;
        for (int p = 1; p <= n/2; p++ ){
            if (n % p == 0){
                resultado = resultado + p;
            }
        }
        if (resultado < n){
            System.out.println("El numero " + n + " es un numero deficiente");
        } else {
            System.out.println("El numero " + n + " no es un numero deficiente");
        }
    }

    public static void odioso(){
        int n = introducir();
        int c = 0;
        int longitud;
        int resultado = n;
        do{
            resultado = resultado/2;
            c = c+1;
        }while(resultado > 1);
        longitud = c;
        int[] num_bin = new int [longitud];

        System.out.println("Longitud: " + longitud);
        System.out.println("Resultado1: " + resultado);

        while (resultado/2 > 1) {
            for (int p = 0; p < num_bin.length; p++) {
                num_bin[p] = resultado % 2;
            }
            resultado = resultado/2;
        }

        int total = 0;
        for (int p = 0; p < num_bin.length; p++) {
            if (num_bin[p] == 1) {
                total = total + 1;
            }
        }
        System.out.println("El numero binario (al reves) es:");
        for (int p = 0; p < num_bin.length; p++){
            System.out.print(num_bin[p] + " ");
        }
        System.out.println("\n");
        System.out.println("El total de unos es: " + total);
        System.out.println("\n");

        if (total%2 != 0){
            System.out.println("El numero " + n + " es odioso");
        } else {
            System.out.println("El numero " + n + " no es odioso");
        }

        System.out.println("Resultado: " + resultado);
    }
    public static void main(String[] args){
        int opcion = opcion();
        if (opcion == 1){
            Scanner lector = new Scanner(System.in);
            System.out.println("Que quieres saber: \n1. Numero perfecto. \n2. Numero abundante. \n3. Numero defectuoso \n4. Numero odioso. \n5. Numero primo. \n6. Numero amigo. \n7. Numero enemigo.");
            int opc = lector.nextInt();
                switch (opc){
                    case 1:
                        perfecto();
                        break;
                    case 2:
                        abundante();
                        break;
                    case 3:
                        defectuoso();
                        break;
                    case 4:
                        odioso();
                        break;
                }
        } else if (opcion == 2){
            System.out.println("Opcion todavia no preparada");
        } else {
            System.out.println("Hasta luego");
        }
    }
}
