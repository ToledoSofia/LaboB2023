package componentes;

public class Componente {
    private String fabricante;
    private String modelo;
    private double precioVenta;
    private int stock;

    public Componente(){
        fabricante = "";
        modelo = "";
        precioVenta = 5000;
        stock = 10;
    }

    public Componente(double precioVenta, int stock) {
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
