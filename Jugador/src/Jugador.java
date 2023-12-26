import java.util.Objects;

public class Jugador extends Persona{

    public Jugador(String nombre, int posicion) {
        super(nombre,posicion);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public boolean encontrarJugador(String nom_o_ap){
        return Objects.equals(this.getNombre(), nom_o_ap) || Objects.equals(this.getPosicion(), nom_o_ap);
    }

    public boolean jugadorCoincide(int posicion){
        return this.getPosicion() == posicion;
    }

    public void modificarJugador(String nombre, int posicion){
        this.setNombre(nombre);
        this.setPosicion(posicion);
    }
}
