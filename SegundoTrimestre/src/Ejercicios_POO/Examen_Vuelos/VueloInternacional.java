package Ejercicios_POO.Examen_Vuelos;

public class VueloInternacional extends Vuelo{
        private int escala;
        private String[] nombre_Escala;

    public VueloInternacional(int identificador, String aerolinea, String responsable_vuelo,String origen,String destino,Fecha fecha,int pasajeros,double precio,int escala) {
        super(identificador, aerolinea, responsable_vuelo, origen, destino, fecha, pasajeros, precio);
        this.escala = escala;
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
}
