package personas;

import java.util.Date;
import java.util.HashSet;

public class Autor extends Persona{
    private HashSet<String>libros;
    private int dni;
    private Date fechaNacimiento;

    public Autor(){
        super();
        libros = new HashSet<>();
        fechaNacimiento = new Date();
    }

    public Autor(String nombre) {
        super(nombre);
    }

    public Autor(String nombre, int dni) {
        super(nombre);
        this.dni = dni;
        libros = new HashSet<>();
        fechaNacimiento = new Date();
    }

    public HashSet<String> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<String> libros) {
        this.libros = libros;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public void mostrarDatos()  {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
    }
}
