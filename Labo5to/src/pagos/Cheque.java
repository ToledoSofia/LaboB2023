package pagos;
import personas.*;

public class Cheque extends MetodoPago{
    private ClienteBanco emisor;
    private ClienteBanco receptor;
    private double monto;

    public Cheque(){
        emisor = new ClienteBanco();
        receptor = new ClienteBanco();
        monto = 100;
    }

    public Cheque(ClienteBanco emisor, ClienteBanco receptor, double monto) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.monto = monto;
    }

    public ClienteBanco getEmisor() {
        return emisor;
    }

    public void setEmisor(ClienteBanco emisor) {
        this.emisor = emisor;
    }

    public ClienteBanco getReceptor() {
        return receptor;
    }

    public void setReceptor(ClienteBanco receptor) {
        this.receptor = receptor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}
