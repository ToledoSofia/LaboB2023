package personas;
import tiempo1.*;
import java.util.Scanner;

public class Jugador extends Persona {
    private Fecha fechaNacimiento;
    private int numCamiseta;
    public Jugador(){
        super();
        fechaNacimiento = new Fecha();
        numCamiseta = 1;
    }

    public Jugador(String nombre, int edad, String direccion, int numCamiseta) {
        super(nombre, edad, direccion);
        //this.nombre = nombre;
        this.numCamiseta = numCamiseta;
    }
    public Jugador(String nombre, int numCamiseta){
        super();
        this.numCamiseta = numCamiseta;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

   @Override
    public void mostrarDatos()  {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
    }
}
