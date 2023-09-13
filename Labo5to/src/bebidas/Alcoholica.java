package bebidas;

public class Alcoholica extends Bebida {
    private int cantidadAlcohol;
   /* private static int positividad = 0;
    private int negatividad = calcularNegatividad();*/

    public Alcoholica() {
        super();
        cantidadAlcohol = 10;
    }

    public Alcoholica(String nombre, int cantidadAlcohol) {
        super(nombre, 0);
        this.cantidadAlcohol = cantidadAlcohol;
        super.setNegatividad(calcularNegatividad());
    }


    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(int cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }

    @Override
    public int calcularNegatividad() {
        return cantidadAlcohol*20;
    }
}
