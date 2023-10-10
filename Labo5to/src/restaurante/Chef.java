package restaurante;

import personas.Persona;

public class Chef extends Persona {
    private boolean exp;

    public Chef(){
        super();
        exp = false;
    }
    public Chef(String nombre, String apellido, int edad, boolean exp) {
        super(nombre, apellido, edad);
        this.exp = exp;
    }

    public boolean isExp() {
        return exp;
    }

    public void setExp(boolean exp) {
        this.exp = exp;
    }

    @Override
    public void mostrarDatos() {

    }

    @Override
    public String toString() {
        return "Chef{" +
                "exp=" + exp +
                '}';
    }
}
