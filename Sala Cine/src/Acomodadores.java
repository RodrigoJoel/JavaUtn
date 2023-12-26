public class Acomodadores extends Empleados implements ParaAcomodadores{

    private Salas sala;

    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    public Salas getSala() {
        return this.sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    public String getTipo() {
        return "Acomodador";
    }

}
