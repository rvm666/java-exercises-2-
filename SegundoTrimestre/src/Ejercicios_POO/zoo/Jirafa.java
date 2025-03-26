package Ejercicios_POO.zoo;

import java.util.Random;

import static java.lang.String.valueOf;

public class Jirafa extends Animal{
    public double longitudCuello;

    public Jirafa(String nombre, double peso, int edad, double longitudCuello) {
        super(nombre, peso, edad);
        this.longitudCuello = longitudCuello;
    }

    public Jirafa(){
        super();
        Random rdn = new Random();
        this.longitudCuello = rdn.nextDouble(3);
    }

    public double getLongitudCuello() {return longitudCuello;}

    public void setLongitudCuello(double longitudCuello) {this.longitudCuello = longitudCuello;}

    public String hazSonido() {
        return "IIIIIIIIIIII";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" longitudCuello=" + longitudCuello +
                '}');
        return valueOf(sb);
    }


}
