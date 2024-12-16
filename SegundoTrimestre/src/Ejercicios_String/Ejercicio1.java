package Ejercicios_String;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*
        Hacer un menú que permita al usuario conocer el uso de 10 métodos de la clase String. El programa debe dar la opción 11 para poder salir del mismo.
         */
        System.out.println("10 METODOS DE LA CLASE STRING");
        System.out.println("1.- int length \n 2.- int capacity \n 3.- String toString() \n 4.- String substring(int beginIndex \n 5.- StringBuffer reverse() \n 6.- setCharAt(int index, char ch) \n 7.- StringBuffer replace(int offset, char c) \n 8.- StringBuffer insert(int offset, char c) \n 9.- StringBuffer delete (int start, int end) \n 10.- Salir");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Metodo 1: int length();" +
                        "Devuelve la longitud de la cadena de caracteres. ");
                break;
            case 2:
                System.out.println("metodo 2: int capacity(). Devuelve el numero de caracteres que puede contener sin necesidadde aloca mas memoria");
                break;
            case 3:
                System.out.println("metodo 3: String toString(). Devuelve un String representado por el StringBuffer.");
                break;
            case 4:
                System.out.println("metodo 4: String substring(int beginIndex). Devuelve un string desde beginINdex hasta el final.");
                break;
            case 5:
                System.out.println("Metodo 5: StringBuffer reverse(). Devuelve la cadena invertida");
                break;
            case 6:
                System.out.println("metodo 6: setCharAt(int index, char ch).Reemplaza el caracter de la posición index por ch");
                break;
            case 7:
                System.out.println("metodo 7:StringBuffer replace(int start, int end, String str");
                break;
            case 8:
                System.out.println("metodo 8: StringBuffer insert (int offset, char c). Insert c en la posición offset e la cadena. Este método está sobrecargado varias veces recibiendo como parámetro a insertar otros tipos: int, float, long...");
                break;
            case 9:
                System.out.println("metodo 9: StringBuffer delete (int start, int end). Elimina de los caracteres entre las posiciones start y end.");
                break;
            case 10:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Tiene que ser un numeros entre el 1 y el 10");
        }

    }
}
