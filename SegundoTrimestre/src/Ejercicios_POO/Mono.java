package Ejercicios_POO;

public class Mono {
    //atributos o caracteristicas
    private String nombre;
    private int edad;
    private float peso;
    private boolean hembra; //hembra->true varón -> false
    private String tipo;
    private float kilosComidaSemanales;
    private String cuidador;

    //contrusctor
    public Mono (String name, int edad, float peso, boolean hembra, String tipo, float kilosComidaSemanales, String cuidador){
        this.nombre = name;
        this.edad = edad;
        this.peso = peso;
        this.hembra = hembra;
        this.tipo = tipo;
        this.kilosComidaSemanales = kilosComidaSemanales;
        this.cuidador = cuidador;
    }
    public Mono(){

    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public float getPeso() {
        return peso;
    }
    public boolean isHembra() {
        return hembra;
    }
    public String getTipo() {
        return tipo;
    }
    public float getKilosComidaSemanales() {
        return kilosComidaSemanales;
    }
    public String getCuidador() {
        return cuidador;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: " + nombre + "\n");
        sb.append("Edad: " + edad + "\n");
        sb.append("Peso: " + peso + "\n");
        sb.append("Hembra: " + hembra + "\n");
        sb.append("Tipo: " + tipo + "\n");
        sb.append("Kilos: " + kilosComidaSemanales + "\n");
        sb.append("Cuidador: " + cuidador + "\n");
        sb.append("\n");
        return sb.toString();
        //return nombre+edad+peso+tipo+kilosComidaSemanales+cuidador+hembra;
    }

    //setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCuidador(String cuidador) {
        this.cuidador = cuidador;
    }

}
