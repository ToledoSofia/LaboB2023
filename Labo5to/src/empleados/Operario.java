package empleados;

public class Operario extends Empleado{
    public Operario(String nombre){
        super(nombre);
    }
    @Override
    public String toString() {
        return super.toString() + " --> " + getClass().getCanonicalName();
    }

}
