package Ejercicios_POO.zoo;

import java.util.Random;

import static java.lang.String.valueOf;

public class Pinguino extends Animal{
    private double altura;


    public Pinguino(String nombre, double peso, int edad, double altura) {
        super(nombre, peso, edad);
        this.altura = altura;
    }

    public Pinguino() {
        super();
        Random rdn = new Random();
        this.altura = rdn.nextDouble(200);
    }

    public double getAltura() {return altura;}

    public void setAltura(double altura) {this.altura = altura;}

    @Override
    public String hazSonido() {
        return "UUUUUUUUUUUUUUUUU";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" altura=" + altura +
                '}');
        return valueOf(sb);
    }
}
