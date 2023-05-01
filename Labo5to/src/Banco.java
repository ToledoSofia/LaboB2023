import java.util.ArrayList;
import personas.*;
import cuentas.*;
import pagos.*;
public class Banco {
    private ArrayList<ClienteBanco>clientes;
    private ArrayList<CuentaBancaria>cuentas;
    public Banco(){
        clientes = new ArrayList<ClienteBanco>();
        cuentas = new ArrayList<CuentaBancaria>();
    }
    public Banco(ArrayList<ClienteBanco> clientes, ArrayList<CuentaBancaria> cuentas) {
        this.clientes = clientes;
        this.cuentas = cuentas;
    }

    public ArrayList<ClienteBanco> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<ClienteBanco> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }
    public void agregarCuenta(CuentaBancaria cuenta){
        cuentas.add(cuenta);
        if(!clientes.contains(cuenta.getTitular())){
            clientes.add(cuenta.getTitular());
        }
    }
    public void eliminarCuenta(CuentaBancaria eliminar){
        if(cuentas.contains(eliminar)){
            cuentas.remove(eliminar);
            clientes.remove(eliminar.getTitular());
        }else{
            System.out.println("-----La cuenta no se encuentra registrada-----");
        }
    }
    public void modificarCuenta(CuentaBancaria modificar, CuentaBancaria nueva){
        if(cuentas.contains(modificar)){
            cuentas.remove(modificar);
            clientes.remove(modificar.getTitular());
            cuentas.add(nueva);
            clientes.add(nueva.getTitular());
        }else{
            System.out.println("---La cuenta que quiere modificar no existe----");
        }
    }
    public int devolverCbu(int cuil){
        int cbu1 = 0;
        for(CuentaBancaria cuenta : cuentas){
            if(cuenta.getTitular().getCuil() == cuil){
                cbu1 = cuenta.getCbu();
            }
        }
        return cbu1;
    }
    public String devolverNombreApellido(int cbu){
        String nombreApellido = " - ";
        for(CuentaBancaria cuenta : cuentas){
            if(cuenta.getCbu() == cbu){
                nombreApellido = cuenta.devolverNombreApellido();
            }
        }
        return nombreApellido;
    }
    public void clienteMasJoven(){
        ClienteBanco joven = clientes.get(0);
        for(ClienteBanco cliente : clientes){
            if(cliente.getEdad()<joven.getEdad()){
                joven = cliente;
            }
        }
        System.out.println(joven.toString());
    }
    public void masTransferPorCheque(){
        int cant = 0, mayor = 0;
        ClienteBanco clienteMayor = clientes.get(0), cliente1 = new ClienteBanco();
        for(CuentaBancaria cuenta : cuentas){
            if(cuenta instanceof CuentaCorriente) {
                cant = ((CuentaCorriente) cuenta).getCheques().size();
                cliente1 = cuenta.getTitular();
                if(cant>mayor){
                    clienteMayor = cliente1;
                    mayor = cant;
                }
            }
        }

        System.out.println("Cliente con mayor cantidad de transferencias por cheques:\n" + clienteMayor.toString());
    }
}
