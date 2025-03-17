package Ejercicios_POO.Ejercicio4;

public class Titular {
    private String nombre;
    private String correo;

    public Titular(){
        this.nombre = "";
        this.correo = "";
    }

    public Titular(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    public void setNombre(String nombre){ this.nombre = nombre;}
    public void setCorreo(String correo){ this.correo = correo;}

    public String getNombre(){ return nombre;}
    public String getCorreo(){return correo;}

    @Override
    public String toString() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
