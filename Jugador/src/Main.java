import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        Archivo archivo = new Archivo();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        ArrayList<Jugador> jugadorsCoinsidentes = new ArrayList<>();

        String nombre;
        int posicion;
        int opcion = 0;
        boolean salir = false;

        do {
            boolean salirOpcion = false;
            do {
                System.out.println(" ---- Menu -----");
                System.out.println("1- Nuevo jugador.");
                System.out.println("2- Listar todos los jugadores.");
                System.out.println("3- Buscar jugador por nombre");
                System.out.println("4- Buscar jugador por (Posicion).");
                System.out.println("5- Eliminar contacto por DNI(Nombre)");
                System.out.println("6- imprimir en un archivo.");
                System.out.println("7- Editar la posicion de un jugador.");
                System.out.println("99- salir.");
                System.out.print("Ingrese una opcion: ");
                //               opcion = leer.nextInt();

                try {
                    opcion = sc.nextInt();
                    salirOpcion = true;

                } catch (InputMismatchException ex){
                    System.out.println("Debe de ingresar un numero como opcion!");
                }
                sc.nextLine();
            } while (!salirOpcion);


            switch (opcion){
                case 1:
                    do {
                        salirOpcion = false;
                        try {
                            System.out.println(" -- Nuevo jugador -- ");
                            System.out.println("Nombre: ");
                            nombre = sc.nextLine();
                            System.out.println("Posicion:");
                            posicion = sc.nextInt();
                            salirOpcion = true;
                            jugadores.add(new Jugador(nombre,posicion));
                        } catch (InputMismatchException ex){
                            System.out.println("ERROR EN EL INGRESO DE DATOS!");
                        }
                        sc.nextLine();
                    } while (!salirOpcion);

                    break;
                case 2:
                    System.out.println(" --- Lista de Jugadores ---");
                    for (Jugador c: jugadores) {
                        System.out.println(c.toString());
                    }
                    System.out.println("Existen "+jugadores.size() + " jugadores.");

                    break;
                case 3:
                    System.out.println(" --- Buscar jugador por nombre ---");
                    System.out.println("Ingrese nombre: ");
                    nombre = sc.nextLine();

                    jugadorsCoinsidentes.clear();
                    for (Jugador c: jugadores) {
                        if (c.encontrarJugador(nombre)){
                            jugadorsCoinsidentes.add(c);
                        }
                    }

                    if (jugadorsCoinsidentes.size() > 0){
                        for (Jugador c:jugadorsCoinsidentes) {
                            System.out.println(c.toString());
                        }
                    } else {
                        System.out.println("NO EXISTEN JUGADORES QUE COINCIDAN CON EL CRITERIO!");
                    }

                    break;
                case 4:
                    System.out.println("--- Buscar jugador por Posicion ---");
                    do {
                        salirOpcion = false;

                        try {
                            System.out.println("Ingrese la posicion: ");
                            posicion = sc.nextInt();

                            jugadorsCoinsidentes.clear();
                            for (Jugador c: jugadores) {
                                if (c.jugadorCoincide(posicion)){
                                    jugadorsCoinsidentes.add(c);
                                }
                            }

                            if (jugadorsCoinsidentes.size() > 0){
                                System.out.println(jugadorsCoinsidentes.toString());
                            } else {
                                System.out.println("NO EXISTE JUGADOR EN LA POSICION: = "+posicion);
                            }
                            salirOpcion = true;
                        } catch (InputMismatchException e){
                            System.out.println("Debe de ingresar un numero como posicion");
                        }
                        sc.nextLine();
                    } while (!salirOpcion);

                    break;
                case 5:
                    System.out.println(" --- Eliminar jugador por posicion ---");

                    do {
                        salirOpcion = false;

                        try {
                            boolean borroJugador = false;
                            System.out.println("*** Una vez ingresada la posicion no se podra deshacer ***");
                            System.out.println("-------------------------");
                            System.out.println("Ingrese la posicion: ");
                            posicion = sc.nextInt();

                            jugadorsCoinsidentes.clear();
                            for (Jugador c: jugadores) {
                                if (c.jugadorCoincide(posicion)){
                                    jugadorsCoinsidentes.add(c);
                                    borroJugador = true;
                                    System.out.println("Jugador eliminado");
                                }
                            }

                            if (!borroJugador){
                                System.out.println("NO EXISTE JUGADOR EN LA POSICION "+ posicion);
                            } else {
                                for (Jugador cc: jugadorsCoinsidentes) {
                                    jugadores.remove(cc);
                                }
                            }

                            salirOpcion = true;
                        }catch (InputMismatchException e){
                            System.out.println("Debe de ingresar un numero para la posicion");
                        }
                        sc.nextLine();
                    } while (!salirOpcion);

                    break;
                case 6:
                    System.out.println(" --- Imrpimir en un archivo .txt");
                    archivo.imprimir(jugadores.toString());

                    break;
                case 7:
                    System.out.println(" --- Editar jugador ---");

                    do {
                        salirOpcion = false;

                        try {
                            System.out.println("Ingrese la posicion para buscar el jugador: ");
                            posicion = sc.nextInt();
                            sc.nextLine();

                            boolean existeJugador = false;
                            for (Jugador c: jugadores) {
                                if (c.jugadorCoincide(posicion)){
                                    System.out.println(" --- Modificando posicion  ---");
                                    System.out.println("Nombre: ");
                                    nombre = sc.nextLine();
                                    c.modificarJugador(nombre,posicion);
                                    existeJugador = true;
                                }
                            }

                            if (!existeJugador) {
                                System.out.println("NO EXISTE EL JUGADOR EN LA POSICION: "+ posicion);
                            }

                            salirOpcion = true;
                        }catch (InputMismatchException e){
                            System.out.println("DEBE DE INGRESAR NUMEROS PARA LA POSICION");
                        }
                        sc.nextLine();
                    } while (!salirOpcion);

                    break;
                case 99:
                    salir = true;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA!");
            }

        } while (!salir);

    }

}
