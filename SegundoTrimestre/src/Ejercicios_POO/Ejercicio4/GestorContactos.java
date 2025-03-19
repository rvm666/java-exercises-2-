package Ejercicios_POO.Ejercicio4;

public class GestorContactos {


    public static void modificarTelefono(Contacto contacto,String telefono) {

        contacto.setTelefono(telefono);

    }

    public static void cambiarCorreo(Contacto contacto,String correo) {
        contacto.getTitular().setCorreo(correo);
    }



    public static String compararContacto(Contacto contacto1, Contacto contacto2) {
        String resultado = " ";
        if (contacto1.equals(contacto2)) {
            resultado = "Son iguales";
        } else {
            resultado = "No son iguales";
        }
        return resultado;
    }
}
