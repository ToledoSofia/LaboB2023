package futbol;

import java.util.HashSet;

public class EquipoFutbol {
    private String nombre;
    private HashSet<JugadorCampo>jugadores;
    private Arquero arquero;

    public EquipoFutbol(String nombre) {
        this.nombre = nombre;
        jugadores = new HashSet<>();
        arquero = new Arquero("");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<JugadorCampo> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<JugadorCampo> jugadores) {
        this.jugadores = jugadores;
    }

    public Arquero getArquero() {
        return arquero;
    }

    public void setArquero(Arquero arquero) {
        this.arquero = arquero;
    }
    public void agregarJugador(Jugador jugador){
        if(jugador instanceof JugadorCampo){
            jugadores.add((JugadorCampo) jugador);
        } else {
            arquero = (Arquero) jugador;
        }
    }
    public void eliminarJugador(Jugador j){
        if(j instanceof JugadorCampo && jugadores.contains(j)){
            jugadores.remove(j);
        }else if (arquero.equals(j)){
            arquero = new Arquero(null);
        }
    }
    public void agregarPartidoJugadores(PartidoFutbol p){
        for(Jugador j : jugadores){
            j.agregarPartido(p);
        }
        arquero.agregarPartido(p);
    }
    public void actualizarDatosJugadores(){
        for(JugadorCampo j : jugadores){
            j.porcentajeGoles();
            j.asistencias();
        }
        arquero.porcentajeAtajadas();
    }
}
