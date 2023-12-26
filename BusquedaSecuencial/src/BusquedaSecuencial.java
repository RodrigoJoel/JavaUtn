//Busqueda Secuencial:



import java.util.Scanner;

public class BusquedaSecuencial {
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);

        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;

        System.out.println(" Digite el dato a buscar: ");
        dato = entrada.nextInt();

        //Busqueda secuencial
        int i=0;
        while (i<5 && band == false){
            if (arreglo[i] == dato){
                band = true;
            }
            i++;
        }

        if (band == false){
            System.out.println(" No se encontro el numero en el arreglo");
        }
        else {
            System.out.println(" El numero se encuentra en el arreglo en la posicion: "+(i-1));
        }

    }

}
