import java.util.Scanner;

public class RaizScanner {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero: ");
        numero = entrada.nextInt();
        double resultado = Math.sqrt(numero);
        System.out.println("La raiz de " +numero +" es = " +resultado);

    }
}
