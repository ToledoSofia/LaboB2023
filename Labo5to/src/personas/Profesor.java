package personas;

public class Profesor extends Persona{
    private double porcentajeDescuento;

    public Profesor(){
        super();
        porcentajeDescuento = 10.0;
    }

    public Profesor(String nombre, double porcentajeDescuento) {
        super(nombre);
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public Profesor(double porcentajeDescuento){
        super();
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    @Override
    public void mostrarDatos()  {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
    }
}
