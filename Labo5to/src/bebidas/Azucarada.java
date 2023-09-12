package bebidas;

public class Azucarada extends Bebida {
    private int cantidadAzucar;
    private static int postividad = 1;

    private int negatividad = calcularNegatividad();
    public Azucarada(){
        super();
        cantidadAzucar  = 5;
    }
    public Azucarada(String nombre, int cantidadAzucar){
        super(nombre);
        this.cantidadAzucar = cantidadAzucar;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public static int getPostividad() {
        return postividad;
    }

    public static void setPostividad(int postividad) {
        Azucarada.postividad = postividad;
    }

    public int getNegatividad() {
        return negatividad;
    }

    public void setNegatividad(int negatividad) {
        this.negatividad = negatividad;
    }

    public int calcularNegatividad(){
        return cantidadAzucar*10;
    }
}
