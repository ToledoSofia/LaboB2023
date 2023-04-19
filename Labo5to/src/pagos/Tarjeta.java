package pagos;

public class Tarjeta extends MetodoPago {
    private int numero;
    private String banco;
    private boolean creditoDebito;//0.credito 1.debito
    public Tarjeta(){
        super();
        numero = 0;
        banco = "";
    }

    public Tarjeta(boolean creditoDebito) {
        this.creditoDebito = creditoDebito;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean isCreditoDebito() {
        return creditoDebito;
    }

    public void setCreditoDebito(boolean creditoDebito) {
        this.creditoDebito = creditoDebito;
    }
}
/*guardar también el número de tarjeta,
 de qué banco es y si es crédito o débito.*/