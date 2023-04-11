package vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int cantidadRuedas;
    private int anioFabricacion;

    public Vehiculo (){
        marca = "";
        modelo = "";
        color = "";
        cantidadRuedas = 4;
        anioFabricacion = 2000;
    }
    public Vehiculo(String marca, String modelo, String color){
        this.marca =  marca;
        this.modelo = modelo;
        this.color = color;
        cantidadRuedas = 4;
        anioFabricacion  = 2000;
    }
    public Vehiculo(String marca, String modelo, String color, int cantidadRuedas, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidadRuedas = cantidadRuedas;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
}
