package personas;
import llamadas.*;
import java.util.ArrayList;

public class Empleado extends Persona{
    private int dni;
    private int telefono;
    private String pais;
    private ArrayList<Llamada>llamadas;
    public Empleado(){
        dni = 12345678;
        pais = "Argentina";
        llamadas = new ArrayList<Llamada>();
    }

    public Empleado(int telefono, String pais) {
        this.telefono = telefono;
        this.pais = pais;
        llamadas = new ArrayList<Llamada>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }
}
