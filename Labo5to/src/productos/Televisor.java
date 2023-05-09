package productos;

import enums.*;
public class Televisor extends Multimedia{
    private Tecnologia tecnologia;
    private int resolucion;
    public Televisor(){
        super();
        tecnologia = Tecnologia.CUATROK;
        resolucion = 0;
    }
    
    public Televisor(Tecnologia tecnologia, int resolucion) {
        super();
        this.tecnologia = tecnologia;
        this.resolucion = resolucion;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
}
