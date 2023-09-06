package bibliotecaVirtual;

import personas.Autor;
import personas.UsuarioBiblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Autor a1 = new Autor("a1");
        Autor a2 = new Autor("a2");
        Autor a3 = new Autor("a3");
        UsuarioBiblioteca u1 = new UsuarioBiblioteca("usuario1", Membresia.ORO);
        UsuarioBiblioteca u2 = new UsuarioBiblioteca("usuario2", Membresia.BRONCE);
        UsuarioBiblioteca u3 = new UsuarioBiblioteca("usuario3", Membresia.BRONCE);
        UsuarioBiblioteca u4 = new UsuarioBiblioteca("usuario4", Membresia.BRONCE);
        UsuarioBiblioteca u5 = new UsuarioBiblioteca("usuario5", Membresia.PLATA);
        UsuarioBiblioteca u6 = new UsuarioBiblioteca("usuario6", Membresia.PLATA);
        LibroVirtual l1 = new LibroVirtual("libro1", a1, Genero.AVENTURA);
        LibroVirtual l2 = new LibroVirtual("libro2", a2, Genero.AVENTURA);
        LibroVirtual l3 = new LibroVirtual("libro3", a3, Genero.AVENTURA);
        LibroVirtual l4 = new LibroVirtual("libro4", a1, Genero.AVENTURA);
        LibroVirtual l5 = new LibroVirtual("libro5", a1, Genero.AVENTURA);
        LibroVirtual l6 = new LibroVirtual("libro5", a3, Genero.AVENTURA);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);
        biblioteca.agregarLibro(l4);
        biblioteca.agregarLibro(l5);

        biblioteca.agregarUsuario(u1);
        biblioteca.agregarUsuario(u2);
        biblioteca.agregarUsuario(u3);
        biblioteca.agregarUsuario(u4);
        try{
            biblioteca.prestamo(u1,l1);
            biblioteca.prestamo(u2,l1);
            biblioteca.prestamo(u3,l1);
            biblioteca.prestamo(u4,l1);
            biblioteca.prestamo(u5,l1);//se agrega a usuarios

            System.out.println("USUARIOS");
            for(UsuarioBiblioteca u : biblioteca.getUsuarios()){
                System.out.println(u.getNombre());
            }

            biblioteca.prestamo(u6,l1);// limiteAlcanzado exception
            biblioteca.prestamo(u6,l6);//libroNoExisteException

            biblioteca.agregarLibro(l6);

            biblioteca.prestamo(u2,l2);
            biblioteca.prestamo(u2,l3);
            biblioteca.prestamo(u2,l4);
            biblioteca.prestamo(u2,l5);
            biblioteca.prestamo(u2,l6);//limiteMembresia

            System.out.println("librosPresatdos u2: " + u2.getLibrosPrestados().size());
            biblioteca.devolucion(u2,l2);
            biblioteca.devolucion(u2,l3);
            biblioteca.devolucion(u2,l1);
            System.out.println("librosPresatdos u2: " + u2.getLibrosPrestados().size());


        }catch(LibroNoExisteException e){
            System.err.println(e);
        }catch (LimiteDePrestamosAlcanzadoException e){
            System.err.println(e);
        }catch (MembresiaException e){
            System.err.println(e);
        }
    }
}
