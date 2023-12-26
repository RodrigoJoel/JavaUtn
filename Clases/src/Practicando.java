public class Practicando {
// arreglo : estructura de datos que nos permite almacenar un conjunto de datos del mismo tipo
// el tamaño se declara desde un principio y no se puede modificar

    public static void main(String[] args) {

        int[] numeros = new int[3];
// se declara tipo de variable (int) nombre(numeros) = new tipo de variable [dimension] tamaño

        numeros[0] = 7;   // se puede declarar el valor por separado como en este caso
        numeros[1] = 10; // o todo desde un principio int[] numeros = {5,7,9}
        numeros[2] = 13;

        for (int i=0;i<3;i++){

            System.out.println(numeros[i]);
        }


    }
}
