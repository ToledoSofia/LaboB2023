public class Plato {
    private String nombre;
    private double precio;
    public Plato(){
        nombre = "";
        precio = 1000;
    }

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void modificarPlato(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        System.out.println("-----plato modificado-----");
    }

    @Override
    public String toString() {
        return "----------\nPlato:\n" +
                "nombre:" + nombre + '\n' +
                "precio: $" + precio + "\n";
    }
}
