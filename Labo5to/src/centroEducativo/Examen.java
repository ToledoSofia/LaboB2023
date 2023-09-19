package centroEducativo;

import java.util.Date;

public abstract class Examen implements AprobarExamen {
    private Date fecha;

    public Examen() {
        fecha = new Date();
    }

    public Examen(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
