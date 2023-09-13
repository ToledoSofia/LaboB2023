package bebidas;

public class Azucarada extends Bebida {
    private int cantidadAzucar;
    public Azucarada(){
        super();
        cantidadAzucar  = 5;
    }

    public Azucarada(String nombre, int cantidadAzucar) {
        super(nombre, 1);
        this.cantidadAzucar = cantidadAzucar;
        super.setNegatividad(calcularNegatividad());
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }


    @Override
    public int calcularNegatividad(){
        return cantidadAzucar*10;
    }
}
