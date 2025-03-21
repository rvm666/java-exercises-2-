package Ejercicios_POO.zoo;

public abstract class Animal {
    private String nombre;
    private double peso;
    private int edad;
    private String sonido;

    public Animal(String nombre, double peso, int edad, String sonido){
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        this.sonido = sonido;
    }

    public Animal(){
        this.nombre = "";
        this.peso = 0;
        this.edad = 0;
        this.sonido = "";
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public double getPeso() {return peso;}

    public void setPeso(double peso) {this.peso = peso;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public String getSonido() {return sonido;}

    public void setSonido(String sonido) {this.sonido = sonido;}

    //nombre,peso, edad
    //dos hijos con algún atributo propio
    //padre obliga a los hijos a que implementen el método
    public abstract String hazSonido();
}
