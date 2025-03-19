package Ejercicios_POO.Ejercicio3_Herencia;

public class CuentaAhorro extends CuentaCorriente{
    private double interes;

    //CONSTRUCTORES
    public CuentaAhorro(Titular titular, String numCuenta, double saldo, double interes){
        super(titular, numCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, String numCuenta, double interes){
        super(titular, numCuenta);
        //super(titular, numCuenta, 15.3);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, String numCuenta){
        super(titular, numCuenta);
        this.interes = 2.5;
    }

    //GETTER
    public double getInteres() {return interes;}

    //METODOS
    public double calcularInteres(CuentaAhorro cuentaAhorro) {
        double interes = cuentaAhorro.getSaldo() * this.interes;
        cuentaAhorro.setSaldo(cuentaAhorro.getSaldo() + interes);
        return interes;
    }
}
