package futbol;

import java.time.LocalDate;

public class MainFutbol {
    public static void main(String[] args) {
        EquipoFutbol e1 = new EquipoFutbol("equipo1");
        EquipoFutbol e2 = new EquipoFutbol("equipo2");
        EquipoFutbol e3 = new EquipoFutbol("equipo3");
        EquipoFutbol e4 = new EquipoFutbol("equipo4");

        LocalDate mayor = LocalDate.parse("1900-05-05");
        LocalDate menor = LocalDate.now();

        JugadorCampo j1 = new JugadorCampo("jugador1", mayor, e1, 30, 24);
        JugadorCampo j2 = new JugadorCampo("jugador2", menor, e1, 20, 10);
        JugadorCampo j3 = new JugadorCampo("jugador3", menor, e1, 10, 5);
        JugadorCampo j4 = new JugadorCampo("jugador4", menor, e1, 60, 50);

        JugadorCampo j5 = new JugadorCampo("jugador5", menor,  e2, 35, 24);
        JugadorCampo j6 = new JugadorCampo("jugador6", menor, e2, 20, 10);
        JugadorCampo j7 = new JugadorCampo("jugador7", menor, e2, 10, 5);
        JugadorCampo j8 = new JugadorCampo("jugador8", mayor, e2, 60, 50);

        JugadorCampo j9 = new JugadorCampo("jugador9", menor,  e2, 60, 50);

        Arquero a1 = new Arquero("arquero1", menor, e2, 80, 5);
        Arquero a2 = new Arquero("arquero2", mayor, e1, 30, 5);

        e2.agregarJugador(j5);
        e2.agregarJugador(j6);
        e2.agregarJugador(j7);
        e2.agregarJugador(j8);

        e1.agregarJugador(j1);
        e1.agregarJugador(j2);
        e1.agregarJugador(j3);
        e1.agregarJugador(j4);

       /* try {
            a1.Renovar(e1);//si
            a2.Contratar(e2);//no
            a2.Renovar(e1);//no
            j9.Contratar(e3);// si deberia
            j9.Renovar(e2);// no deberia
        } catch (Exception e) {
            System.err.println(e);
        }

        try {
            j5.Renovar(e2);//si
            j7.Renovar(e2);//si
            a1.Contratar(e2);//si
            j8.Renovar(e2);//no
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println(j8.getActual());*/


        PartidoFutbol partido1 = new PartidoFutbol(e2, e1);
        partido1.Gol(e2,j5,j6);
        partido1.Gol(e2,j5,j6);
        partido1.intento(e2,j5);
        partido1.intento(e2,j5);
        partido1.intento(e2,j5);
        partido1.intento(e2,j5);
        SistemaPartidos sistema = new SistemaPartidos();
        sistema.agregarpartido(partido1);

        System.out.println(j5.getPorcentajeGoles());
        System.out.println(j6.getCantidadAsistencias());



    }
}
