import personas.*;
import vehiculos.*;
public class MainV {
    public static void main(String[] args) {
        /*
        Coche c1 = new Coche("abc123", true);
        Coche c2 = new Coche("15464", false);
        Coche c3 = new Coche("abf123", true);
        Coche c4 = new Coche("atgbc123", true);

        Camioneta cam1 = new Camioneta();
        Camioneta cam2 = new Camioneta();
        Camioneta cam3 = new Camioneta();
        Camioneta cam4 = new Camioneta();
        Camioneta cam5 = new Camioneta();
        Bicicleta b1 = new Bicicleta();

        EmpresaVehiculos empresa = new EmpresaVehiculos();

        empresa.agregarVehiculo(b1);
        empresa.agregarVehiculo(c1);
        empresa.agregarVehiculo(c2);

        empresa.agregarVehiculo(c1);
        empresa.agregarVehiculo(cam1);
        empresa.agregarVehiculo(c3);
        empresa.agregarVehiculo(cam2);
        empresa.agregarVehiculo(cam3);
        empresa.agregarVehiculo(b1);
        empresa.agregarVehiculo(c4);
        empresa.agregarVehiculo(cam4);
        empresa.agregarVehiculo(cam5);



        System.out.println("Porcentaje de descapotables: " + empresa.calcularPorcentajeDescapotables());
        System.out.println("Mayor cantidad de: " + empresa.buscarMayorCantidad());*/
        //buffet

        Profesor p1 = new Profesor();
        Profesor p2 = new Profesor(20);
        Profesor p3 = new Profesor(30);
        Profesor p4 = new Profesor();
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();

        Plato plato1 = new Plato("fideos", 1500);
        Plato plato2 = new Plato("pollo", 2000);
        Plato plato3 = new Plato("n3", 500);

        Bufet bufet = new Bufet();
        bufet.agregarPedido(new Pedido(plato1,p1));
        bufet.agregarPedido(new Pedido(plato2,p2));
        bufet.agregarPedido(new Pedido(plato3,p3,true));
        bufet.agregarPedido(new Pedido(plato1,p4));
        bufet.agregarPedido(new Pedido(plato1,a1));
        bufet.agregarPedido(new Pedido(plato3,a2));

        plato3.modificarPlato("Fideos3", 1250);
        plato2.modificarPlato("Fideos2", plato2.getPrecio());

        bufet.mostrarListado();
    }
}
