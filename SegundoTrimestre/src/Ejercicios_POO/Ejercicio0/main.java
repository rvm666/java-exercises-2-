package Ejercicios_POO.Ejercicio0;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero hasta completar el array: ");
        int num_i = sc.nextInt();
        OperacionesArray miarray_manual = new OperacionesArray(num_i);
        int opc;
        do{
            System.out.println("Se a generado un array aleatorio, que deseas hacer con el: \n" + "1. Listar contenido \n" + "2. Ordenar array \n" + "3. Calcular media \n" + "4. Copia del array invertido \n" + "5. Salir");
            opc = sc.nextInt();
            switch(opc){
                case 1:{
                    miarray_manual.MostrarContenido();
                } break;
                case 2:{
                    miarray_manual.Ordenarcontenido();
                    miarray_manual.MostrarContenido();
                } break;
                case 3:{
                    System.out.println("La media del array es:");
                    miarray_manual.Mediaarray();
                } break;
                case 4:{
                    miarray_manual.MostrarContenido();
                    System.out.println("Array invertido: ");
                    miarray_manual.Invertirarray();
                    miarray_manual.MostrarContenido();
                } break;
                default:{
                    System.out.println("Opcion no valida");
                }
            }
        }while (opc != 5);
    }
}
