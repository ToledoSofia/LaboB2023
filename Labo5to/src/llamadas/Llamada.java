package llamadas;

import personas.Empleado;
import java.time.LocalDate;
public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private LocalDate fecha;
    private int minutosDuracion;

    public Llamada() {
        origen = new Empleado();
        destino = new Empleado();
        fecha = LocalDate.now();
        minutosDuracion = 10;
    }

    public Llamada(Empleado origen, Empleado destino, int minutosDuracion) {
        this.origen = origen;
        this.destino = destino;
        fecha = LocalDate.now();
        this.minutosDuracion = minutosDuracion;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getMinutosDuracion() {
        return minutosDuracion;
    }

    public void setMinutosDuracion(int minutosDuracion) {
        this.minutosDuracion = minutosDuracion;
    }

    @Override
    public String toString() {
        return "Llamada:\n" +
                "ORIGEN:" + origen.toString() +
                ", \nDESTINO:" + destino.toString() +
                ", \nFecha:" + fecha.toString() +
                ", MinutosDuracion:" + minutosDuracion + "\n";
    }
}
