package Ejercicios_POO.zoo;

public abstract class Animal {
    private String nombre;
    private double peso;
    private int edad;

    public Animal(String nombre, double peso, int edad){
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }

    public Animal(){
        this.nombre = "";
        this.peso = 0;
        this.edad = 0;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}


    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", edad=" + edad +
                '}';
    }

    //nombre,peso, edad
    //dos hijos con algún atributo propio
    //padre obliga a los hijos a que implementen el método
    public abstract String hazSonido();
}
