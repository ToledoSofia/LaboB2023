package bebidas;

public class Alcoholica extends Bebida {
    private int cantidadAlcohol;
    private static int positividad = 0;
    private int negatividad = cantidadAlcohol*20;

    public Alcoholica() {
        super();
        cantidadAlcohol = 10;
        negatividad = cantidadAlcohol*20;
    }

    public Alcoholica(String nombre) {
        super(nombre);
        cantidadAlcohol = 10;
        negatividad = cantidadAlcohol*20;
    }

    public Alcoholica(String nombre, int cantidadAlcohol) {
        super(nombre);
        this.cantidadAlcohol = cantidadAlcohol;
    }

    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(int cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }

    public static int getPositividad() {
        return positividad;
    }

    public static void setPositividad(int positividad) {
        Alcoholica.positividad = positividad;
    }

    public int getNegatividad() {
        return negatividad;
    }

    public void setNegatividad(int negatividad) {
        this.negatividad = negatividad;
    }
}
