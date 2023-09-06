package personas;

import bibliotecaVirtual.LibroVirtual;
import bibliotecaVirtual.Membresia;

import java.util.Date;
import java.util.HashSet;

public class UsuarioBiblioteca extends Persona{
    private Date fechaNacimiento;
    private int dni;
    private String mail;
    private HashSet<LibroVirtual>librosPrestados;
    private Membresia membresia;

    public UsuarioBiblioteca() {
        super();
        membresia = Membresia.BRONCE;
    }

    public UsuarioBiblioteca(String nombre, Membresia membresia) {
        super(nombre);
        this.membresia = membresia;
        librosPrestados = new HashSet<>();
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<LibroVirtual> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<LibroVirtual> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    @Override
    public void mostrarDatos() {

    }
}
