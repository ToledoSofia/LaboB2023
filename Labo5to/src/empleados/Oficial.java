package empleados;

public class Oficial extends Operario{
    public Oficial(String nombre){
        super(nombre);
    }
    @Override
    public String toString() {
        return getClass().getSuperclass().getSuperclass().getCanonicalName() + " --> " + getClass().getSuperclass().getCanonicalName() + " --> "+ getClass().getCanonicalName();
    }

}
