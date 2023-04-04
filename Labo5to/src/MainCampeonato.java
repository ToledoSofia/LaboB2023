import java.util.ArrayList;

public class MainCampeonato {
    public static void main(String[] args) {
        ArrayList<Integer>turno = new ArrayList<Integer>(6);
        turno.add(1);
        turno.add(2);
        turno.add(3);
        turno.add(1);
        turno.add(1);
        turno.add(2);

        ArrayList<Integer>turno2 = new ArrayList<Integer>(6);
        turno2.add(2);
        turno2.add(2);
        turno2.add(3);
        turno2.add(1);
        turno2.add(1);
        turno2.add(2);
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

        Equipo e1 = new Equipo("eq1",turno,jugadores);
        Equipo e2 = new Equipo("eq2",turno2,jugadores);

        Campeonato c1 = new Campeonato();
        c1.agregarPartido(e1,e2);
        c1.agregarPartido(e1,e2);
        c1.mostrarFixture();


    }
}
