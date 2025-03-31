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
            } else{
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
                        System.out.println("Introduzca la fecha del vuelo: ");
                        //Fecha fecha =
                    } break;

                }
            } break;
            case 2: {
                Random rdn = new Random();
                int aleatorio = rdn.nextInt(0,10);
                if(aleatorio < 5){
                    VueloNacional vuelo_nacional = new VueloNacional();
                } else {
                    VueloInternacional vuelo_internacional = new VueloInternacional();
                }
            }

        }

    }

}
