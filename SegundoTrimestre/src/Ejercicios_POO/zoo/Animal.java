package Ejercicios_POO.zoo;

import java.util.Random;

public abstract class Animal {
    private String nombre;
    private double peso;
    private int edad;
    private String[] nombres = {"Aurelio", "Tomas", "Marta", "Aitor", "Ana"};

    public Animal(String nombre, double peso, int edad){
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    public Animal(){
        Random rdn = new Random();
        this.nombre = nombres[rdn.nextInt(nombres.length)];
        this.peso = rdn.nextDouble(200);
        this.edad = rdn.nextInt(50);
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}


    public abstract String hazSonido();

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", edad=" + edad;
    }

    //nombre,peso, edad
    //dos hijos con algún atributo propio
    //padre obliga a los hijos a que implementen el método
}
