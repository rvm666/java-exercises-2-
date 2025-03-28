package Ejercicios_POO.Examen_Vuelos;

public class VueloNacional extends Vuelo {

    public VueloNacional(int identificador, String aerolinea, String responsable_vuelo,String origen,String destino,Fecha fecha,int pasajeros,double precio) {
        super(identificador, aerolinea, responsable_vuelo, origen, destino, fecha, pasajeros, precio);
    }






    public double calcularPrecioReal(Vuelo vuelo){
        if(vuelo.getFecha().getMes() == 7){
            vuelo.setPrecio(vuelo.getPrecio() * 0.20 + vuelo.getPrecio());
        } else if (vuelo.getFecha().getMes() == 8){
            vuelo.setPrecio(vuelo.getPrecio() * 0.20 + vuelo.getPrecio());
        }
        return vuelo.getPrecio();
    }
}
