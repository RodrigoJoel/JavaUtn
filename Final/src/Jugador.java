public class Jugador extends Personal{
    private int posicion;

    public Jugador(String nombre, int posicion){
        super.nombre = nombre;
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString(){
        return "El jugador llamado " + super.nombre + " juega en la posicion " + this.posicion;
    }
}
