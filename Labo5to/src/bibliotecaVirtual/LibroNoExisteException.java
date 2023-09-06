package bibliotecaVirtual;

public class LibroNoExisteException extends Exception{
    public LibroNoExisteException(String mensaje){
        super(mensaje);
    }
}
