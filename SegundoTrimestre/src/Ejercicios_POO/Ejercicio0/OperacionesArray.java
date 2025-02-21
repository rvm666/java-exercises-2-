package Ejercicios_POO.Ejercicio0;

import java.util.Random;
import java.util.Scanner;

public class OperacionesArray {

    public int[] v1;

    public OperacionesArray(){
        Random rdn = new Random();
        v1 = new int[20];
        for (int p = 0; p<v1.length; p++){
            v1[p] = rdn.nextInt(0,200);
        }
    }
    public OperacionesArray(int num){
        Scanner sc = new Scanner(System.in);
        v1 = new int[20];
        for (int p = 0; p < v1.length; p++){
            System.out.println("Introduce numeros hasta completar la lista: ");
            num = sc.nextInt();
            v1[p] = num;
        }
    }

    public void getMostrarContenido() {
        for(int p = 0; p < v1.length; p++){
            System.out.println(v1[p]);
        }
    }

    public void getOrdenarcontenido() {
        for (int i = 1;  i< v1.length; i++) {
            int menor = v1[i - 1];
            if (v1[i] < menor) {
                menor = v1[i];
            } else if (v1[i] > menor) {
                menor = v1[i];
            }
        }
        for (int p = 0; p < v1.length; p++) {
            System.out.println(v1[p]);
        }
    }

    public void getMediaarray() {
        int aux = 0;
        for (int p = 0; p < v1.length; p++) {
            aux = aux + v1[p];
        }
        int media = aux/v1.length;
        System.out.println("La media del array es: " + media);
    }

    int[] v1cp;
    public void getInvertirarray() {
        v1cp = v1;
        for (int p = 0; p < v1cp.length/2; p++) {
            int j = v1cp.length-p-1;
            int a = v1cp[p];
            v1cp[p] = v1cp[j];
            v1cp[j] = a;
        }
        for (int p = 0; p < v1cp.length; p++) {
            System.out.println(v1cp[p]);
        }
    }
}

