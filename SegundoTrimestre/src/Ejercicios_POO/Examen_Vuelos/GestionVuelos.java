package Ejercicios_POO.Examen_Vuelos;

import java.util.Random;
import java.util.Scanner;

public class GestionVuelos {
    private Vuelo[] lista;

    public GestionVuelos(int tamaño){
        lista = new Vuelo[tamaño];
        for (int i = 1; i < lista.length-1; i++){
            if(i % 2 == 0){
                lista[i] = new VueloNacional();
            } else{
                lista[i] = new VueloInternacional();
            }
        }
    }


    public void mostrarVuelos(){
        for(int i = 0; i< lista.length; i++){
            if(lista[i] != null){
                System.out.println(lista[i]);
            }
        }
    }

    public void darBajaVuelo(int identificador){
        for(int i = 0; i < lista.length && lista[i] != null; i++){
            if(lista[i].getIdentificador() == identificador){
                lista[i] = null;
            } else {
                System.out.println("No se a encontrado el vuelo: " + identificador);
            }
        }
    }


    public int hayHueco(){
        int cont = 0;
        for (int i = 0; i < lista.length; i++){
            if(lista[i] == null){
                cont++;
            }
        }
        return cont;
    }

    public Vuelo crearVuelo(){
        Scanner sc = new Scanner(System.in);
        Vuelo vuelo = null;
        System.out.println("Desea crear un vuelo manual o aleatorio: \n" + "1.Manual \n" + "2.Aleatorio");
        int opc2 = sc.nextInt();
        switch (opc2){
            case 1: {
                System.out.println("Que deseas? \n" + "1.Vuelo Nacional \n" + "2.Vuelo Internacional");
                int opc = sc.nextInt();

                switch (opc) {
                    case 1: {
                        System.out.println("Introduzca el identificador del vuelo: ");
                        int identificador = sc.nextInt();
                        System.out.println("Introduzca la aerolinea: ");
                        String aerolinea = sc.next();
                        System.out.println("Introduzca el responsable del vuelo: ");
                        String responsable = sc.next();
                        System.out.println("Introduzca el origen: ");
                        String origen = sc.next();
                        System.out.println("Introduzca el destino: ");
                        String destino = sc.next();
                        System.out.println("Introduzca el dia, mes y año del vuelo: ");
                        Fecha fecha = new Fecha(sc.nextInt(), sc.nextInt(), sc.nextInt() );
                        System.out.println("Cuantos pasajeros tiene el vuelo?");
                        int pasajeros = sc.nextInt();
                        System.out.println("Introduzca el precio: ");
                        double precio = sc.nextDouble();
                        vuelo = new VueloNacional(identificador, aerolinea, responsable, origen, destino, fecha, pasajeros, precio);
                    }break;
                    case 2:{
                        System.out.println("Introduzca el identificador del vuelo: ");
                        int identificador = sc.nextInt();
                        System.out.println("Introduzca la aerolinea: ");
                        String aerolinea = sc.next();
                        System.out.println("Introduzca el responsable del vuelo: ");
                        String responsable = sc.next();
                        System.out.println("Introduzca el origen: ");
                        String origen = sc.next();
                        System.out.println("Introduzca el destino: ");
                        String destino = sc.next();
                        System.out.println("Introduzca el dia, mes y año del vuelo: ");
                        Fecha fecha = new Fecha(sc.nextInt(), sc.nextInt(), sc.nextInt() );
                        System.out.println("Cuantos pasajeros tiene el vuelo?");
                        int pasajeros = sc.nextInt();
                        System.out.println("Introduzca el precio: ");
                        double precio = sc.nextDouble();
                        System.out.println("Introduzca Nº de escalas que hara");
                        int escala = sc.nextInt();
                        vuelo = new VueloInternacional(identificador, aerolinea, responsable, origen, destino, fecha, pasajeros, precio, );
                    }break;
                    default:{
                        System.out.println("Opción no valida");
                    }
                }
            } break;
            case 2: {
                Random rdn = new Random();
                int aleatorio = rdn.nextInt(0,10);
                if(aleatorio < 5){
                    vuelo = new VueloNacional();
                } else {
                    vuelo = new VueloInternacional();
                }
            }break;
            default:{
                System.out.println("Opción no valida");
            }
        }
        return vuelo;
    }

    public void introducirVuelo(Vuelo vuelo){
        for(int i = 0; i < lista.length; i++)
            if(lista[i] == null){
                lista[i] = vuelo;
            }
    }

    public void mostrarListadoFiltro(String origen, String destino, double precioMI, double precioMA){
        for (int i = 0; i < lista.length; i++){
            if(lista[i].getOrigen() == origen && lista[i].getDestino() == destino && lista[i].getPrecio() > precioMI && lista[i].getPrecio() < precioMA){
                lista[i].toString();
            }
        }
    }

    public void cambiarPrecioBase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el identificador del vuelo: ");
        int id = sc.nextInt();
        System.out.println("Introduce el nuevo precio base: ");
        double precio = sc.nextDouble();
        for (int i = 0; i < lista.length; i++){
            if(lista[i].getIdentificador() == id){
                lista[i].setPrecio(precio);
            } else{
                System.out.println("Su vuelo no ha sido encontrado");
            }
        }
    }

    public void actualizarVueloEscala(){
        System.out.println();
    }
}
