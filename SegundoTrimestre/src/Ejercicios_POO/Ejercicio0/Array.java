package Ejercicios_POO.Ejercicio0;

import java.util.Random;
import java.util.Scanner;

public class Array {


    public int[] v1;

    public Array(){
        Random rdn = new Random();
        v1 = new int[20];
        for (int p = 0; p<v1.length; p++){
            v1[p] = rdn.nextInt(0,200);
        }
    }
    public Array(int numero){
        Scanner sc = new Scanner(System.in);
        v1 = new int[20];
        for (int p = 0; p < v1.length; p++){
            System.out.println("Introduce numeros hasta completar la lista: ");
            v1[p] = numero;
            numero = sc.nextInt();
        }
    }

    public void getMostrarContenido() {
        for(int p = 0; p < v1.length; p++){
            System.out.println(v1[p]);
        }
    }
    public void OpcionesArray(int[] miarray) {
        for (int i = 0;  i< v1.length; i++) {
            for (int p = 0; p < v1.length-i-1; i++) {
                if(v1[p] < v1[p+1]){
                    int tmp = v1[p+1];
                    v1[p+1] = v1[p];
                    v1[p] = tmp;
                }
            }
        }
    }
}


