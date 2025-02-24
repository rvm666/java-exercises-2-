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
        this.v1 = new int[20];
        for (int p = 0; p < v1.length; p++){
            System.out.println("Introduce numeros hasta completar la lista: ");
            num = sc.nextInt();
            v1[p] = num;
        }
    }

    public void MostrarContenido() {
        for(int p = 0; p < v1.length; p++){
            System.out.println(v1[p]);
        }
    }

    public void Ordenarcontenido() {
        int aux;
        for(int p = 0; p < v1.length-1; p++){
            for (int i = p+1;  i< v1.length; i++) {
                int menor = v1[p];
                if (v1[i] < menor) {
                    aux = v1[i];
                    v1[i] = menor;
                    v1[p] = aux;
                }
            }
        }

        for (int p = 0; p < v1.length; p++) {
            System.out.println(v1[p]);
        }
    }

    public double Mediaarray() {
        int aux = 0;
        for (int p = 0; p < v1.length; p++) {
            aux = aux + v1[p];
        }
        double media = aux/v1.length;
        return media;
    }

    int[] v1cp;
    public void Invertirarray() {
        v1cp = v1;
        for (int p = 0; p < v1cp.length/2; p++) {
            int j = v1cp.length-p-1;
            int a = v1cp[p];
            v1cp[p] = v1cp[j];
            v1cp[j] = a;
        }
    }
}

