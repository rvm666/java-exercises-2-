package Ejercicios_String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrada_salida {
    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce un nÃºmero");
        String entradaNumero = lector.readLine();
        int numero = Integer.parseInt(entradaNumero);
        System.out.println(numero*numero);

    }
}
