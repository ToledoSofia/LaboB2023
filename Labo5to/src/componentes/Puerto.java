package componentes;

public class Puerto {
    private String nombre;
    private int cantidad;
    public Puerto(){
        nombre = "";
        cantidad = 1;
    }

    public Puerto(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
