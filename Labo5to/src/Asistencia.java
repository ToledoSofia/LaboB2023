import personas.*;

import java.util.ArrayList;
import java.util.HashSet;

public class Asistencia {
    private HashSet<EmpleadoAsist> empleados;

    public Asistencia() {
        empleados = new HashSet<EmpleadoAsist>();
    }

    public Asistencia(HashSet<EmpleadoAsist> empleados) {
        this.empleados = empleados;
    }

    public HashSet<EmpleadoAsist> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<EmpleadoAsist> empleados) {
        this.empleados = empleados;
    }
  /*  public double porcentajeTotal(int mes){
        double porcTotal = 0;
        int total = empleados.size()*100;
        for(EmpleadoAsist e :empleados){
            porcTotal += e.porcentajeMes(mes);
        }
        return porcTotal*100/total;
    }*/
    public void agregarEmpleado(EmpleadoAsist emp){
        empleados.add(emp);
    }
    public int mayor80(int mes){
        int cont = 0;
        for(EmpleadoAsist emp : empleados){
            if(emp.porcentajeMes(mes) > 80){
                cont++;
            }
        }
        return cont;
    }
}
