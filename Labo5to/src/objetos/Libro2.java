package objetos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Libro2 extends  ObjetoLectura{
    private ArrayList<Integer>paginasPorCap;


    public Libro2(int codigo, String titulo, int anioPublicacion, ArrayList<Integer> paginasPorCap) {
        super(codigo, titulo, anioPublicacion);
        this.paginasPorCap = paginasPorCap;
    }

    public Libro2(String titulo, ArrayList<Integer> paginasPorCap) {
        super(titulo);
        this.paginasPorCap = paginasPorCap;
    }

    public Libro2(int codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        paginasPorCap = new ArrayList<>();
        llenarCantidad();
    }

    public ArrayList<Integer> getPaginasPorCap() {
        return paginasPorCap;
    }

    public void setPaginasPorCap(ArrayList<Integer> paginasPorCap) {
        this.paginasPorCap = paginasPorCap;
    }
    public void llenarCantidad(){
        for(int i = 0 ; i<=1; i++){
            paginasPorCap.add(0);
        }
    }

    @Override
    public boolean prestar() {
        if((paginasPorCap.size()-1)%2 != 0){
            System.out.println("El libro se dara prestado");
            return true;
        }else{
            System.out.println("El libro NO se prestará");
            return false;
        }
    }


    @Override
    public boolean agregarElemento() {
        if((paginasPorCap.size()-1) %2 != 0){
            System.out.println("El articulo ingresado puede ingresar al circuito de prestamos");
            return true;
        }else{
            System.out.println("El articulo ingresado NO puede ingresar al circuito de prestamos");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + " - Codigo: " + getCodigo() + " - Año publicacion: " + getAnioPublicacion() +
                " - Cantidad de capitulos: " + (paginasPorCap.size()-1) ;

    }
}
