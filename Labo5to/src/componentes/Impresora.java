package componentes;

import java.util.ArrayList;

public class Impresora extends Periferico {
    private ArrayList<Puerto>puertosValidos;
    private boolean metodoImpresion; //0.laser 1.tinta;
    public Impresora(){
        super(false);
        puertosValidos = new ArrayList<Puerto>();
        metodoImpresion = true;
    }

    public ArrayList<Puerto> getPuertosValidos() {
        return puertosValidos;
    }

    public void setPuertosValidos(ArrayList<Puerto> puertosValidos) {
        this.puertosValidos = puertosValidos;
    }

    public boolean isMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(boolean metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
