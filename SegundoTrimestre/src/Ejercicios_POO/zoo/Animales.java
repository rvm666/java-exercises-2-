package Ejercicios_POO.zoo;

import java.util.Scanner;

public class Animales {
    private Animal[] lista;//polimorfismo: sus elementos son Animales pero pueden tomar diferentes formas, tantas como hijos tengas


    //CONSTRUCTORES
    public Animales(int tamaño) {
        lista = new Animal[tamaño];
        for (int i = 1; i < lista.length / 2; i++) {
            lista[i] = new Jirafa();
        }

        for (int i = lista.length / 2; i < lista.length; i++) {
            lista[i] = new Pinguino();
        }
    }

    public Animales() {
        this(10);
    }

    public Animal[] getLista() {
        return lista;
    }

    public void setLista(Animal[] lista) {
        this.lista = lista;
    }

    //INSERTAR / ELIMINAR
    public void insertarAnimal(Animal a) {
        boolean introducido = false;
        //introducido==false es lo mismo que !introducido
        for (int i = 0; i < lista.length && introducido == false; i++) {
            if (lista[i] == null) {
                lista[i] = a;
                introducido = true;
            } else {
                System.out.println("No hay espacio");
            }
        }
    }

    public int getTamaño() {
        return lista.length;
    }

    //Recuerda poner lista[i] != null en todos los recorridos
    //metodo listarAnimales
    public void listarAnimales() {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null)
                System.out.println(lista[i]);
        }
    }


    public Animal dameAnimal() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Que animal quieres? \n" + "1.Jirafa \n" + "2.Pinguino");
        int eleccion = lector.nextInt();
        Animal animal = null;

        switch (eleccion) {
            case 1: {
                System.out.println("Introduce nombre, peso, edad y la longitud del cuello");
                String nombre = lector.next();
                double peso = lector.nextDouble();
                int edad = lector.nextInt();
                double longitudCuello = lector.nextDouble();
                animal = new Jirafa(nombre, peso, edad, longitudCuello);
            }
            break;
            case 2: {
                System.out.println("Introduce nombre, peso, edad y altura");
                String nombre = lector.next();
                double peso = lector.nextDouble();
                int edad = lector.nextInt();
                double altura = lector.nextDouble();
                animal = new Pinguino(nombre, peso, edad, altura);
            }
            break;
            default: {
                System.out.println("Opcion no valida");
            }
        }
        return animal;
    }


    public void eliminarAnimal(String nombre) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getNombre().equals(nombre)) {
                lista[i] = null;
            }
        }
    }


    //MODIFICAR DATOS
    public void cambiarPeso(String nombre, double peso) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getNombre().equals(nombre)) {
                lista[i].setPeso(peso);
            } else {
                System.out.println("Animal no encontrado");
            }
        }
    }

    public void cambiarEdad(String nombre, int edad) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getNombre().equals(nombre)) {
                lista[i].setEdad(edad);
            } else {
                System.out.println("Animal no encontrado");
            }
        }
    }


    public void cambiarLongitudCuello(String nombre, double longitud) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getNombre().equals(nombre)) {
                if (lista[i] instanceof Jirafa) { //getClass().getSimpleName().equals("Jirafa");
                    ((Jirafa) lista[i]).setLongitudCuello(longitud);
                } else {
                    System.out.println("No se ha podido cambiar la longitud porque no es una jirafa");
                }
            }
        }
    }

    public void cambiarAlturaPingu(String nombre, double altura) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getNombre().equals(nombre)) {
                if (lista[i] instanceof Pinguino) {
                    ((Pinguino) lista[i]).setAltura(altura);
                } else {
                    System.out.println("No se ha podido cambiar la altura porque no es un Pinguino");
                }
            }
        }
    }

    public String hazSonidoAnimal(String nombre){
        String sonido = "";
        for (int i = 0; i < lista.length; i++){
            if(lista[i] != null && lista[i].getNombre().equals(nombre)){
               lista[i].hazSonido();
            }
        }
        return sonido;
    }
}

    //constructores
    //insertar Animal
    //eliminar Animal
    //cambiar un atributo general
    //cambiar algo propio de un hijo


