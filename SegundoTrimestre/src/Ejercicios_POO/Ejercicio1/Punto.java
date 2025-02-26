package Ejercicios_POO.Ejercicio1;

import java.util.Random;

public class Punto {
    private double a;
    private double b;

    public Punto(double a, double b){
        this.a = a;
        this.b = b;
    }

    public Punto(){
        this.a = 0.0;
        this.b = 0.0;
    }

    public double getA(){return a;}
    public double getB(){return b;}

    public double calcularDistanciaDesde(Punto c){
        double distancia_A = this.a - c.getA();
        double distancia_B = this.b - c.getB();
        return Math.sqrt(Math.pow(distancia_A, 2) + Math.pow(distancia_B, 2));
    }


}
