package Ejercicios_POO.Ejercicio4;

public class Tester {
    public static void main(String[] args) {
       Contacto amiga = new Contacto("1234", new Titular("Laura", "laura@gmail.com"));
       GestorContactos.modificarTelefono(amiga,"11234234");
        System.out.println("amiga: " + amiga);

        Contacto amiga1 = new Contacto("1234", new Titular("Laura", "laura@gmail.com"));
        Contacto amigo = new Contacto("4567", new Titular("Luis", "Pedro@gmail.com"));

        GestorContactos.modificarTelefono(amiga1, "11234234");
        GestorContactos.cambiarCorreo(amigo, "Luis@gmail.com");
        System.out.println("amiga1: " + amiga1);
        System.out.println("amigo: " + amigo);

        String resultado1 = GestorContactos.compararContacto(amiga, amiga1);
        System.out.println(resultado1);

        String resultado = GestorContactos.compararContacto(amiga, amigo);
        System.out.println(resultado);
    }
}
