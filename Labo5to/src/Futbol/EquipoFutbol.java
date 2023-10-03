package Futbol;

import java.util.HashSet;

public class EquipoFutbol {
    private String nombre;
    private HashSet<Jugador>jugadores;
    private Arquero arquero;

    public EquipoFutbol(String nombre) {
        this.nombre = nombre;
        jugadores = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Arquero getArquero() {
        return arquero;
    }

    public void setArquero(Arquero arquero) {
        this.arquero = arquero;
    }
}
