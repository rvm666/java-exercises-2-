package Ejercicios_POO.Ejercicio4;

public class Tester {
    public static void main(String[] args) {
       Contacto amiga = new Contacto("1234", new Titular("Laura", "laura@gmail.com"));
        System.out.println(amiga);
       GestorContactos.modificarTelefono(amiga,"11234234");
        System.out.println(amiga);

        Contacto amiga1 = new Contacto("1234", new Titular("Laura", "laura@gmail.com"));
        Contacto amigo = new Contacto("4567", new Titular("Luis", "Pedro@gmail.com"));

        System.out.println(amigo);

        GestorContactos.cambiarCorreo(amigo, "Luis@gmail.com");

        System.out.println(amigo);

        GestorContactos.compararContacto(amiga, amiga1);

        GestorContactos.compararContacto(amiga, amigo);
    }
}
