package mascotas;
import personas.Dueno;
public abstract class Mascota {
    private String nombre;
    private Dueno duenio;
    public Mascota (){
        duenio = new Dueno();
    }

    public Mascota(String nombre, Dueno duenio) {
        this.nombre = nombre;
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueno getDuenio() {
        return duenio;
    }

    public void setDuenio(Dueno duenio) {
        this.duenio = duenio;
    }

    public abstract void saludar(String nombreDuenio);
    public abstract void alimentar();
    public abstract void mostrarTipo();

}
