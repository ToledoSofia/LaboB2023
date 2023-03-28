public class Libro {
    private String titulo;
    private Persona autor;
    private String ISBN;
    private int cantidadPaginas;
    private String editorial;
    private Fecha fecha;
    public Libro(){
        titulo = "";
        autor = new Persona();
        ISBN = "";
        cantidadPaginas = 0;
        editorial = "";
        fecha =  new Fecha();
    }
    public Libro (String titulo, Persona autor, String ISBN, int cantidadPaginas, String editorial, Fecha fecha){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN = ISBN;
        this.cantidadPaginas= cantidadPaginas;
        this.editorial=editorial;
        this.fecha = fecha;
    }
    public Libro(String titulo, Persona autor, Fecha fecha){
        this.titulo = titulo;
        this.autor = autor;
        ISBN = "";
        cantidadPaginas = 0;
        editorial = "";
        this.fecha =  fecha;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("AUTOR:\nNombre: " + autor.getNombre() + "\nEdad: " + autor.getEdad() + "\nDireccion: " + autor.getDireccion() + "\n------------");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Editorial: " + editorial + "\nCantidad de paginas: " + cantidadPaginas);
        System.out.print("Fecha: ");
        fecha.corta();
    }
    public void libroAnterior(Fecha fecha2){
        Fecha fecha1 = this.fecha;
        fecha1.menorQue(fecha2);
    }
}
