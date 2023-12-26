
//Al colocar la palabra reservada extends la clase estudiante hereda
//todos los atributos de la clase Persona
public class Estudiante extends Persona {

    private int codigoEstudiante;
    private float notaFinal;


    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }


    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("El Codigo del Estudiante es: "+codigoEstudiante);
        System.out.println("La nota final es: "+notaFinal);

    }
}
