package Ejercicios_POO.zoo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TESTER {
    public static void main(String[] args) {
       /* Animales animales = new Animales();
        animales.listarAnimales();


        Animales animales2 = new Animales(5);
        Animal[] lista = animales2.getLista();
        for (int i = 0; i < lista.length; i++) {
            // System.out.println(animales2.getLista()[i]);
            System.out.println(lista[i]);
        }
        animales2.listarAnimales();
        animales2.insertarAnimal(animales2.dameAnimal());*/
        //menu con opciones 0.Listar, 1. insertar, 2. modificar, 3.eliminar,
        Scanner sc = new Scanner(System.in);
        int opc1;
        int opc2;
        Animales zoo = null;

        do {
            System.out.println("-----MENU ZOO-----");
            System.out.println("1.Crear Zoo aleatorio \n" + "2.Crear Zoo propio \n" + "3.Salir");
            System.out.print("Elige una opcion: ");
            opc1 = sc.nextInt();

            switch(opc1) {
                case 1:{
                    zoo = new Animales();
                } break;
                case 2:{
                    System.out.println("Introduce de que tamaño quieres el zoo");
                    int tamaño = sc.nextInt();
                    zoo = new Animales(tamaño);
                } break;
                default:{
                    System.out.println("Opcion incorrecta");
                }
            }
        }while(opc1!= 3);



        do{
            System.out.println("-----OPCIONES ZOO-----");
            System.out.println("1.Insertar un Animal nuevo \n" + "2.Borrar Animal \n" + "3.Ver que animales hay \n" + "4.Modificar peso \n" + "5.Modificar edad \n" + "6.Modificar longitud cuello \n" + "7.Cambiar altura \n" + "8.Hacer sonido \n" + "9.Salir");
            opc2 = sc.nextInt();
            switch(opc2){
                case 1:{
                    zoo.insertarAnimal(zoo.dameAnimal());
                }break;
                case 2:{
                    System.out.println("Introduce el nombre del animal que quieres borrar: ");
                    String nombre = sc.next();
                    zoo.eliminarAnimal(nombre);
                } break;
                case 3:{
                    zoo.listarAnimales();
                } break;
                case 4:{
                    System.out.println("Introduce el nombre del animal al que quieras cambiar el peso: ");
                    String nombre = sc.next();
                    System.out.println("Introduce el nuevo peso: ");
                    double peso = sc.nextDouble();
                    zoo.cambiarPeso(nombre, peso);
                } break;
                case 5:{
                    System.out.println("Introduce el nombre del animal al que quieras cambiar la edad: ");
                    String nombre = sc.next();
                    System.out.println("Introduce el nuevo peso: ");
                    int edad = sc.nextInt();
                    zoo.cambiarEdad(nombre, edad);
                } break;
                case 6:{
                    System.out.println("Introduce el nombre de la Jirafa a la que cambiarle la longitud del cuello: ");
                    String nombre = sc.next();
                    System.out.println("Introduce la nueva longitud del cuello: ");
                    double longitud = sc.nextDouble();
                    zoo.cambiarLongitudCuello(nombre, longitud);
                } break;
                case 7:{
                    System.out.println("Introduce el nombre del pinguino al que cambiarle la altura: ");
                    String nombre = sc.next();
                    System.out.println("Introduce la nueva altura del pinguino: ");
                    double altura = sc.nextDouble();
                    zoo.cambiarAlturaPingu(nombre, altura);
                } break;
                case 8:{
                    System.out.println("Introduce el nombre del animal que quieres que haga el sonido: ");
                    String nombre = sc.next();
                    System.out.println(zoo.hazSonidoAnimal(nombre));
                } break;
                default:{
                    System.out.println("Opcion no valida");
                } break;
            }
        }while (opc2!=9);
    }
}
