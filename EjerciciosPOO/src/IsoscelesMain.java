import java.util.Scanner;

public class IsoscelesMain {
    public static double mayorArea(Triangulo_Isosceles[] triangulos){
        double area;

        area = triangulos[0].obtenerArea();//Aqui guardamos el area del primer triangulo
        for (int i=1;i< triangulos.length;i++){//Desde aca vamos recorriendo el arreglo buscando cual es
            if (triangulos[i].obtenerArea()>area){//el triangulo del mayor area
                area = triangulos[i].obtenerArea();

            }
        }
        return area;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double lado;
        int nTriangulos;

        System.out.println(" Digite la cantidad de triangulos: ");
        nTriangulos = entrada.nextInt();

        Triangulo_Isosceles[] triangulos = new Triangulo_Isosceles[nTriangulos];

        for (int i=0;i<triangulos.length;i++){
            System.out.println(" Digite los valores para el triangulo: "+(i+1)+" ");
            System.out.println(" Ingrese la base: ");
            base = entrada.nextDouble();
            System.out.println(" Ingrese el lado: ");
            lado = entrada.nextDouble();

            triangulos[i] = new Triangulo_Isosceles(base,lado);

            System.out.println(" El perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println(" El area del triangulo es: "+triangulos[i].obtenerArea());


        }

        System.out.println(" El area del triangulo de mayor superficie es: "+mayorArea(triangulos));

    }


}
