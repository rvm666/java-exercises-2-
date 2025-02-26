package Ejercicios_POO.Ejercicio1;

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio){
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(){
        this.centro = new Punto();
        this.radio = 1.0;
    }

    public Circulo(double a, double b, double radio){
        this.centro = new Punto(a, b);
        this.radio = radio;
    }

    public Punto getCentro() { return centro; }
    public double getRadio() { return radio; }

    public double calcularDistanciaDesde(Punto c){
         double distancia_A = this.centro.getA() - c.getA();
         double distancia_B = this.centro.getB() - c.getB();
         return Math.sqrt(Math.pow(distancia_A, 2) + Math.pow(distancia_B, 2));
    }

    public double calcularArea(){
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double calcularPerimetro(){
        return 2 * Math.PI * this.radio;
    }

}
