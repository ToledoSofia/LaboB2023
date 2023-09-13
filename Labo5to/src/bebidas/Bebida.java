package bebidas;

public abstract class Bebida {
    private String nombre;
    private int negatividad;
    private int positividad;

    public Bebida() {
    }

    public Bebida(String nombre){
        this.nombre = nombre;
    }

    public Bebida(String nombre, int negatividad, int positividad) {
        this.nombre = nombre;
        this.negatividad = negatividad;
        this.positividad = positividad;
    }

    public Bebida(String nombre, int positividad) {
        this.nombre = nombre;
        this.positividad = positividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNegatividad() {
        return negatividad;
    }

    public void setNegatividad(int negatividad) {
        this.negatividad = negatividad;
    }

    public int getPositividad() {
        return positividad;
    }

    public void setPositividad(int positividad) {
        this.positividad = positividad;
    }

    public abstract int calcularNegatividad();

}
