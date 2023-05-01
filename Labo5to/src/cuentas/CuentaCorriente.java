package cuentas;
import pagos.*;
import personas.ClienteBanco;

import java.util.ArrayList;

public class CuentaCorriente extends CuentaBancaria{
    private ArrayList<Cheque>cheques;
    public CuentaCorriente(){
        super();
        cheques = new ArrayList<Cheque>();
    }
    public CuentaCorriente(ArrayList<Cheque>cheques){
        this.cheques = cheques;
    }

    public CuentaCorriente(ClienteBanco titular, MetodoPago metodoPago, MetodoPago metodoRetiro, int cbu) {
        super(titular, metodoPago, metodoRetiro,cbu);
        cheques = new ArrayList<Cheque>();
    }

    public ArrayList<Cheque> getCheques() {
        return cheques;
    }

    public void setCheques(ArrayList<Cheque> cheques) {
        this.cheques = cheques;
    }
    public void agregarCheque(Cheque cheque){
        cheques.add(cheque);
    }
}
