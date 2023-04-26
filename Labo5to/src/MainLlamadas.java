import llamadas.*;
import personas.Empleado;

public class MainLlamadas {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(45822353,"Argentina");
        Empleado emp2 = new Empleado(15568942,"Uruguay");
        Empleado emp3 = new Empleado(12345678, "Ingleaterra");
        Empleado emp4 = new Empleado(1521575356,"Argentina");

        Empleado emp5 = new Empleado(12345699,"Estados Unidos");

        Llamada l1 =  new Llamada(emp1, emp2,80);
        Llamada l2 = new Llamada(emp1,emp4,50);
        Llamada l3 = new Llamada(emp2, emp4,30);
        Llamada l4 = new Llamada(emp2, emp3, 20);

        Llamada l5 = new Llamada(emp1, emp5,10);

        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);
        empresa.agregarEmpleado(emp4);

        empresa.agregarLlamada(l1);
        empresa.agregarLlamada(l2);
        empresa.agregarLlamada(l3);
        empresa.agregarLlamada(l4);
        empresa.agregarLlamada(l5);

        empresa.mostrarListado(emp1);
        empresa.rankingEmpleados();
    }
}
