//Solicitar los elementos de la matriz al usuario


import java.util.Scanner;

public class MatrizIn {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz[][],nFilas,nColumnas;// matriz donde no sabemos ni la cantidad de filas ni la cantidad de columnas

        System.out.println(" Ingrese el numero de Filas: ");//Solictamos la cantidad de filas que tendra la matriz
        nFilas = entrada.nextInt();// guardamos el valor ingresado en la variable nFilas
        System.out.println(" Ingrese el numero de Columnas: ");//Solicitamos la cantidad de columnas que tendra la matriz
        nColumnas = entrada.nextInt();// giardamos el valor ingresado en la variable nColumnas

        matriz = new int[nFilas][nColumnas]; //Aqui ya sabemos el tamaño de la matriz

        System.out.println(" Digite la Matriz: "); //pedimos que ingrese los elementos de la matriz
        for (int i=0;i<nFilas;i++){// aqui recorre la fila hasta que complete
            for (int j=0;j<nColumnas;j++){ // aqui recorre las columnas hasta que complete
                System.out.println("Matriz ["+i+"]["+j+"]: ");// este es el mensaje que muestra en pantalla solicitando las datos de las
                matriz [i][j] = entrada.nextInt();//filas y columnas y lo guarda donde corresponde

            }
        }
        for (int i=0;i<nFilas;i++) { // numero de filas
            for (int j=0; j<nColumnas;j++) {// numero de columnas
                System.out.print(matriz[i][j]);//imprime la matriz ya con los datos ingresados
            }
            System.out.println(" ");
        }
    }
}
