package Ejercicios_POO.Ejercicio1;

public class OperacionesTriangulo {
    int lado1, lado2, lado3;
    String nombre;
    public int getLado1() {
        return lado1;
    }
    public int getLado2() {
        return lado2;
    }
    public int getLado3() {
        return lado3;
    }
    public String getNombre() {
        return nombre;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void perimetro(){
        if (lado1 == lado2 && lado2 == lado3){
            int perimetro_equilatero = lado1 * 3;
        } else if (lado1 == lado2 && lado3 != lado2){
            int perimetro_isosceles = (lado1 * 2) + lado3;
        } else if (lado1 == lado3 && lado2 != lado3){
            int perimetro_isosceles2 = (lado1 * 2) + lado2;
        } else if (lado1 != lado2 && lado2 != lado3){
            int perimetro_escaleno = lado1 + lado2 + lado3;
        }
    }

    public void area(){
        int area = Math.sqrt([4*Math.pow(lado1,2)*Math.pow(lado2,2) - Math.pow(Math.pow(lado1,2) + Math.pow(lado2,2) - Math.pow(lado3,2), 2)])/4;

        int area2 = 1/4 * Math.sqrt(4*Math.pow(lado1,2)*Math.pow(lado2,2) - Math.pow(Math.pow(lado1,2) + Math.pow(lado2,2) - Math.pow(lado3,2), 2)])/4;
    }
}
