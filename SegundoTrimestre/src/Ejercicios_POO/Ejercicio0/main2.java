package Ejercicios_POO.Ejercicio0;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        OperacionesArray miarray = new OperacionesArray();
        int opc;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Se a generado un array aleatorio, que deseas hacer con el: \n" + "1. Listar contenido \n" + "2. Ordenar array \n" + "3. Calcular media \n" + "4. Copia del array invertido \n" + "5. Salir");
            opc = sc.nextInt();
            switch(opc){
                case 1:{
                    miarray.MostrarContenido();
                } break;
                case 2:{
                    miarray.Ordenarcontenido();
                    miarray.MostrarContenido();
                } break;
                case 3:{
                    System.out.println("La media del array es:");
                    miarray.Mediaarray();
                } break;
                case 4:{
                    miarray.MostrarContenido();
                    System.out.println("Array invertido: ");
                    miarray.Invertirarray();
                    miarray.MostrarContenido();
                } break;
                default:{
                    System.out.println("Opcion no valida");
                }
            }
        }while (opc != 5);
    }
}
