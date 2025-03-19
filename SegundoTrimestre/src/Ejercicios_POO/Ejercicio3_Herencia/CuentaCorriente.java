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
    public void ingresar(double incremento){
        double total;
        total = this.saldo + incremento;
        this.saldo = total;
    }

    public void reintegro(double decremento){
        double total;
        total = this.saldo - decremento;
        this.saldo = total;
    }

    public static String compararCuenta(CuentaCorriente cuenta1, CuentaCorriente cuenta2){
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

    public String devolverInfoCuenta(){
        StringBuilder sb = new StringBuilder("Numero cuenta");
        sb.append(numCuenta);
        sb.append(" con saldo:");
        sb.append(saldo);
        return sb.toString();
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "titular=" + titular +
                ", numCuenta='" + numCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }


    //otra manera de hacer "devolverInfoCuenta"
    /*public void imprimirCuenta(){
        System.out.println("Numero Cuenta:" + numCuenta+ " con saldo"+ saldo);
    }*/

}
