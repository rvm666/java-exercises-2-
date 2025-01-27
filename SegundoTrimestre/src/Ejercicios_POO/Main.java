package Ejercicios_POO;


public class Main {
    public static void main(String[] args) {
        Mono copito = new Mono("Copito", 18, 100, false, "Gorila", 20, "Luna");
        Mono amedio = new Mono("Amedio", 3, 8, false, "Chimpancé", 3, "Marcos");
        Mono mono3 = new Mono();
        System.out.println(copito.getCuidador());
        System.out.println(amedio.getPeso());
        copito.setCuidador("Javi");
        System.out.println(mono3);
        System.out.println();
        EntradaSalida.dameMono();
    }
}