package Ejercicios_POO.Ejercicio4;

public class Contacto {
    private String telefono;
    private Titular titular;

    public Contacto(){
        this.telefono = "";
        this.titular = new Titular();
    }

    public Contacto(String telefono, Titular titular){
        this.telefono = telefono;
        this.titular = titular;
    }

    public String getTelefono() { return telefono;}
    public void setTelefono(String telefono) { this.telefono = telefono;}

    public Titular getTitular() { return titular;}
    public void setTitular(Titular titular) { this.titular = titular;}

    @Override
    public String toString() {
        return "Contacto{" +
                "telefono='" + telefono + '\'' +
                ", titular=" + titular +
                '}';
    }
}
