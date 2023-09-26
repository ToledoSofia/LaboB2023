package campañas;

import org.omg.CORBA.PRIVATE_MEMBER;

public class TelefonoMovil extends Dispositivo implements Mensajero{
    private CompaniaTelefonica compania;
    private int numeroCelular;
    private boolean prendido;
    private boolean tieneCredito;

    public TelefonoMovil() {
        super();
        compania = CompaniaTelefonica.CLARO;
    }

    public TelefonoMovil(boolean prendido, boolean tieneCredito) {
        this.prendido = prendido;
        this.tieneCredito = tieneCredito;
    }

    public TelefonoMovil(int numeroSerie, String fabricante, String modelo, CompaniaTelefonica compania, int numeroCelular) {
        super(numeroSerie, fabricante, modelo);
        this.compania = compania;
        this.numeroCelular = numeroCelular;
    }

    public CompaniaTelefonica getCompania() {
        return compania;
    }

    public void setCompania(CompaniaTelefonica compania) {
        this.compania = compania;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public boolean isPrendido() {
        return prendido;
    }

    public void setPrendido(boolean prendido) {
        this.prendido = prendido;
    }

    public boolean isTieneCredito() {
        return tieneCredito;
    }

    public void setTieneCredito(boolean tieneCredito) {
        this.tieneCredito = tieneCredito;
    }

    @Override
    public void enviarMensajeApoyo(String mensaje) {
        if(prendido && tieneCredito){
            System.out.println("-- Conectando con la antena más cercana --  " + mensaje);
        }else{
            System.out.println("El telefono no puede enviar el mensaje");
        }
    }
}
