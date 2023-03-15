public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.direccion = "";
    }
    public Persona (String n, int e, String d){
        this.nombre  = n;
        this.edad = e;
        this.direccion = d;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion);
    }
}
