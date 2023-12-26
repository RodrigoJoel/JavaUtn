//Matriz simetrica : tiene la misma cantidad de filas que de columnas
// que al cambiar las filas a las columas y viceversa los elementos sean iguales
// caso contrario la matriz no es simetrica


import java.util.Scanner;

public class MatrizSimetrica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz[][], nfilas, nColumnas; // No sabemos de que tamaño sera la matriz
        boolean simetrica = true;

        System.out.println(" Digite el numero de filas de matriz: ");//solicitamos el numero de filas
        nfilas = entrada.nextInt();//guardamos el valor ingresado en la variable fila
        System.out.println(" Digite el numero de columnas de matriz: ");//solictamos el numero de columnas
        nColumnas = entrada.nextInt();//guardamos el valor ingresado en la variable columnas

        matriz = new int[nfilas][nColumnas];//aca ya sabemos de cuanto por cuanto sera la matriz


    System.out.println("Digite una matriz: ");
        for (int i=0;i<nfilas;i++){// aqui recorre la fila hasta que complete
            for (int j=0;j<nColumnas;j++){ // aqui recorre las columnas hasta que complete
                System.out.println("Matriz ["+i+"]["+j+"]: ");// este es el mensaje que muestra en pantalla solicitando las datos de las
                matriz [i][j] = entrada.nextInt();//filas y columnas y lo guarda donde corresponde
            }
        }

        if (nfilas == nColumnas){// si el numero de filas es igual al numero de columnas
            int i,j; //los valores de los elemenos dentro la matriz
            i=0;
            while (i<nfilas && simetrica == true){
                j=0;
                while (j<i && simetrica == true){
                    if (matriz[i][j] !=matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica ==true){
                System.out.println(" La matriz es Simetrica ");
            }
            else {
                System.out.println(" La matriz no es Simetrica ");
            }
        }
        else {
            System.out.println(" La matriz no es simetrica ");
        }


    }
}
