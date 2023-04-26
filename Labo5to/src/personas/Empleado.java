package personas;
import llamadas.*;
import java.util.ArrayList;

public class Empleado extends Persona{
    private int dni;
    private int telefono;
    private String pais;
    public Empleado(){
        dni = 12345678;
        pais = "Argentina";
    }

    public Empleado(int telefono, String pais) {
        this.telefono = telefono;
        this.pais = pais;
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

    @Override
    public String toString() {
        return "Empleado --> " +
                "dni: " + dni +
                ", telefono: " + telefono +
                ", pais:'" + pais + '\'';
    }
}
