//Sumar cada fila y columna de una matriz

import java.util.Scanner;

public class MatrSuma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz [][] ,nfilas,ncolumnas,sumafilas,sumacolumnas;

        System.out.println("Ingrese el numero de filas: ");//Solicitamos el numero de filas que tendra la matriz
        nfilas = entrada.nextInt();//guardamos el valor
        System.out.println("Ingrese el numero de columnas: ");//solicitamos el numero de columnas que tendra la matriz
        ncolumnas = entrada.nextInt();//guardamos el vaLor

        matriz = new int[nfilas][ncolumnas];//ya sabemos el tamaño de la matriz

        System.out.println(" Digite los elementos de la matriz: ");
        for (int i=0;i<nfilas;i++){//para ingresar los elementos de la fila
            for (int j=0;j<ncolumnas;j++){//para ingresar los datos de las columnas
                System.out.println(" matriz["+i+"]["+j+"]:");//se ingresan los valores hasta completar la matiz
                matriz[i][j] = entrada.nextInt();//se guarda los valores ingresados en la matris tanto en la fina como en la columna
            }
        }
        System.out.println(" matriz original: ");
        for (int i=0;i<nfilas;i++){
            for (int j=0;j<ncolumnas;j++){
                System.out.print(matriz[i][j]+" ");//muestra por pantalla la mastriz original
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        //Ahora se realiza la suma de las filas
        for (int i=0;i<nfilas;i++){
            sumafilas = 0;
            for (int j=0;j<ncolumnas;j++){
                sumafilas += matriz[i][j];
            }
            System.out.println(" La suma de la fila: ["+i+"] es: "+sumafilas);
        }
        System.out.println(" ");

        for (int j=0;j<ncolumnas;j++){
            sumacolumnas = 0;
            for (int i=0;i<nfilas;i++){
                sumacolumnas += matriz[i][j];
            }
            System.out.println(" La suma de la columna: ["+j+"] es: "+sumacolumnas);
        }
        System.out.println(" ");

    }
}
