public class Persona {
    private String nombre;
    private int posicion;


    public Persona(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Nombre: " +nombre + " "+"\n" +
                "Posicion: " + posicion;
    }
}
