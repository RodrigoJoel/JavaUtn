import java.util.Scanner;

public class VehiculoMain {

    public static int indiceAutoMBarato(Vehiculo[] autos) {
        float precio;
        int indice = 0;

        precio = autos[0].getPrecio();  //almacena el primer precio que se ingrese
        for (int i=1;i<autos.length;i++){//aca recorre todos los precios para ver cual es el menor
            if (autos[i].getPrecio() < precio) {
                precio = autos[i].getPrecio();
                indice = i;
            }
        }
        return indice;//Aqui queda guardado el precio del vehiculo mas barato
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String marca;
        String modelo;
        float precio;
        int numeroVehiculos;
        int indiceBarato;

        System.out.println("Digite la cantidad de vehiculos");
        numeroVehiculos = entrada.nextInt();


        //Se crea los objetos para los autos
        Vehiculo[] autos = new Vehiculo[numeroVehiculos];

        for (int i=0;i< autos.length;i++){
            entrada.nextLine();
            System.out.println("digite las caracterizticas del auto: "+(i+1)+"\n");
            System.out.println("Ingrese la marca: ");
            marca = entrada.nextLine();
            System.out.println("Ingrese el modelo: ");
            modelo = entrada.nextLine();
            System.out.println("Ingrese el precio: ");
            precio = entrada.nextFloat();

            autos[i] = new Vehiculo(marca,modelo,precio);//arreglo de autos i porque no sabemos el tamaño que tendra
        }
        indiceBarato = indiceAutoMBarato(autos);//al ser una clase estatica no es necesario crear un objeto por lo
        System.out.println(" El auto mas barato es: ");//que llamamos directamente a la clase que tiene guardado el valor del auto mas barato
        System.out.println(autos[indiceBarato].mostrarDatos());

    }
}
