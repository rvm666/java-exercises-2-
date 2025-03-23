package Ejercicios_POO.zoo;

public class Animales {
    private Animal[] lista;//polimorfismo: sus elementos son Animales pero pueden tomar diferentes formas, tantas como hijos tengas

    public Animales(int tamaño, Animal animal){
        lista = new Animal[tamaño];
        for (int i = 0; i < lista.length; i++) {
            this.lista[i] = animal;
        }
    }

    public Animales() {
        this.lista = new Animal[10];
    }

    public void insertarAnimal(Animal a){
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = a;
            } else {
                System.out.println("La lista esta completa");
            }
        }
    }


    public void eliminarAnimal(Animal a){
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == a){
                lista[i] = null;
            }
        }
    }

    public void cambiarPeso(Animal a, double peso){
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == a){
                lista[i].setPeso(peso);
            } else {
                System.out.println("Animal no encontrado");
            }
        }
    }

    public void cambiarEdad(Animal a, int edad){
        for (int i = 0; i < lista.length; i++){
            if (lista[i] == a){
                lista[i].setEdad(edad);
            } else {
                System.out.println("Animal no encontrado");
            }
        }
    }

    public void cambiarLongitudCuello(Jirafa a, double longitud){
        for (int i = 0; i < lista.length; i++){
            if (lista[i] == a){

            }
        }
    }

    //constructores
    //insertar Animal
    //eliminar Animal
    //cambiar un atributo general
    //cambiar algo propio de un hijo

}
