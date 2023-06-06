package lugares;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio() {
        super("bx",1111);
        poblacion = 500;
    }

    public Barrio(String nombre, int poblacion) {
        super(nombre);
        this.poblacion = poblacion;
    }

    public Barrio(String nombre, int codigo, int poblacion) {
        super(nombre, codigo);
        this.poblacion = poblacion;
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    public int calcularPoblacion(){
        return poblacion;
    }
}
