//Crear y cargar una matriz 3x3,,
//transponerla y mostrarla


import java.util.Scanner;

public class MatrizTranspuesta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];// ya tenemos definida el tamaño de la matriz

        System.out.println("Digite la matriz");
        for (int i=0;i<3;i++){//para ingresar los elementos de la fila
            for (int j=0;j<3;j++){//para ingresar los datos de las columnas
                System.out.println(" matriz["+i+"]["+j+"]:");//se ingresan los valores hasta completar la matiz
                matriz[i][j] = entrada.nextInt();//se guarda los valores ingresados en la matris tanto en la fina como en la columna
            }
        }

        System.out.println(" matriz original: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");//muestra por pantalla la mastriz original
            }
            System.out.println(" ");
        }
        //transponiendo la matriz
        int aux;
        for (int i=0;i<3;i++){
            for (int j=0;j<i;j++){//saca la transpuesta desde la diagonal principal hacia abajo por eso el j<i
              aux = matriz[i][j];
              matriz[i][j] = matriz[j][i];
              matriz[j][i] = aux;
            }
        }

        System.out.println(" La matriz transpuesta es: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
