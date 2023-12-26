import java.util.Scanner;

public class CuadrilateroMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cuadrilatero c1;
        float lado1;
        float lado2;

        System.out.println("Ingrese el lado1: ");
        lado1 = entrada.nextFloat();
        System.out.println("Ingrese el lado2: ");
        lado2 = entrada.nextFloat();

        if (lado1 == lado2){ //Es un cuadrado
            c1 = new Cuadrilatero(lado1);
        }
        else {
            c1 = new Cuadrilatero(lado1,lado2);
        }

        System.out.println(" El perimetro es: "+c1.getPerimetro());
        System.out.println(" El area es: "+c1.getArea());
    }
}
