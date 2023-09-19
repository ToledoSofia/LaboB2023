package objetos;

import java.time.LocalDateTime;
import java.util.Date;

public class Revista extends ObjetoLectura{
    private LocalDateTime fechaPublicacion;

    public Revista(String titulo) {
        super(titulo);
        fechaPublicacion = LocalDateTime.now();
    }

    public Revista(int codigo, String titulo, int anioPublicacion, LocalDateTime fechaPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public boolean prestar() {
        if(fechaPublicacion.getMonthValue() < LocalDateTime.now().getMonthValue()){
            System.out.println("La revista se dara prestada");
            return true;
        }else{
            System.out.println("La revista NO se prestará");
            return false;
        }
    }
    @Override
    public boolean agregarElemento() {
        if(fechaPublicacion.getMonthValue() < LocalDateTime.now().getMonthValue()-3){
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
                " - Fecha Publicacion: " + fechaPublicacion;
    }
}
