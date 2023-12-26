import java.util.Scanner;
//se crea un arreglo de 5 posiciones donde el usuario ingresa por pantalla
//los valores y despues muestra el arreglo completo.

public class Arreglo {

    public static void main(String[] args) {
        int[] ubicaciones = new int[5];//arreglo de enteros de 5posiciones

        Scanner entrada = new Scanner(System.in);
        //para la posicion 0 que ingrese el primer valor
        //mientras la cantidad de valores ingresados sea menor al numero de posiciones del arreglo
        //sigue ingresando valores.
        for (int i = 0; i < ubicaciones.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            ubicaciones[i] = entrada.nextInt(); // o entrada.next() para cadenas
        }
      //  System.out.println("El valor de la posicion es: "+ (ubicaciones[3]));//muestra el valor ingresado en la posicion seleccionada

        //muestra el arreglo completo
        System.out.println("Los valores ingresados son:");
        for (int i = 0; i < ubicaciones.length; i++) {
            System.out.println(ubicaciones[i]);
        }
    }
}
