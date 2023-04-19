package componentes;

import java.util.ArrayList;

public class Periferico extends Componente{
    private boolean entradaSalida;//0.salida 1.entrada
    private ArrayList<Puerto> puertosValidos;

    public Periferico(){
        super();
        entradaSalida = true;
        puertosValidos = new ArrayList<Puerto>();
    }

    public Periferico(boolean entradaSalida) {
        super();
        this.entradaSalida = entradaSalida;
        puertosValidos = new ArrayList<Puerto>();
    }

    public ArrayList<Puerto> getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(ArrayList<Puerto> puertosValidos) {
        this.puertosValidos = puertosValidos;
    }

    public boolean isEntradaSalida() {
        return entradaSalida;
    }

    public void setEntradaSalida(boolean entradaSalida) {
        this.entradaSalida = entradaSalida;
    }
}
