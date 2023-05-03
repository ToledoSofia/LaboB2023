import diasTurnos.*;
import personas.Jugador;

import java.util.ArrayList;

public class MainCampeonato {
    public static void main(String[] args) {
        
        ArrayList<Jugador>jugadores = new ArrayList<Jugador>(10);

        jugadores.add(new Jugador("Natalia", 10));
        jugadores.add( new Jugador("Belen", 1));
        jugadores.add(new Jugador("Bianca", 2));
        jugadores.add(new Jugador("Sofia", 3));
        jugadores.add(new Jugador("Jugador5", 4));
        jugadores.add(new Jugador("jugador6", 5));
        jugadores.add(new Jugador("jugador7", 6));
        jugadores.add(new Jugador("jugador8", 7));
        jugadores.add(new Jugador("jugador9", 8));
        jugadores.add(new Jugador("Jugador10", 9));

        ArrayList<Dia>dias = new ArrayList<Dia>();
        dias.add(Dia.LUNES);
        dias.add(Dia.MARTES);
        dias.add(Dia.MIERCOLES);
        dias.add(Dia.JUEVES);

        ArrayList<Dia>dias2 = new ArrayList<Dia>();
        dias.add(Dia.LUNES);
        dias.add(Dia.MARTES);
        dias.add(Dia.JUEVES);
        dias.add(Dia.VIERNES);


        ArrayList<Dia>dias3 = new ArrayList<Dia>();
        dias.add(Dia.MARTES);
        dias.add(Dia.MIERCOLES);
        dias.add(Dia.JUEVES);
        dias.add(Dia.SABADO);

        Equipo e1 = new Equipo("eq1", Turno.TARDE, dias,jugadores);
        Equipo e2 = new Equipo("eq2",Turno.NOCHE,dias2,jugadores);
        Equipo e3 = new Equipo("eq3",Turno.MANANA,dias3,jugadores);

        e1.eliminarJugador(8);
        e1.agregarJugador(new Jugador("lola", 24));

        Campeonato c1 = new Campeonato();
        c1.agregarEquipo(e1);
        c1.agregarEquipo(e2);
        c1.agregarEquipo(e3);
        c1.armarPartidos();
        c1.mostrarFixture();

//
    }
}
