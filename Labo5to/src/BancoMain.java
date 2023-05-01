import cuentas.*;
import pagos.*;
import personas.*;

public class BancoMain {
    public static void main(String[] args) {
        ClienteBanco c1 = new ClienteBanco("nombre1","apellido1",18,123456);
        ClienteBanco c2 = new ClienteBanco("nombre2","apellido2",25,128356);
        ClienteBanco c3 = new ClienteBanco("nombre3","apellido3",41,9983456);
        ClienteBanco c4 = new ClienteBanco("nombre4","apellido4",34,1096456);

        Cheque ch1 = new Cheque(c3,c2,2000);
        Cheque ch2 = new Cheque(c3,c3,27700);
        Cheque ch3 = new Cheque(c3,c2,500);
        Cheque ch4 = new Cheque(c4,c1,80000);
        Efectivo efectivo1 = new Efectivo();
        Tarjeta tarjeta1  = new Tarjeta();

        CuentaAhorro ahorro1 = new CuentaAhorro(c1,efectivo1,efectivo1,11111);
        CuentaAhorro ahorro2 = new CuentaAhorro(c2,efectivo1,efectivo1,2222);
        CuentaCorriente corriente1 = new CuentaCorriente(c3,ch1,efectivo1,33333);
        CuentaCorriente corriente2 = new CuentaCorriente(c4,ch4,efectivo1, 44444);
        CuentaAhorro ahorro3 = new CuentaAhorro();
        CuentaAhorro ahorro4 = new CuentaAhorro();


        corriente1.agregarCheque(ch1);
        corriente1.agregarCheque(ch2);
        corriente1.agregarCheque(ch3);
        corriente2.agregarCheque(ch4);


        Banco banco1 = new Banco();
        banco1.agregarCuenta(ahorro1);
        banco1.agregarCuenta(ahorro2);
        banco1.agregarCuenta(corriente1);
        banco1.agregarCuenta(corriente2);
        banco1.agregarCuenta(ahorro3);

        System.out.println("cbu " + banco1.devolverCbu(123456));
        System.out.println("nombreap " + banco1.devolverNombreApellido(2222));
        banco1.modificarCuenta(ahorro3,ahorro4);
        banco1.eliminarCuenta(ahorro4);
        banco1.clienteMasJoven();
        banco1.masTransferPorCheque();




    }
}
