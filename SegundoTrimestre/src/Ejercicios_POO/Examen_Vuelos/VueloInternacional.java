package Ejercicios_POO.Examen_Vuelos;

import java.util.Random;

import static java.lang.String.valueOf;

public class VueloInternacional extends Vuelo{
        private StringBuilder nombre_Escala; //; separo, con un split por ; el length del array que devuelve es el número

    public VueloInternacional(int identificador, String aerolinea, String responsable_vuelo,String origen,String destino,Fecha fecha,int pasajeros,double precio,StringBuilder escalas) {
        super(identificador, aerolinea, responsable_vuelo, origen, destino, fecha, pasajeros, precio);
        this.nombre_Escala = escalas;
    }

    public VueloInternacional(){
        super();
        nombre_Escala = new StringBuilder();
        Random rdn = new Random();
        this.nombre_Escala = new StringBuilder();
        for ()
    }

    public int getEscala() {return escala;}

    public void setEscala(int escala) {this.escala = escala;}

    public String[] getNombre_Escala() {return nombre_Escala;}


    public double calcularPrecioReal(Vuelo vuelo){
        if (vuelo.getFecha().getDia() == 7 || vuelo.getFecha().getDia() == 8) {
            vuelo.setPrecio(vuelo.getPrecio() * 0.25 + vuelo.getPrecio());
        }
        if(escala > 0){
            vuelo.setPrecio(vuelo.getPrecio() - vuelo.getPrecio() * (escala * 0.2));
        }
        return vuelo.getPrecio();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("VueloInternacional=" +
                "escala=" + escala + '}');
        return valueOf(sb);
    }
}
