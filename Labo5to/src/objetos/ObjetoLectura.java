package objetos;

public abstract class ObjetoLectura extends Objeto{

    private int codigo;
    private String titulo;
    private int anioPublicacion;

    public ObjetoLectura() {
        super();
    }

    public ObjetoLectura(String titulo) {
        this.titulo = titulo;
    }

    public ObjetoLectura(int codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

}
