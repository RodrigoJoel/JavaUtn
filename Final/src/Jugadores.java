import java.util.ArrayList;

public class Jugadores implements Informes {

    private final ArrayList<Jugador> listaJugadores;

    public Jugadores(){
        listaJugadores = new ArrayList<>();
    }

    public void imprimir(){
        for(Jugador jugador : listaJugadores){
            System.out.println(jugador.toString());
        }
    }

    public ArrayList<Jugador> getListaJugadores(){
        return this.listaJugadores;
    }
}
