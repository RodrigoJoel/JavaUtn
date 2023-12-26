//Ejercicio 9:

public abstract class Poligono {
     protected int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }


    //El toString es equivalente al mostrarDatos que venia
    //utilizando
    @Override
    public String toString() {
        return "El numero de Lados: "+numeroLados;
    }
    public abstract double area();

}
