package Ejercicios_POO.zoo;

public class Jirafa extends Animal{
    private double longitudCuello;

    public Jirafa(String nombre, double peso, int edad, String sonido, double longitudCuello) {
        super(nombre, peso, edad, sonido);
        this.longitudCuello = longitudCuello;
    }

    public Jirafa(){
        super();
        this.longitudCuello = 0.0;
    }

    public double getLongitudCuello() {return longitudCuello;}

    public void setLongitudCuello(double longitudCuello) {this.longitudCuello = longitudCuello;}

    @Override
    public String hazSonido() {
        return "";
    }
}
