package Ejercicios_POO.zoo;

public class Pinguino extends Animal{
    private double altura;


    public Pinguino(String nombre, double peso, int edad, double altura) {
        super(nombre, peso, edad);
        this.altura = altura;
    }

    public Pinguino() {
        super();
        this.altura = 0.0;
    }

    public double getAltura() {return altura;}

    public void setAltura(double altura) {this.altura = altura;}

    @Override
    public String hazSonido() {
        return "UUUUUUUUUUUUUUUUU";
    }

    @Override
    public String toString() {
        return "pingüino{" +
                "altura=" + altura +
                '}';
    }
}
