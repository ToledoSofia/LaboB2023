import java.util.Scanner;

public class Jugador {
    private String nombre;
    private Fecha fechaNacimiento;
    private int numCamiseta;
    public Jugador(){
        nombre = "";
        fechaNacimiento = new Fecha();
        numCamiseta = 1;
    }

    public Jugador(String nombre, int numCamiseta) {
        this.nombre = nombre;
        this.numCamiseta = numCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


}
