package personas;
import pagos.Tarjeta;
public class Cliente extends Persona{
    private int celular;
    private Tarjeta tarjeta;
    public Cliente(){
        super();
        celular = 12345678;
        tarjeta = new Tarjeta();
    }

    public Cliente(Tarjeta tarjeta) {
        super();
        this.tarjeta = tarjeta;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    @Override
    public void mostrarDatos()  {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
    }
}
/*nombre, apellido y un celular del cliente así como también el método de pago.*/