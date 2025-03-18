package Ejercicios_POO.Ejercicio1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Triangulo aleatorio");
        Triangulo tri = new Triangulo();
        System.out.println("Lado 1 : " + tri.getPunto1());
        System.out.println("Lado 2 : " + tri.getPunto2());
        System.out.println("Lado 3 : " + tri.getPunto3());



        Scanner sc = new Scanner(System.in);
        System.out.println("Triangulo manual");
        System.out.println("Introduce el valor del lado 1: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el valor del lado 2: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce el valor del lado 3: ");
        int num3 = sc.nextInt();
        System.out.println("Introduce el nombre del trinagulo: ");


    }
}
