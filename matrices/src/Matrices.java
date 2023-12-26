//Matriz

//Este ejemplo representa una matriz con los elementos ya definidos matriz[][] = {{1,2,3},{4,5,6},{7,8,9}} 3*3
public class Matrices {

    public static void main(String[] args) {
        //en la matriz van
        // dos corchetes   //los numeros representan los elementos de la matriz
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};//matriz 3*3
                   //los {} representan las cantidad de filas y los numeros dentro
                   //la cantidad de columnas dentro de cada fila

        for (int i=0;i<3;i++) { // numero de filas
            for (int j = 0; j < 3; j++) {// numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
