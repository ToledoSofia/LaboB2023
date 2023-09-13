package bebidas;

public class Neutra extends Bebida {

    public Neutra(){
        super();
    }

    public Neutra(String nombre) {
        super(nombre);
    }

    public Neutra(String nombre, int negatividad, int positividad) {
        super(nombre, negatividad, positividad);
    }

    @Override
    public int calcularNegatividad() {
        return 0;
    }
}
