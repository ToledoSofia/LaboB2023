package bibliotecaVirtual;

import personas.Autor;

public class LibroVirtual {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private String nombrePDF;
    private static int cantidadDescargas = 5;
    private int cantidadActual;

    public LibroVirtual() {
        cantidadActual = cantidadDescargas;
    }

    public LibroVirtual(String titulo, Autor autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        cantidadActual = cantidadDescargas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombrePDF() {
        return nombrePDF;
    }

    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }

    public static int getCantidadDescargas() {
        return cantidadDescargas;
    }

    public static void setCantidadDescargas(int cantidadDescargas) {
        LibroVirtual.cantidadDescargas = cantidadDescargas;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
