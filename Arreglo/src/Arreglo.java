/*Leer 10 enteros ordenados en forma creciente. Leer Ny buscarlo en la tabla.
Se debe mostrar la posicion en que se encuentra. si no esta indicarlo con un mensaje
 */

import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], numero;  //se declara el arreglo y la variable numero como enteros
        boolean creciente = true;

        arreglo = new int[10];  //Arreglo con 10 posiciones

        do {
            //Pedimos el arreglo
            System.out.println("Digite el arreglo"); //primer mensaje que digite el arreglo que solo lo muestra por pantalla
            for (int i = 0; i < 10; i++) {  // que siga pidiendo numeros hasta completar las 10 posiciones
                System.out.print(i + ". Digite un numero: "); //solicita los numeros hasta completar
                arreglo[i] = entrada.nextInt(); // guarda los numeros ingresados
            }
            //Verificar si el arreglo esta ordenado
            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i++]) {  //si el numero en la posicion i(0) es menor al siguiente i++(1)... CRECIENTE
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i++]) {//si el numero en la posicion i(0) es mayor al siguiente i++(1)... decreciente
                    creciente = false;
                    break;
                }
            }
                if (creciente == false) { //si es decreciente pide que se digite los numeros del arreglo nuevamente
                    System.out.println(" El arreglo esta desordenado, digite nuevamente");
                }
            }
            while (creciente == false);{ //si es creciente pide ingresar un numero para bucarlo en el arreglo

                //Pedimos el numero a buscar
                System.out.print("  Digite el numero a buscar: ");
                numero = entrada.nextInt();

                //Buscamos el numero en el arreglo
                int i = 0;
                while (i < 10 && arreglo[i] < numero) {
                    i++;// se guardan las posiciones
                }
                if (i == 10) { //Hemos recorrido todo el arreglo y no se encontro nada
                    System.out.println("  Numero no encontrado  ");
                }
                else {
                    if (arreglo[i] == numero) { // si un numero del arreglo coincide con el numero buscado
                        System.out.println("  Numero encontrado en la posicion: " +i);
                    } else {
                        System.out.println("  Numero no encontrado  ");
                    }
                }
            }
    }
}
