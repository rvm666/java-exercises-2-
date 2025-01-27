package Ejercicios_POO.Ejercicio0;

import java.util.Random;
import java.util.Scanner;

public class Array {
    Random rdn = new Random();
    Scanner sc = new Scanner(System.in);
    int[] v1 = new int[20];
    public Array(){
        for (int p = 0; p<v1.length; p++){
            v1[p] = rdn.nextInt(200);
        }
    }
    public Array(int numero){
        for (int p = 0; p < v1.length; p++){
            System.out.println("Introduce numeros hasta completar la lista: ");
            this.v1[p] = numero;
            numero = sc.nextInt();
        }
    }

    public void getListarContenido(int[] miarray) {
        for(int p = 0; p < miarray.length; p++){
            System.out.println(miarray[p]);
        }
    }
}


