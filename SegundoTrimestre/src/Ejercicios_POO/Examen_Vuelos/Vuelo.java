package Ejercicios_POO.Examen_Vuelos;

import java.util.Arrays;
import java.util.Random;

public abstract class Vuelo extends Datos {
    private int identificador;
    private String aerolinea;
    private String responsable_vuelo;
    private String origen;
    private String destino;
    private Fecha fecha;
    private int pasajeros;
    private double precio;
    String[] areolineaN = {"Aeromexico","Saudia","Delta","Avianca", "SAS", "Iberia", "EasyJet","Qatar","Emirates","Volaris"};
    String[] responsable_vueloN = {"Juan","Alberto","Marcos", "Angel", "Celia", "Lucia","Paula", "Maria", "Soraya", "Victor"};
    String[] lugaresN = {"Madrid", "Barcelona", "Malaga", "Paris", "Londres", "Berlin", "Los Angeles", "Nueva York", "Moscú", "Tokyo", "Singapur", "Qatar", "Ciudad de Mexico", "Buenos Aires", "Lima", "HongKong", "Seul", "Roma", "Oslo"};
    public abstract double calcularPrecioReal(Vuelo vuelo);

    public Vuelo(int identificador, String aerolinea, String responsable_vuelo,String origen,String destino,Fecha fecha,int pasajeros,double precio){
        this.identificador = identificador;
        this.aerolinea = aerolinea;
        this.responsable_vuelo = responsable_vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
        this.precio = precio;
    }

   public Vuelo(){
        Random rdn = new Random();
        boolean a = true;
        int num = 0;
        for (int i = 0; a == true; i++ ) {
            num = i;
       }

        int num1 = 0;
        int num2 = 0;
        boolean b = true;
        do{
            num1 = rdn.nextInt(lugaresN.length);
            num2 = rdn.nextInt(lugaresN.length);
            if(num1 != num2){
                b = false;
            }
        }while (b = true);
       System.out.println(Nombres.AEROLINEAS[0]);
        this.identificador = num;
        this.aerolinea = areolineaN[rdn.nextInt(areolineaN.length)];
        this.responsable_vuelo = responsable_vueloN[rdn.nextInt(responsable_vueloN.length)];
        this.origen = lugaresN[num1];
        this.destino = lugaresN[num2];
        this.fecha = new Fecha();
        this.pasajeros = rdn.nextInt(150, 500);
        this.precio = rdn.nextDouble(50, 350);
    }

    public int getIdentificador() {return identificador;}

    public void setIdentificador(int identificador) {this.identificador = identificador;}

    public String getAerolinea() {return aerolinea;}

    public void setAerolinea(String aerolinea) {this.aerolinea = aerolinea;}

    public String getResponsable_vuelo() {return responsable_vuelo;}

    public void setResponsable_vuelo(String responsable_vuelo) {this.responsable_vuelo = responsable_vuelo;}

    public String getOrigen() {return origen;}

    public void setOrigen(String origen) {this.origen = origen;}

    public String getDestino() {return destino;}

    public void setDestino(String destino) {this.destino = destino;}

    public Fecha getFecha() {return fecha;}

    public void setFecha(Fecha fecha) {this.fecha = fecha;}

    public int getPasajeros() {return pasajeros;}

    public void setPasajeros(int pasajeros) {this.pasajeros = pasajeros;}

    public double getPrecio() {return precio;}

    public void setPrecio(double precio) {this.precio = precio;}

    @Override
    public String toString() {
        return "Vuelo{" +
                "identificador=" + identificador +
                ", aerolinea='" + aerolinea + '\'' +
                ", responsable_vuelo='" + responsable_vuelo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                ", pasajeros=" + pasajeros +
                ", precio=" + precio +
                '}';
    }

    /* public double cambiarPrecio(Vuelo vuelo, double precio){
        vuelo.setPrecio(precio);
        return vuelo.getPrecio();
    }*/
}
