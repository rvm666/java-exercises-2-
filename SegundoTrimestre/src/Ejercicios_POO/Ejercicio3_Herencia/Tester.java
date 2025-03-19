package Ejercicios_POO.Ejercicio3_Herencia;

public class Tester {
    public static void main(String[] args) {
        Titular Juan = new Titular("Juan", "valero", 19);
        Titular Angela = new Titular("Angela", "Perez", 23);
        Titular Mario = new Titular("Mario", "Ramiro", 38);

        double nomina = 700.00;
        double factura = 80.00;

        CuentaCorriente cuenta1 = new CuentaCorriente(Juan, "12345678", 300);

        CuentaCorriente cuenta2 = new CuentaCorriente(Angela, "87654321");

        CuentaAhorro cuenta3A = new CuentaAhorro(Mario, "09812345", 6870,5);

        System.out.println(cuenta2.toString());
        cuenta2.ingresar(nomina);
        System.out.println(cuenta2.toString());

        System.out.println(cuenta1.toString());
        cuenta1.reintegro(factura);
        System.out.println(cuenta1.toString());

        String comparar = CuentaCorriente.compararCuenta(cuenta1, cuenta2);
        System.out.println(comparar);

        cuenta2.devolverInfoCuenta();
        System.out.println(cuenta3A.toString());
        double interes = cuenta3A.calcularInteres(cuenta3A);
        System.out.println(cuenta3A.toString());
        System.out.println("El interes es: " + interes);
    }
}
