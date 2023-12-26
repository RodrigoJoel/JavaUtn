/*Hacer un programa para calcular el area de Poligonos(Triangulos y rectangulos)
el programa debe ser capaz de almacenar en un arreglo N triangulos y rectangulos
y al fiinal mostrar el area y los datos de cada uno. Para ello se tendra lo siguiente.
-Una suer clase llamada Poligono;
-una sub clase llamada triangulo;
-una sub clase llamada rectangulo;
 */


import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalPoligono {
    //Arreglo dinamico: a medida que avanza se da cuenta de la cantidad
    //de elementos tiene el arreglo.
    static ArrayList <Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Llenar un poligono
        llenarPoligono();

        //Mostrar los datos y el area de cada poligono
        mostrarResultados();

    }
    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Digite que poligono desea: ");
                System.out.println("1. Triangulo");
                System.out.println("2. Rectangulo");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();
            }while(opcion<1 || opcion>2);
            switch (opcion){
                case 1: llenarTriangulo(); //llenar un triangulo
                    break;
                case 2: llenarRectangulo(); //llenar un rectangulo
                    break;
            }
            System.out.println("Desea introducir otro poligono(s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");
        }while (respuesta=='s' || respuesta=='S');
    }
    public static void llenarTriangulo(){
        double lado1,lado2,lado3;
        System.out.println("digite el lado1 del triangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("digite el lado2 del triangulo: ");
        lado2 = entrada.nextDouble();
        System.out.println("digite el lado3 del triangulo: ");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        //guardamos un triangulo dentro del arreglo poligonos
        poligono.add(triangulo);
    }
    public static void llenarRectangulo(){
        double lado1,lado2;
        System.out.println("digite el lado1 del rectangulo: ");
        lado1 = entrada.nextDouble();
        System.out.println("digite el lado2 del rectangulo: ");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        //guardamos un rectangulo dentro del arreglo poligonos
        poligono.add(rectangulo);
        }

        public static void mostrarResultados(){
        for (Poligono poli: poligono){
            System.out.println(poli.toString());//depende de que tipo de poligono sea
                                                //el toString muestra el dato correspondiente
            System.out.println("Area: "+poli.area());//lo mismo con el area...
            System.out.println("");

        }
    }

}
