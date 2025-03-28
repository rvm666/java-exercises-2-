package Ejercicios_POO.Examen_Vuelos;

public abstract class Vuelo extends Datos {
    private int identificador;
    private String aerolinea;
    private String responsable_vuelo;
    private String origen;
    private String destino;
    private Fecha fecha;
    private int pasajeros;
    private double precio;
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

   //public Vuelo(){
     //   this.identificador =
    //}

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


   /* public double cambiarPrecio(Vuelo vuelo, double precio){
        vuelo.setPrecio(precio);
        return vuelo.getPrecio();
    }*/
}
