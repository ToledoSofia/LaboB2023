package empleados;

public class Tecnico extends Operario{
    public Tecnico (String nombre){
        super(nombre);
    }
    @Override
    public String toString() {
        return getClass().getSuperclass().getSuperclass().getCanonicalName() + " --> " + getClass().getSuperclass().getCanonicalName() + " --> "+ getClass().getCanonicalName();
    }

}
