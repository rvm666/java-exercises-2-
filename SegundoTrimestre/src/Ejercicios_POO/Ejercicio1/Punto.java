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
        Random rdn = new Random();
        this.a = rdn.nextDouble(0,10);
        this.b = rdn.nextDouble(0,10);
    }

    public double getA(){return a;}
    public double getB(){return b;}

    public double calcularDistanciaDesde(Punto a){
        //return
    }


}
