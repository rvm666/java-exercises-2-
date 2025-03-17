package Ejercicios_POO.Ejercicio4;

public class Tester {
    public static void main(String[] args) {
       Contacto amiga = new Contacto("1234", new Titular("Laura", "laura@gmail.com"));
        System.out.println(amiga);
       GestorContactos.modificarTelefono(amiga,"11234234");
        System.out.println(amiga);
    }
}
