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
        /*System.out.println("turno: ");
        for(int i = 0; i<turno.size(); i++){
            System.out.print(turno.get(i) + " - ");
        }*/

        ArrayList<Integer>turno2 = new ArrayList<Integer>(6);
        turno2.add(2);
        turno2.add(2);
        turno2.add(3);
        turno2.add(1);
        turno2.add(1);
        turno2.add(2);
        /*System.out.println("turno2: ");
        for(int i = 0; i<turno2.size(); i++){
            System.out.print(turno2.get(i) + " - ");
        }*/
        ArrayList<Jugador>jugadores = new ArrayList<Jugador>(10);

        ArrayList<Integer>turno3 = new ArrayList<Integer>(6);
        turno3.add(3);
        turno3.add(1);
        turno3.add(3);
        turno3.add(1);
        turno3.add(1);
        turno3.add(2);
        /*System.out.println("turno3: ");
        for(int i = 0; i<turno.size(); i++){
            System.out.print(turno3.get(i) + " - ");
        }*/

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
        Equipo e3 = new Equipo("eq3",turno3,jugadores);

        e1.eliminarJugador(8);
        e1.agregarJugador(new Jugador("lola", 24));

        Campeonato c1 = new Campeonato();
        c1.agregarEquipo(e1);
        c1.agregarEquipo(e2);
        c1.agregarEquipo(e3);
        c1.armarPartidos();
        c1.mostrarFixture();


    }
}
