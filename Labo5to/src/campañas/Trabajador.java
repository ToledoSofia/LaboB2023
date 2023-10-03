package campañas;

import personas.Persona;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Trabajador extends Persona implements Mensajero{
    private int cuil;
    private double sueldo;
    private String dirResidencia;
    private ArrayList<Double>horario;

    public Trabajador(String nombre) {
        super(nombre);
        horario = new ArrayList<>();
    }
    public Trabajador(String nombre, double inicio, double fin){
        super(nombre);
        horario = new ArrayList<>();
        horario.add(inicio);
        horario.add(fin);
    }

    public Trabajador(String nombre, ArrayList<Double> horario) {
        super(nombre);
        this.horario = horario;
    }

    @Override
    public void mostrarDatos() {

    }

    @Override
    public void enviarMensajeApoyo(String mensaje) {//hashmap DayOfWeek, horario
        if(LocalDateTime.now().getHour() >= horario.get(0) && LocalDateTime.now().getHour() <= horario.get(1)){
            System.out.println("Yo, " +getNombre()+ ", te invito a que " + mensaje);
        }else{
            System.out.println("El trabajador no esta disponible");
        }
    }
}
