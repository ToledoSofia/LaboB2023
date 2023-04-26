import llamadas.Llamada;
import personas.Empleado;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado>empleados;
    private ArrayList<Llamada>llamadas;
    public Empresa(){
        empleados = new ArrayList<Empleado>();
        llamadas = new ArrayList<Llamada>();
    }
    public Empresa(ArrayList<Llamada>llamadas) {
        this.llamadas = llamadas;
        empleados = new ArrayList<Empleado>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }
    public int sumarLlamadas(Empleado empleado){
        int duracionTotal = 0;
        for(Llamada llamada : llamadas){
            if(llamada.getOrigen() == empleado && llamada.getDestino().getPais()!=empleado.getPais()){
                duracionTotal =+ llamada.getMinutosDuracion();
            }
        }
        return duracionTotal;
    }
    public void agregarLlamada(Llamada llamada){
        for(Empleado empleado : empleados){
            if(empleado.getTelefono() == llamada.getDestino().getTelefono()){
                llamadas.add(llamada);
            }
        }
    }
    public void agregarEmpleado(Empleado emp){//agrgarlo cuando llama
        empleados.add(emp);
    }
    public void mostrarListado(Empleado empleado){
        for(Llamada llamada : llamadas){
            if(llamada.getOrigen() == empleado){
                System.out.println(llamada.toString());
            }
        }
    }
    public void rankingEmpleados(){
        int duracion;
        Empleado primero = new Empleado(), segundo = new Empleado(), tercero = new Empleado();
        int d1 = 0, d2 = 0, d3 = 0;
        for(Empleado empleado : empleados){
            duracion = sumarLlamadas(empleado);
            if(duracion >d1){
                tercero = segundo;
                d3 = d2;
                segundo = primero;
                d2 = d1;
                primero = empleado;
                d1 = duracion;
            }else if(duracion > d2){
                tercero = segundo;
                d3 = d2;
                segundo = empleado;
                d2 = duracion;
            }else if(duracion > d3){
                tercero = empleado;
                d3 = duracion;
            }
        }
        System.out.println("Primero: " + primero.getTelefono() + " Duracion: " + d1);
        System.out.println("Segundo: " + segundo.getTelefono() + " Duracion: " + d2);
        System.out.println("Tercero: " + tercero.getTelefono() + " Duracion: " + d3);
    }
}
