import java.util.Scanner;
public class Suma {
        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            String nombre = "";
            int num1 = 0, num2 = 0, result = 0;

            System.out.println("cual es tu nombre?");
            nombre = teclado.nextLine();

            System.out.println("ingresa el primer numero:");
            num1 = teclado.nextInt();

            System.out.println("ingresa el segundo numero:");
            num2 = teclado.nextInt();


            result = num1+num2;
            System.out.println("Hola " + nombre + " el resultado de la suma es; " + result);
        }
}
