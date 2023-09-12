package bibliotecaVirtual;

import personas.*;

import java.util.HashSet;

public class Biblioteca {
    private HashSet<LibroVirtual>libros;
    private HashSet<UsuarioBiblioteca>usuarios;

    public Biblioteca() {
        libros = new HashSet<>();
        usuarios = new HashSet<>();
    }

    public HashSet<LibroVirtual> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<LibroVirtual> libros) {
        this.libros = libros;
    }

    public HashSet<UsuarioBiblioteca> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<UsuarioBiblioteca> usuarios) {
        this.usuarios = usuarios;
    }
    public void agregarLibro(LibroVirtual libro){
        libros.add(libro);
    }
    public void eliminarLibro(LibroVirtual libro){
        libros.remove(libro);
    }
    public void modificarLibro(LibroVirtual modificar, LibroVirtual nuevo){
        libros.remove(modificar);
        libros.add(nuevo);
    }

    public void agregarUsuario(UsuarioBiblioteca usuario){
        usuarios.add(usuario);
    }
    public void prestamo(UsuarioBiblioteca usuario, LibroVirtual libro) throws LibroNoExisteException, LimiteDePrestamosAlcanzadoException, MembresiaException{
        if(!libros.contains(libro)){
            throw new LibroNoExisteException("El libro que quiere leer no existe en esta biblioteca");
        }
        if(libro.getCantidadActual() == LibroVirtual.getCantidadDescargas()){
            throw new LimiteDePrestamosAlcanzadoException("El libro ha alcanzado el limite de prestamos");
        }
        if(usuario.getLibrosPrestados().size() == usuario.getMembresia().getCantidadLibros()){
            throw new MembresiaException("ha alcanzado la cantidad maxima de su membresia");
        }
        if(!usuarios.contains(usuario)){
            agregarUsuario(usuario);
        }
        if(usuario.getLibrosPrestados().contains(libro)){
            System.out.println("Ya tenes el libro...");
        }else{
            usuario.getLibrosPrestados().add(libro);
            libro.setCantidadActual(libro.getCantidadActual()+1);
        }

    }
    public void devolucion(UsuarioBiblioteca usuario, LibroVirtual libro){
        if(usuario.getLibrosPrestados().contains(libro)){
            usuario.getLibrosPrestados().remove(libro);
            libro.setCantidadActual((libro.getCantidadActual()-1));
        }
    }
}
