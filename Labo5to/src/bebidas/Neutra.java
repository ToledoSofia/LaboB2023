package bebidas;

public class Neutra extends Bebida {
    private int positividad;
    private int negatividad;
    public Neutra(){
        super();
    }

    public Neutra(String nombre) {
        super(nombre);
    }

    public Neutra(String nombre, int positividad, int negatividad) {
        super(nombre);
        this.positividad = positividad;
        this.negatividad = negatividad;
    }

    public int getPositividad() {
        return positividad;
    }

    public void setPositividad(int positividad) {
        this.positividad = positividad;
    }

    public int getNegatividad() {
        return negatividad;
    }

    public void setNegatividad(int negatividad) {
        this.negatividad = negatividad;
    }
}
