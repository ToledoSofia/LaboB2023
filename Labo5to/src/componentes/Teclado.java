package componentes;

import java.util.ArrayList;

public class Teclado extends Periferico{
    private String tipoConector;
    private ArrayList<Puerto> puertosValidos;
    public Teclado(){
        super(true);
        tipoConector = "USB";
        puertosValidos = new ArrayList<Puerto>();
    }

    public Teclado(String tipoConector) {
        super(true);
        this.tipoConector = tipoConector;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public ArrayList<Puerto> getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(ArrayList<Puerto> puertosValidos) {
        this.puertosValidos = puertosValidos;
    }
}
