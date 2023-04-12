package personas;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        apellido = "";
        this.direccion = "";
    }
    public Persona (String n, int e, String d){
        this.nombre  = n;
        this.edad = e;
        this.direccion = d;
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona (String n, int e, String d, String apellido){
        this.nombre  = n;
        this.edad = e;
        this.apellido = apellido;
        this.direccion = d;
    }
    public Persona(String nombre){
        this.nombre = nombre;
        edad = 1;
        direccion = "";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
