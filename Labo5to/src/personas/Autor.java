package personas;

public class Autor extends Persona{
    public Autor(){
        super();
    }

    @Override
    public void mostrarDatos()  {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
    }
}
