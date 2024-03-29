package personas;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private int dni;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        apellido = "";
        this.direccion = "";
    }
    public Persona (String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
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
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public abstract void mostrarDatos();
 /*   {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion);
    }*/

  /*  @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }*/
}
