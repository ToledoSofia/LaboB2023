package Futbol;

import java.util.HashSet;

public class SistemaPartidos {
    private HashSet<PartidoFutbol>partidos;

    public SistemaPartidos() {
        partidos = new HashSet<>();
    }

    public SistemaPartidos(HashSet<PartidoFutbol> partidos) {
        this.partidos = partidos;
    }
    //actualizar todos los jugadores cada vez que se agrega un partido


}

    /*public void actualizarDatos(PartidoFutbol partido){
        double porcentaje = 0;
        //local
        for(JugadorCampo j : partido.getIntentosLocal().keySet()){
            porcentaje += partido.getIntentosLocal().get(j);
            if(partido.getGolesLocal().containsKey(j)){
                j.setPorcentajeGoles(partido.getGolesLocal().get(j) * 100 / porcentaje);
            }
        }
        for(JugadorCampo j : partido.getAsistenciasLocal().keySet()){
            j.setCantidadAsistencias(partido.getAsistenciasLocal().get(j));
        }
        partido.getLocal().getArquero().setCantidadGoles(partido.total(partido.getGolesVisitante()));//esta  mal pero bueno
        partido.getLocal().getArquero().setPorcentajeAtajada(partido.total(partido.getGolesVisitante()) * 100 / partido.total(partido.getIntentosVisitante()));


        //visitante
        for(JugadorCampo j : partido.getIntentosVisitante().keySet()){
            porcentaje += partido.getIntentosVisitante().get(j);
            if(partido.getGolesVisitante().containsKey(j)){
                j.setPorcentajeGoles(partido.getGolesVisitante().get(j) * 100 / porcentaje);
            }
        }
        for(JugadorCampo j : partido.getAsistenciasVisitante().keySet()){
            j.setCantidadAsistencias(partido.getAsistenciasVisitante().get(j));
        }
        partido.getVisitante().getArquero().setCantidadGoles(partido.total(partido.getGolesLocal()));
        partido.getVisitante().getArquero().setPorcentajeAtajada(partido.total(partido.getGolesLocal()) * 100 / partido.total(partido.getIntentosLocal()));
    }*/
