package Ejercicios_Metodos;

import java.util.Scanner;

public class Ejercicio1 {
    //Definir una clase con los siguientes métodos:
    //    • Método que me diga si un número es perfecto, abundante, defectuoso, odioso, primo, amigo, enemigo…
    //    • Método que imprima una pirámide a partir de lo que diga el usuario
    //Definir una clase Tester para utilizar OperacionesVarias.
    public static void introducir(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        int n = lector.nextInt();
    }
    public static void perfecto(){
        introducir();
        int resultado = 0;
        for (int p = 0; p <= n/2; p++ ){
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
    public static void opcion(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Elija una opción: \n1. Saber si un numero es perfecto, abundante, defectuoso, odioso, primo, amigo o enemigo. \n2. Imprimir una piramide. \n3. Salir");
        int opcion = lector.nextInt();
    }
    public static void abundante(){

    }
    public static void main(String[] args){
        switch (opcion()){
            case 1:
                System.out.println("Que quieres saber: \n1. Numero perfecto. \n2. Numero abundante. \n3. Numero defectuoso \n4. Numero odioso. \n5. Numero primo. \n6. Numero amigo. \n7. Numero enemigo.");
                int opc = lector.nextInt();
                switch (opc){
                    case 1:
                        perfecto();
                        break;
                    case 2:
                }
                break;
            case 2:
        }
    }
}
