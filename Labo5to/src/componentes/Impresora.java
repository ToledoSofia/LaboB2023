package componentes;

import java.util.ArrayList;

public class Impresora extends Periferico {
    private boolean metodoImpresion; //0.laser 1.tinta;
    public Impresora(){
        super(false);
        metodoImpresion = true;
    }

    public boolean isMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(boolean metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
