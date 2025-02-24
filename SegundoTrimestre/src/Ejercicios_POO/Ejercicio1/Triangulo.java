package Ejercicios_POO.Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Triangulo {

    private int lado1, lado2, lado3;
    private String nombre;


    //Constructor

    public Triangulo(){
        Random rnd = new Random();
        this.lado1 = rnd.nextInt(0,10);
        this.lado2 = rnd.nextInt(0,10);
        this.lado3 = rnd.nextInt(0,10);
    }

    public Triangulo(int lado1, int lado2, int lado3, String nombre){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.nombre = nombre;
    }
}
