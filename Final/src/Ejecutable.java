import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejecutable {
    public static void main(String[] args) {

        Jugadores listaJugadores = new Jugadores();
        int opcion = 0;
        int JugadorOut = 0;
        Jugadores JugadoresEliminados = new Jugadores();
        Scanner myScan = new Scanner(System.in);
        do {
            try {
                System.out.println("/-------------------------------------------------\\");
                System.out.println("|                     JUGADOR                     |");
                System.out.println("""
                        | 1) Nuevo Jugador                                |
                        | 2) Listar todos los Jugadores                   |
                        | 3) Buscar Jugador por nombre                    |
                        | 4) Listar los Jugadores eliminados              |
                        | 5) Eliminar Jugador por nombre                  |
                        | 6) Editar la posicion de un jugador             |
                        | 7) imprimir en un archivo                       |
                        | 99) salir                                       |""");
                System.out.println("\\-------------------------------------------------/");
                System.out.print("Ingrese su opcion: ");

                opcion = myScan.nextInt();
                myScan.nextLine();
                //System.out.print("Ingrese su opcion: ");
            }catch (InputMismatchException e){
                System.out.println("Ingrese una nueva opcion");
            }

            switch (opcion) {
                case 1:
                    System.out.println("1) Nuevo Jugador");
                    System.out.println("");
                    System.out.print("Ingrese el nombre del nuevo jugador: ");
                    String nombre = myScan.nextLine();
                    System.out.print("Ingrese la posicion del nuevo jugador: ");
                    int posicion = 0;

                    try {
                        posicion = myScan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR EN EL INGRESO DE DATOS");
                        e.printStackTrace();
                    }

                    listaJugadores.getListaJugadores().add(new Jugador(nombre, posicion));
                    break;
                case 2:
                    System.out.println("2) Listar todos los jugadores: ");
                    if (listaJugadores.getListaJugadores().isEmpty()) {
                        System.out.println("La lista esta vacia");
                    } else {
                        listaJugadores.imprimir();
                    }
                    break;
                case 3:
                    System.out.println("3) Buscar Jugador por nombre");
                    System.out.print("Ingrese el nombre del jugador a buscar: ");
                    nombre = myScan.nextLine();


                    int contListaJugadores = 0;

                    for (Jugador jugador : listaJugadores.getListaJugadores()) {
                        if (jugador.getNombre().equals(nombre)) {
                            contListaJugadores++;

                            System.out.println(jugador);
                            System.out.println("Existen " + contListaJugadores + " jugadores con ese nombre");
                        }
                    }

                    if (contListaJugadores == 0){
                        System.out.println("NO EXISTEN JUGADORES CON EL NOMBRE " + nombre);
                    }
                    else{

                        System.out.println("Existen " + contListaJugadores + " jugadores con ese nombre");
                    }
                    break;

                case 4:
                    System.out.println("4) Cantidad de Jugadores eliminados");
                    contListaJugadores = 0;;
                    System.out.println("Jugadores out: "+JugadorOut);
                    break;

                case 5:
                    boolean borroJugador = false;
                    System.out.println("5) Eliminar jugador por nombre: ");
                    System.out.println("Ingrese el nombre del jugador: ");
                    nombre = myScan.nextLine();

                    for (Jugador jugador : listaJugadores.getListaJugadores()) {
                        if (jugador.getNombre().equals(nombre)) {
                            listaJugadores.getListaJugadores().remove(jugador);
                            borroJugador = true;
                            JugadorOut++;
                            System.out.println("Jugador eliminado: "+jugador);
                            break;
                        }
                    }
                    if (!borroJugador){
                    System.out.println("NO EXISTEN JUGADORES CON EL NOMBRE " + nombre);
                    }
                    break;

                case 6:
                    System.out.println("6) Editar la posicion de un jugador: ");
                    System.out.println("Ingrese el nombre del jugador: ");

                    nombre = myScan.nextLine();

                    for (Jugador jugador : listaJugadores.getListaJugadores()) {
                        if (jugador.getNombre().equals(nombre)) {
                            System.out.print("Ingrese la nueva posicion del jugador: ");
                            jugador.setPosicion(myScan.nextInt());
                            myScan.nextLine();
                            break;
                        }
                    }

                    System.out.println("NO EXISTEN JUGADORES CON NOMBRE " + nombre);

                    break;

                case 7:
                    System.out.println("7) Imprimir en un archivo: ");
                    System.out.println("myFile.txt");

                    try{
                        File archivo = new File("myFile.txt");
                        FileWriter Writer = new FileWriter(archivo);
                        String texto = "";
                        char caracter;

                        for (Jugador jugador : listaJugadores.getListaJugadores()){
                            texto = jugador.toString();

                            for (int i = 0; i< texto.length(); i++){
                                caracter = texto.charAt(i);
                                Writer.write(caracter);
                            }
                        }


                    } catch (IOException e){
                        e.printStackTrace();
                    }
                    break;

                case 99:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("OPCION INCORRECTA");
                    break;
            }
            System.out.println("\n");
        }while(opcion != 99);
    }
}