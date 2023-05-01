package cuentas;

import pagos.MetodoPago;
import personas.ClienteBanco;

public class CuentaAhorro extends CuentaBancaria{
    public CuentaAhorro(){
        super();
    }

    public CuentaAhorro(ClienteBanco titular, MetodoPago metodoPago, MetodoPago metodoRetiro, int cbu){
        super(titular, metodoPago, metodoRetiro, cbu);
    }
}
