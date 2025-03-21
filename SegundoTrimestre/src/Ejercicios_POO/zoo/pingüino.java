package Ejercicios_POO.zoo;

public class pingüino extends Animal{
    private double altura;


    public pingüino(String nombre, double peso, int edad, String sonido, double altura) {
        super(nombre, peso, edad, sonido);
        this.altura = altura;
    }

    public pingüino() {
        super();
        this.altura = 0.0;
    }

    public double getAltura() {return altura;}

    public void setAltura(double altura) {this.altura = altura;}

    @Override
    public String hazSonido() {
        return "";
    }
}
