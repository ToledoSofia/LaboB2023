package restaurante;

public class Plato1 {
    private String nombre;
    private String descripcion;
    private double precio;
    private Tipo tipo;
    private Chef chefACargo;

    public Plato1() {
        chefACargo = new Chef();
    }

    public Plato1(String nombre, Chef chefACargo) {
        this.nombre = nombre;
        this.chefACargo = chefACargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Chef getChefACargo() {
        return chefACargo;
    }

    public void setChefACargo(Chef chefACargo) {
        this.chefACargo = chefACargo;
    }

    @Override
    public String toString() {
        return "Plato1{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }
}
