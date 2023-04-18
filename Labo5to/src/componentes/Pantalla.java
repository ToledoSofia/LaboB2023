package componentes;

import java.util.ArrayList;

public class Pantalla extends Periferico{
    private ArrayList<Puerto> puertosValidos;
    public Pantalla(){
        super(false);
        puertosValidos = new ArrayList<Puerto>();
    }

    public Pantalla( ArrayList<Puerto> puertosValidos) {
        super(false);
        this.puertosValidos = puertosValidos;
    }

    public ArrayList<Puerto> getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(ArrayList<Puerto> puertosValidos) {
        this.puertosValidos = puertosValidos;
    }
}
