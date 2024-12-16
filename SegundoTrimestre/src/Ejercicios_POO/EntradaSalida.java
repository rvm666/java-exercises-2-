package Ejercicios_POO;

import java.util.Scanner;

public class EntradaSalida {
    public static Mono dameMono(){
        Mono nuevoMono = null;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce: 1. Mono estandar 2. Mono personalizado");
        int opcion = lector.nextInt();
        if (opcion==1) {
            nuevoMono = new Mono();
        }
        else {
            System.out.println("Introduce nombre, edad, peso, true (hembra) / false (varon), tipo, kilos de comida, Cuidador");
            nuevoMono = new Mono(lector.nextLine(), lector.nextInt(), lector.nextFloat(), lector.nextBoolean(), lector.nextLine(), lector.nextFloat(), lector.nextLine());
        }
        return nuevoMono;
    }
}
