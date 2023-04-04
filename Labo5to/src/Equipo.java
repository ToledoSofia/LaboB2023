import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private String barrio;
    private ArrayList<Integer>turno;
    private ArrayList<Jugador>jugadores;
    public Equipo(){
        nombre = "";
        barrio = "";
        turno = new ArrayList<Integer>(6);
        jugadores = new ArrayList<Jugador>(10);
    }
    public Equipo(String nombre, ArrayList<Integer>turno, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.turno = turno;
        this.jugadores = jugadores;
        if(validarCamisetas()==true){
            jugadores = new ArrayList<Jugador>();
        }
    }
    public Equipo(ArrayList<Jugador>jugadores){
        this.jugadores = jugadores;
        if(validarCamisetas()){
            jugadores = new ArrayList<Jugador>();
        }
    }

    public ArrayList<Integer> getTurno() {
        return turno;
    }

    public void setTurno(ArrayList<Integer> turno) {
        this.turno = turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public boolean validarCamisetas(){
        boolean iguales = false;
        int camiseta;
        for(int i = 0; !iguales && i<jugadores.size(); i++){//selecciona cada jugador de a uno
            camiseta = jugadores.get(i).getNumCamiseta();
            for(int j = i+1; !iguales && j<jugadores.size();j++){//compara el jugador elegido con todos los siguientes
                if(jugadores.get(j).getNumCamiseta()==camiseta){
                    iguales = true;
                }
            }
        }
        if(iguales){
            System.out.println("Los jugadores no han podido ser registrados correctamente: Existen jugadores con el mismo numero de camiseta");
        }
        return iguales;
    }

}
