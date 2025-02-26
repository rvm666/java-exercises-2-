package Ejercicios_POO.Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Triangulo {

    private int lado1, lado2, lado3;
    private String nombre;


    //Constructor

    public Triangulo(){
        Random rnd = new Random();
        this.lado1 = rnd.nextInt(0,50);
        this.lado2 = rnd.nextInt(0,50);
        this.lado3 = rnd.nextInt(0,50);
        this.nombre = "Juan";
    }

    public Triangulo(int lado1, int lado2, int lado3, String nombre){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.nombre = nombre;
    }

    public int getLado1() {
        return lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public int getLado3() {
        return lado3;
    }
    public String getNombre() {
        return nombre;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void perimetro(){
        if (lado1 == lado2 && lado2 == lado3){
            int perimetro_equilatero = lado1 * 3;
            System.out.println("El perimetro es: " + perimetro_equilatero);
        } else if (lado1 == lado2 && lado3 != lado2){
            int perimetro_isosceles = (lado1 * 2) + lado3;
            System.out.println("El perimetro es: " + perimetro_isosceles);
        } else if (lado1 == lado3 && lado2 != lado3){
            int perimetro_isosceles2 = (lado1 * 2) + lado2;
            System.out.println("El perimetro es: " + perimetro_isosceles2);
        } else if (lado1 != lado2 && lado2 != lado3){
            int perimetro_escaleno = lado1 + lado2 + lado3;
            System.out.println("El perimetro es: " + perimetro_escaleno);
        }
    }

    public void area(){
        double area = Math.sqrt((4*Math.pow(lado1,2)*Math.pow(lado2,2) - Math.pow(Math.pow(lado1,2) + Math.pow(lado2,2) - Math.pow(lado3,2), 2)))/4;
        System.out.println("El area del triangulo es: " + area);
    }
}
