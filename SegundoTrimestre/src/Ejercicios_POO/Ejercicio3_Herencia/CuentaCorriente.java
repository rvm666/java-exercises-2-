package Ejercicios_POO.Ejercicio3_Herencia;

import java.sql.SQLOutput;

public class CuentaCorriente {
    private Titular titular;
    private String numCuenta;
    private double saldo;


    //CONSTRUCTORES
    public CuentaCorriente(Titular titular, String numCuenta, double saldo){
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Titular titular, String numCuenta) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = 15.3;
    }


    //GETTER
    public Titular getTitular() {return titular;}
    public String getNumCuenta() {return numCuenta;}
    public double getSaldo() {return saldo;}


    //SETTER
    public void setSaldo(double saldo) {this.saldo = saldo;}


    //METODOS
    public double ingresar(double incremento){
        double total;
        total = saldo + incremento;
        return total;
    }

    public double reintegro(double decremento){
        double total;
        total = saldo - decremento;
        return total;
    }

    public String compararCuenta(CuentaCorriente cuenta1, CuentaCorriente cuenta2){
        String loson = "";
        int soniguales;
        soniguales = cuenta1.getNumCuenta().compareTo(cuenta2.getNumCuenta());
        if (soniguales == 0){
            loson = "Son iguales";
        } else {
            loson = "No son iguales";
        }
        return loson;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "titular=" + titular +
                ", numCuenta='" + numCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    public void imprimirCuenta(){
        System.out.println("Numero Cuenta:" + numCuenta+ " con saldo"+ saldo);
    }
    public String devolverInfoCuenta(){
        StringBuilder sb = new StringBuilder("Numero cuenta");
        sb.append(numCuenta);
        sb.append(" con saldo:");
        sb.append(saldo);
        return sb.toString();

    }
}
