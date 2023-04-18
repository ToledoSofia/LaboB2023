package componentes;

import java.util.ArrayList;

public class Mouse extends Periferico{
    private String tipoConector;
    private ArrayList<Puerto> puertosValidos;
    public Mouse(){
        super(true);
        tipoConector = "USB";
    }

    public Mouse(String tipoConector) {
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
