package Ejercicios_POO.Ejercicio1;

import java.util.Random;

public class Triangulo {

    private Punto punto1, punto2, punto3;


    //Constructor

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Triangulo(){
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    public Triangulo(double a, double b, double c, double d, double e, double f){
        this.punto1 = new Punto(a, b);
        this.punto2 = new Punto(c, d);
        this.punto3 = new Punto(e, f);
    }
    public Punto getPunto1() {
        return punto1;
    }
    public Punto getPunto2() {
        return punto2;
    }
    public Punto getPunto3() {
        return punto3;
    }

    public double calcularDistanciaDesde(){

    }

    public double perimetro(){
        if (punto1 == punto2 && punto2 == punto3){
            int perimetro_equilatero = punto1 * 3;
            System.out.println("El perimetro es: " + perimetro_equilatero);
        } else if (punto1 == punto2 && punto3 != punto2){
            int perimetro_isosceles = (punto1 * 2) + punto3;
            System.out.println("El perimetro es: " + perimetro_isosceles);
        } else if (punto1 == punto3 && punto2 != punto3){
            int perimetro_isosceles2 = (punto1 * 2) + punto2;
            System.out.println("El perimetro es: " + perimetro_isosceles2);
        } else if (punto1 != punto2 && punto2 != punto3){
            int perimetro_escaleno = punto1 + punto2 + punto3;
            System.out.println("El perimetro es: " + perimetro_escaleno);
        }
    }

    public void area(){
        double area = Math.sqrt((4*Math.pow(punto1,2)*Math.pow(punto2,2) - Math.pow(Math.pow(punto1,2) + Math.pow(punto2,2) - Math.pow(punto3,2), 2)))/4;
        System.out.println("El area del triangulo es: " + area);
    }
}
