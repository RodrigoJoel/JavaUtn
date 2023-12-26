//Herencia

public class Persona {

    //Atributos
    private final String nombre;// si modificamos el private a protected
    private final String apellido;//estos atributos pueden ser utilizados por las
    private int edad;//clases padres y sus hijas


    //Metodo Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
