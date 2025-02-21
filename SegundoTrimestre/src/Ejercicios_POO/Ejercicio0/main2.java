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
                    miarray.getMostrarContenido();
                } break;
                case 2:{
                    miarray.getOrdenarcontenido();
                } break;
                case 3:{
                    miarray.getMediaarray();
                } break;
                case 4:{
                    miarray.getMostrarContenido();
                    System.out.println("Array invertido: ");
                    miarray.getInvertirarray();
                } break;
                default:{
                    System.out.println("Opcion no valida");
                }
            }
        }while (opc != 5);
    }
}
