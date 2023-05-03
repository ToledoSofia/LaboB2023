package cuentas;
import  personas.*;
import pagos.*;
public class CuentaBancaria {
    private ClienteBanco titular;
    private int cbu;
    private String alias;
    private double saldo;
    private MetodoPago metodoPago;
    private MetodoPago metodoRetiro;
    public CuentaBancaria(){
        titular = new ClienteBanco();
        saldo = 0;
        metodoPago = new MetodoPago();
        metodoRetiro = new MetodoPago();
    }
    public CuentaBancaria(ClienteBanco titular, MetodoPago metodoPago, MetodoPago metodoRetiro, int cbu){
        this.titular = titular;
        this.metodoPago = metodoPago;
        this.metodoRetiro = metodoRetiro;
        this.cbu = cbu;
    }

    public ClienteBanco getTitular() {
        return titular;
    }

    public void setTitular(ClienteBanco titular) {
        this.titular = titular;
    }

    public int getCbu() {
        return cbu;
    }

    public void setCbu(int cbu) {
        this.cbu = cbu;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public MetodoPago getMetodoRetiro() {
        return metodoRetiro;
    }

    public void setMetodoRetiro(MetodoPago metodoRetiro) {
        this.metodoRetiro = metodoRetiro;
    }
    public String devolverNombreApellido(){
        return titular.getNombre() + " " + titular.getApellido();
    }

}
