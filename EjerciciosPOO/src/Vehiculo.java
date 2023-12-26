//Ejercicio 3: Construir un programa que dada una serie de vehiculos
//caracterizados por su marca,modelo y precio, imprima las propiedades
//del vehiculo mas barato. Para ello, se deberan leer por teclado las
//caracterizticas de cada vehiculo y crear una clase que represente
//a cada uno de ellos.


public class Vehiculo {
    //Atributos:
    private final String marca;
    private final String modelo;
    private final float precio;


    //Metodo Construcctor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio+"\n";
    }
}
