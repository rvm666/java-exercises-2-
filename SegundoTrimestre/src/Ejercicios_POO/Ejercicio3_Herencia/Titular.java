package Ejercicios_POO.Ejercicio3_Herencia;

public class Titular {
    private String nombre;
    private String apellidos;
    private int edad;

    public Titular(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Titular(){
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }

    public void setNombre(String nombre){ this.nombre = nombre;}
    public void setApellidos(String apellidos){ this.apellidos = apellidos;}
    public void setEdad(int edad) {this.edad = edad;}

    public String getNombre(){ return nombre;}
    public String getApellidos(){return apellidos;}
    public int getEdad() {return edad;}

    @Override
    public String toString() {

        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}

