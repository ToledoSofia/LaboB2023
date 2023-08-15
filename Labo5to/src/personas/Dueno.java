package personas;

public class Dueno extends Persona{
    public Dueno() {
        super();
    }

    public Dueno(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarDatos()  {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
    }
}
