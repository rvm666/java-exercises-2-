package Ejercicios_String;

import java.util.Arrays;
import java.util.Scanner;

public class eje1 {
    public static void main(String[] args) {
/*
Hacer un menú que permita al usuario conocer el uso de 10
métodos de la clase String. El programa debe dar la opción 11
para poder salir del mismo.
 */
        System.out.println("Buenos días");
        System.out.println("De las siguientes opciones, seleciona una para obtener mas información sobre los strings");
        System.out.println("0. String ");
        System.out.println("1. Localización de caracteres"); // IndexOf
        System.out.println("2. Concatenado "); //concat
        System.out.println("3. extración "); // .substring
        System.out.println("4. Igualdad"); // equals
        System.out.println("5. Ignoración de mayusculas/minisculas"); // IgnoreCase
        System.out.println("6. Convertir en mayusculas "); //ToUpperCase
        System.out.println("7. Convertir en minusculas "); //toLowerCase
        System.out.println("8. Dar la ultima ocurrencia"); //lasIndexOf
        System.out.println("9. Reemplazar"); //replace
        System.out.println("10. Delimitador"); // split
        System.out.println("11. Salir");
        System.out.println("Escribe el numero de la opción que quieras obtener más información");
        Scanner informacion = new Scanner(System.in);
        String usuario1 = informacion.nextLine();
        switch (usuario1) {
            case "0":
                System.out.println("***********************");
                System.out.println("Este apartado es para entender y recibir información sobre que es un string");
                System.out.println(" Un String es un objeto que se utiliza para representar y manipular una secuencia de caracteres");
                System.out.println("***********************");
                break;
            case "1":
                System.out.println("***********************");
                System.out.println("Para poder llevar a cabo la localización de caracteres se utiliza el siguiente comando: 'nombre_string.IndexOf(__)'; donde las barras bajas corresponde a lo que se tiene que buscar ");
                System.out.println("Ejemplo practico de demostracion: ");
                System.out.println("Introduce una palabra");
                String fraselocalizacion = informacion.nextLine();
                System.out.println("Introduce la letra de esa palabra que quieres buscar: ");
                String localizacion = informacion.nextLine();

                System.out.println("La letra introducida esta en la posición: " + (fraselocalizacion.indexOf(localizacion) + 1));

                System.out.println("***********************");
                break;
            case "2": //concatenado ;
                System.out.println("***********************");
                System.out.println("El comando de concatenación sirve para devolver dos strings seguidos. Para ello vamos a utilizar el metodo de la concatenacion. Este metodo consiste en definir un metodo (ejemplo concatenar) seguido entre parentesis las cosas que se quieren concatenar. Importante si se quiere recibir los valores de dentro de los terminos asignados con un escaner tiene que ser sin comillas, si se ponen comillas se devolvería el nombre de como se llaman lso escaners");
                System.out.println("Una vez se ha hecho el paso anterior, se escribirá abajo dle codigo un metodo para que te lo devuelva en pantalla de la siguiente forma: private static String concatenar(String primerap, String space, String segundap) {return primerap.concat(space).concat(segundap); } ");
                System.out.println("Ejemplo práctico de demostración:");
                System.out.println("Introduce una palabra");
                String primerap = informacion.nextLine();
                System.out.println("Introduce una segunda palabra");
                String segundap = informacion.nextLine();
                System.out.println("La demostración de la concatenación es la siguiente: " + concatenar(primerap, " ", segundap));
                System.out.println("***********************");
                break;
            case "3": //substring para hacer que uns tring saque el numero x de caracteres que tu quieras, poniendo como limite inferior 0 y limite superior x que es el numero de caracteres que se imprimiran despues
                System.out.println("***********************");
                System.out.println("El comando .substring se utiliza para sacar el número X de caracteres que el usuario quiera. Para esto se establecen un límite inferior 'Y' y un limite superior 'X', el cual será el número de caracteres que se imprimira despues");
                System.out.println("La formula del subtring es la siguiente: string.substring(Y,X)");
                System.out.println("Ejemplo práctico de demostración");
                System.out.println("Introduce el limite inferior de localizacion(el que sería la y)");
                Scanner Y = new Scanner(System.in);
                int lector = Y.nextInt();
                System.out.println("Introduce el limite superior de localizacion(el que sería la X)");
                Scanner X = new Scanner(System.in);
                int lector2 = X.nextInt();
                System.out.println("Ahora introduce la palabra para aplicar las localizaciones: )");
                String terceras = informacion.nextLine();
                System.out.println("Demostración del .subtring: " +terceras.substring(lector,lector2));
                System.out.println("***********************");
                break;
            case "4": // equals   string1.equals(string2)
                System.out.println("***********************");
                System.out.println("El apartado de igualdad en los string se ahce con el .equals. Para poder llevar acabo dicha comprobación se usa la siguiente formula: string1.equals(string2)");
                System.out.println("Ejemplo práctico de demostración");
                System.out.println("Introduce la primera palabra para comprobar su igualdad: ");
                String igualdad1 = informacion.nextLine();
                System.out.println("Introduce la segunda palabra para comprobar su igualdad: ");
                String igualdad2 = informacion.nextLine();
                System.out.println("Demostración de si " +igualdad1 +" es igual a " +igualdad2 +". El resultado es que: " +igualdad1.equals(igualdad2));
                System.out.println("***********************");
                break;
            case "5": // IgnoreCase
                System.out.println("***********************");
                System.out.println("Para poder llevar a cabo una ignoración de si una palabra esta en maysuculas o minusculas se utiliza el IgnoreCase. Este comando se pone despues del string de la siguiente forma string1.equalsIgnoreCase (string2)");
                System.out.println("Es importante destacar que el IgnoreCase se emplea para hacer comparaciones (con el compareto o el equals), ya que permite poder comparar dos palabras ignorando las diferencias de maysuculas y minusculas ");
                System.out.println("Ejemplo práctico de demostración");
                System.out.println("Introduce una palabra con maysuculas y minusculas: ");
                String ignorar1 = informacion.nextLine();
                System.out.println("Introduce la misma palabra pero cambiando las maysuculas y minusculas: ");
                String ignorar2 = informacion.nextLine();
                System.out.println("La primera palabra introducida es: " +ignorar1 + ", la segunda palabra  sería: " +ignorar2 +" y el resultado de la comparación sería " +ignorar1.equalsIgnoreCase(ignorar2));
                System.out.println("***********************");
                break;
            case "6": //ToUpperCase
                System.out.println("***********************");
                System.out.println("Existe una posibilidad de cambiar las letras de un string todas a maysuculas. Para eso se usa el comando ToUpperCase de la siguiente forma: nombre_string.toUpperCase()");
                System.out.println("Ejemplo práctico de demostración");
                System.out.println("Introduce una palabra en o con minusculas: ");
                String ignorarM = informacion.nextLine();
                System.out.println("La primera palabra introducida es: " +ignorarM +  " y el resultado de la transformación sería " +ignorarM.toUpperCase());
                System.out.println("***********************");
                break;
            case "7": //ToLowerCase
                System.out.println("***********************");
                System.out.println("Existe una posibilidad de cambiar las letras de un string todas a minusculas. Para eso se usa el comando ToUpperCase de la siguiente forma: nombre_string.toLowerCase()");
                System.out.println("Ejemplo práctico de demostración");
                System.out.println("Introduce una palabra en o con mayusculas: ");
                String ignorarm = informacion.nextLine();
                System.out.println("La primera palabra introducida es: " +ignorarm +  " y el resultado de la transformación sería " +ignorarm.toLowerCase());
                System.out.println("***********************");
                break;
            case "8": //lasIndexOf
                // El mét
                // odo lastIndexOf() devuelve la posicion (indice) en la que se encuentra el
                //  valorBusqueda, dentro del objeto String que realiza la llamada, de la última ocurrencia del valor especificado;
                //  o -1 si no se halla. La búsqueda se realiza empezando por el final de la cadena que realiza la llamada, empezando en indiceDesde.
                System.out.println("***********************");
                System.out.println("Otra funcionalidad es la de localizar la posición en la cual se encuentra una palabra o una letra en concreto. Para ello seutiliza el comando lastIndexOf.");
                System.out.println("La ventaja que este comando ofrece es poder establecer que se quiere localizar concretamente añadiendolo dentro del () despues del comando de la siguiente forma: string.lastIndexOf(localizador); donde la palabra localizador es lo que se quiere buscar concretamente");
                System.out.println("Ejemplo práctico de demostración");
                System.out.println("Introduce una frase: ");
                String localizando = informacion.nextLine();
                localizando.substring(7);
                System.out.println("Introduce que es lo que quieres localizar: ");
                String localizador = informacion.nextLine();
                System.out.println("La frase introducida es: ' " +localizando +" ' y la palabra a localizar: " + localizador + "ocupa la posicion: " +(localizando.lastIndexOf(localizador)+1));
                System.out.println("***********************");
                break;
            case "9": //replace
                // - nombre_string.replace("X", "Y") --> donde x es lo que se quiere sustituir ; donde Y es lo que se quiere reasignar
                System.out.println("***********************");
                System.out.println("En los string se pueden reemplazar valores de una cadena de string por otra. Para ello usamos el replace de la siguiente forma: nombre_string.replace('X', 'Y') --> donde x es lo que se quiere sustituir ; donde Y es lo que se quiere reasignar ");
                System.out.println("Ejemplo práctico de demostración");
                System.out.println("Introduce una frase: ");
                String replace1 = informacion.nextLine();
                System.out.println("Introduce que es lo que quieres sustituir: ");
                String replace2 = informacion.nextLine();
                System.out.println("Introduce el valor de la sustitución: ");
                String replace3 = informacion.nextLine();
                System.out.println("La frase introducida es: ' " +replace1 +" ', lo que se quiere sustituir es: " +replace2 +" y se quiere sustituir por: " +replace3 +", de tal forma que queda de la siguiente forma: " + replace1.replace(replace2, replace3));
                System.out.println("***********************");
                break;
            case "10": //split
                System.out.println("***********************");
                System.out.println("Puede hacerse una division de un string en varias partes utilizando un delimitador para hacer esta separación. Para ello se hace la siguiente formula: tring[] string3 = string.split(string2); donde string2 es el delimitador del string1 y se genera el string3 que es el string separado ");
                System.out.println("Esto genera una arraid que para que se imprima en pantalla se tendría que usar lo siguiente: Arrays.toString(split3) ");
                System.out.println("Ejemplo práctico de demostración");
                System.out.println("Introduce una frase: ");
                String split1 = informacion.nextLine();
                System.out.println("Introduce cual quieres que sea el separador: ");
                String split2 = informacion.nextLine();
                System.out.print("La frase introducida es: " +split1 +" y el separador es: " +split2);
                String[] split3 = split1.split(split2);
                System.out.println(" de tal forma que quedaría del siguiente metodo: " +Arrays.toString(split3));
                System.out.println("***********************");
                break;
            case "11":
                System.out.println("***********************");
                System.out.println("Apagando el programa.");
                System.out.println("***********************");
                break;
            default:
                System.out.println("***********************");
                System.out.println("Opcion no valida. Intentalo de nuevo ");
                System.out.println("***********************");
                break;
        }


    }

    private static String concatenar(String primerap, String space, String segundap) {
        return primerap.concat(space).concat(segundap);
    }
}

