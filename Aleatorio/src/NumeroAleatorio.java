import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        int numero;
        int intentos = 0;

        int random = (int) (Math.random()*100 + 1);/*genera un numero aleatorio desde el 0 al 1
                                                    pero al multiplicar por 100 y sumado 1
                                                    queda desde el 1 al 100 inclusive*/

        do {
            System.out.println("Ingrese un numero del 1 al 100: ");
            numero = entrada.nextInt();

            if (random > numero) {
                System.out.println("Ingrese un numero mayor ");
            } if (random < numero) {
                System.out.println("Ingrese un numero menor ");
            }
            intentos++;

        }while (numero != random) ;
        System.out.println("******** Adivinaste el numero que era: "+numero+ " en: "+intentos+" intentos ********");
    }
}