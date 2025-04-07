package Ejercicios_POO.Examen_Vuelos;

import java.util.Random;

import static java.lang.String.valueOf;

public class VueloInternacional extends Vuelo{
        private final StringBuilder nombre_Escala; //; separo, con un split por ; el length del array que devuelve es el número


    public VueloInternacional(int identificador, String aerolinea, String responsable_vuelo,String origen,String destino,Fecha fecha,int pasajeros,double precio,StringBuilder escala) {
        super(identificador, aerolinea, responsable_vuelo, origen, destino, fecha, pasajeros, precio);
        this.nombre_Escala = escala;
    }

    public VueloInternacional(){
        super();
        Random rdn = new Random();
        this.nombre_Escala = new StringBuilder();
        int max_escala = rdn.nextInt(0,3);
        String pais= null;
        for(int i = 0; i < max_escala; i++) {
            do {
                int numPaisEscalas = rdn.nextInt(0, Nombres.LUGARES.length);
                pais = Nombres.LUGARES[numPaisEscalas];
            } while (pais.equals(this.getOrigen()) && pais.equals(this.getDestino()));
            //pensar como evitar duplicados
            nombre_Escala.append(pais).append(";");
        }
    }

    public int getEscalas() {return nombre_Escala.toString().split(";").length;}
    public StringBuilder getNombre_Escala() {return nombre_Escala;}


    public double calcularPrecioReal(Vuelo vuelo){
        //Una manera de hacerlo
        /*String paisesEscala []= nombre_Escala.toString().split(";");
        int escalasCalculado = paisesEscala.length;*/
        int escalasCalculado = nombre_Escala.toString().split(";").length;

        if (vuelo.getFecha().getMes() == 7 || vuelo.getFecha().getMes() == 8) {
            vuelo.setPrecio(vuelo.getPrecio() * 0.25 + vuelo.getPrecio());
        }

        if(escalasCalculado > 0){
            vuelo.setPrecio(vuelo.getPrecio() - vuelo.getPrecio() * (escalasCalculado * 0.2));
        }
        return vuelo.getPrecio();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("VueloInternacional=" +
                "escala=" + nombre_Escala.toString().split(";").length + '}');
        return valueOf(sb);
    }
}
