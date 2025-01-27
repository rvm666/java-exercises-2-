package Ejercicios_POO.Ejercicio0;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije una opcion para rellenar la lista: \n" + "1.- AutoRelleno \n" + "2.- Relleno manual \n" + "3.- Salir");
        int opc = sc.nextInt();
        do{
            switch (opc){
                case 1:{
                    Array miarray = new Array();
                }break;
                case 2:{
                    System.out.println("Introduce numero hasta completar la lista: ");
                    int num_i = sc.nextInt();
                    Array miarray = new Array(num_i);
                } break;
                default:{
                    System.out.println("Introduce una opcion valida");
                }
            }
        }while(opc != 3);

    }
}
