import tiempo.Fecha;
import personas.*;
import java.time.*;
public class Pedido {
    private LocalDate fechaCreacion;
    private Plato plato;
    private Persona persona;
    private LocalTime horaEntrega;
    private boolean entregado;
    public Pedido(){
        fechaCreacion = LocalDate.now();
        plato = new Plato();
        persona = new Persona();
        horaEntrega = LocalTime.now();
        entregado = false;
    }

    public Pedido(Plato plato, Persona persona) {
        fechaCreacion = LocalDate.now();
        horaEntrega = LocalTime.now();
        this.plato = plato;
        this.persona = persona;
    }

    public Pedido(Plato plato, Persona persona, boolean entregado) {
        fechaCreacion = LocalDate.now();
        horaEntrega = LocalTime.now();
        this.plato = plato;
        this.persona = persona;
        this.entregado = entregado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public LocalTime getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(LocalTime horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
    public void modificarPedido(Plato plato, Persona persona, boolean entregado){
        this.plato = plato;
        this.persona = persona;
        this.entregado = entregado;
        System.out.println("-----pedido modificado-----");
    }

}
