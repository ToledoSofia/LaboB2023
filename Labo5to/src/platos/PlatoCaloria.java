package platos;

public class PlatoCaloria {
    private String nombre;
    private double calorias;

    public PlatoCaloria() {
        nombre = "plato1";
        calorias = 50;
    }

    public PlatoCaloria(double calorias) {
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
}
