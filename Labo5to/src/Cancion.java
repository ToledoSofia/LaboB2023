import personas.Persona;

public class Cancion {
    private String titulo;
    private Persona autor;
    public Cancion(){
        titulo = "";
        autor = new Persona();
    }
    public Cancion(String titulo, Persona autor){
        this.titulo = titulo;
        this.autor = autor;
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
    public void mostrarDatos(){
        System.out.println("titulo: " + titulo);
        System.out.println("AUTOR:\nNombre: " + autor.getNombre() + "\nEdad: " + autor.getEdad() + "\nDireccion: " + autor.getDireccion());
    }
}