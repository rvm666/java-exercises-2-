package Ejercicios_String;
import java.util.Scanner;

public class Main_de_gema {
    public static void main(String[] args) {

        String cadena = "Hola";
        String cadena2 = cadena.substring(2,3); //Extrae los caracteres que esten entre esas posiciones --> [inicio, fin)
        System.out.println(cadena2);
        System.out.println(cadena.indexOf("a")); //Dice la posición en la que esta el caracter especificado.
        System.out.println(cadena);
        System.out.println(cadena.length()); //Imprime la longitud de la cadena.
        cadena += " que tal?"; //suma a la cadena ", que tal?"
        System.out.println(cadena);
        cadena = cadena.concat(" que tal?"); //suma a la cadena ", que tal?"
        System.out.println(cadena);
        System.out.println(cadena.length());
        cadena = cadena.concat(cadena2);
                        /* NO HE CONSEGUIDO QUE FUNCIONASE
                        String[] palabras = cadena.split(" ");
                        int posicion = cadena.indexOf("que");
                        System.out.println(Arrays.toString(palabras));
                        System.out.println(posicion);
                        System.out.println(palabras[posicion]);
                        */
        //Esto es para sacar la palabra "que" sin ponerle expresamente la posición donde esta¡
        System.out.println(cadena.substring(cadena.indexOf("que"),cadena.indexOf("que")+3));


        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce usuario");
        String usuario1 = teclado.nextLine(); //Leer un String
        System.out.println("Introduce su password");
        String password = teclado.nextLine();
        String usuario2 = "ca";
        System.out.println(usuario2.toUpperCase()); //Pone los caracteres en mayuscula
        System.out.println(usuario2.replace('a','e')); //Cambia los caracteres del primer lugar por los del segudo.
        /*
        if (usuario2.equalsIgnoreCase(usuario1))
            System.out.println("Usuarios coinciden");
                System.out.println(usuario1.compareTo(usuario2));
                System.out.println("Introduce frase");
                String frase = teclado.nextLine();
                String[] trozos = frase.split(", ");
                System.out.println(trozos.length);
                System.out.println(Arrays.toString(trozos));

                Scanner teclado2 = new Scanner("HOla asdf asdfasdf sadf");
                int i=0;
                while(teclado2.hasNext()) {
                    System.out.println(teclado2.next());
                    i++;
                }
                System.out.println(i);
           */
    }

}


