import componentes.*;

import javax.management.monitor.Monitor;
import java.util.ArrayList;

public class MainCompus {
    public static void main(String[] args) {
        PaginaComputadora sistema = new PaginaComputadora();
        Teclado t1 = new Teclado();
        Teclado t2 = new Teclado();
        CPU cpu1 = new CPU();
        Pantalla p1 = new Pantalla();
        ArrayList<Componente>componentes  = new ArrayList<Componente>();
        componentes.add(cpu1);

        Compra compra1 = new Compra(componentes, false);
        compra1.agregarPeriferico(t1);
        compra1.agregarPeriferico(t2);
        compra1.agregarPeriferico(p1);
        compra1.mostrarCantidad();
        compra1.eliminarPeriferico(t2);
        //compra1.eliminarPeriferico(t1);
        compra1.modificarPeriferico(t1,t2);

        sistema.agregarComponente(t1);
        sistema.agregarComponente(t2);
        sistema.agregarComponente(cpu1);
        sistema.agregarComponente(p1);
        sistema.agregarVenta(compra1);

    }
}
