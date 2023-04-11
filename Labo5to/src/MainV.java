import vehiculos.*;
public class MainV {
    public static void main(String[] args) {
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
        /*
        empresa.agregarVehiculo(c1);
        empresa.agregarVehiculo(cam1);
        empresa.agregarVehiculo(c3);
        empresa.agregarVehiculo(cam2);
        empresa.agregarVehiculo(cam3);
        empresa.agregarVehiculo(b1);
        empresa.agregarVehiculo(c4);
        empresa.agregarVehiculo(cam4);
        empresa.agregarVehiculo(cam5);*/



        System.out.println("Porcentaje de descapotables: " + empresa.calcularPorcentajeDescapotables());
        System.out.println("Mayor cantidad de: " + empresa.buscarMayorCantidad());
    }
}
