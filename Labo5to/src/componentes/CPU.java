package componentes;

public class CPU extends Componente{
    private String nombre;
    public CPU(){
        super();
        nombre = "";
    }

    public CPU(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
