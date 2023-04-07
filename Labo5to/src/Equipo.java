import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private String nombre;
    private String barrio;
    private ArrayList<Integer>turno;//0
    private ArrayList<Jugador>jugadores;
    private Jugador capitan;
    public Equipo(){
        nombre = "";
        barrio = "";
        turno = new ArrayList<Integer>(6);
        jugadores = new ArrayList<Jugador>(10);
        capitan = new Jugador();
    }
    public Equipo(String nombre, ArrayList<Integer>turno, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.turno = turno;
        this.jugadores = jugadores;
        if(validarCamisetas()==true){
            jugadores = new ArrayList<Jugador>();
        }
        capitan = jugadores.get(0);
    }
    public Equipo(ArrayList<Jugador>jugadores){
        this.jugadores = jugadores;
        if(validarCamisetas()){
            jugadores = new ArrayList<Jugador>();
        }
    }
    public Jugador getCapitan() {
        return capitan;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
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
    public void agregarJugador(Jugador jugador){
        boolean agregar = true;
        if(jugadores.size()<10){
            for(int i = 0; i<jugadores.size() && agregar == true; i++){
                if(jugadores.get(i).getNumCamiseta() == jugador.getNumCamiseta()){
                    agregar = false;
                }
            }
            if(agregar){
                jugadores.add(jugador);
                System.out.println("---El jugador ha sido egregado correctamente---");
            }else{
                System.out.println("---Ya existe un jugador con esa camiseta---");
            }
        }else{
            System.out.println("El equipo ya está completo");
        }
    }
    public void eliminarJugador(int numCamiseta){
        boolean jugadorEliminado = false;
        for(int i = 0; i<jugadores.size() && !jugadorEliminado; i++){
            if(jugadores.get(i).getNumCamiseta() == numCamiseta){
                jugadores.remove(i);
                jugadorEliminado = true;
                System.out.println("---Jugador eliminado---");
            }
        }
    }

}
