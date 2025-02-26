package Ejercicios_POO.Ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Triangulo aleatorio");
        Triangulo tri = new Triangulo();
        System.out.println("Lado 1 : " + tri.getLado1());
        System.out.println("Lado 2 : " + tri.getLado2());
        System.out.println("Lado 3 : " + tri.getLado3());
        System.out.println("Nombre: " + tri.getNombre());
        tri.perimetro();
        tri.area();


        Scanner sc = new Scanner(System.in);
        System.out.println("Triangulo manual");
        System.out.println("Introduce el valor del lado 1: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el valor del lado 2: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce el valor del lado 3: ");
        int num3 = sc.nextInt();
        System.out.println("Introduce el nombre del trinagulo: ");
        String nombre = sc.nextLine();
        Triangulo tri2 = new Triangulo(num1, num2, num3, nombre);
        tri2.perimetro();
        tri2.area();

    }
}
