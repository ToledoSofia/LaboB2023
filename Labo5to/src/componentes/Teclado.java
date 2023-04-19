package componentes;

import java.util.ArrayList;

public class Teclado extends Periferico{
    private String tipoConector;
    public Teclado(){
        super(true);
        tipoConector = "USB";
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
}
