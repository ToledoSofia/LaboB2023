package futbol;

import java.util.HashMap;

public class PartidoFutbol {
    private EquipoFutbol local;
    private HashMap<JugadorCampo, Integer> golesLocal;
    private HashMap<JugadorCampo, Integer> asistenciasLocal;
    private HashMap<JugadorCampo, Integer>  intentosLocal;
    private EquipoFutbol visitante;
    private HashMap<JugadorCampo, Integer> golesVisitante;
    private HashMap<JugadorCampo, Integer> asistenciasVisitante;
    private HashMap<JugadorCampo, Integer>  intentosVisitante;

    public PartidoFutbol(EquipoFutbol local, EquipoFutbol visitante) {
        this.local = local;
        this.visitante = visitante;
        golesLocal = new HashMap<>();
        golesVisitante = new HashMap<>();
        asistenciasLocal = new HashMap<>();
        asistenciasVisitante = new HashMap<>();
        intentosLocal = new HashMap<>();
        intentosVisitante = new HashMap<>();
    }

    public PartidoFutbol(EquipoFutbol local, HashMap<JugadorCampo, Integer> golesLocal, HashMap<JugadorCampo, Integer> asistenciasLocal, HashMap<JugadorCampo, Integer> intentosLocal, EquipoFutbol visitante, HashMap<JugadorCampo, Integer> golesVisitante, HashMap<JugadorCampo, Integer> asistenciasVisitante, HashMap<JugadorCampo, Integer> intentosVisitante) {
        this.local = local;
        this.golesLocal = golesLocal;
        this.asistenciasLocal = asistenciasLocal;
        this.intentosLocal = intentosLocal;
        this.visitante = visitante;
        this.golesVisitante = golesVisitante;
        this.asistenciasVisitante = asistenciasVisitante;
        this.intentosVisitante = intentosVisitante;
    }

    public EquipoFutbol getLocal() {
        return local;
    }

    public void setLocal(EquipoFutbol local) {
        this.local = local;
    }

    public HashMap<JugadorCampo, Integer> getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(HashMap<JugadorCampo, Integer> golesLocal) {
        this.golesLocal = golesLocal;
    }

    public HashMap<JugadorCampo, Integer> getAsistenciasLocal() {
        return asistenciasLocal;
    }

    public void setAsistenciasLocal(HashMap<JugadorCampo, Integer> asistenciasLocal) {
        this.asistenciasLocal = asistenciasLocal;
    }

    public HashMap<JugadorCampo, Integer> getIntentosLocal() {
        return intentosLocal;
    }

    public void setIntentosLocal(HashMap<JugadorCampo, Integer> intentosLocal) {
        this.intentosLocal = intentosLocal;
    }

    public void setIntentosVisitante(HashMap<JugadorCampo, Integer> intentosVisitante) {
        this.intentosVisitante = intentosVisitante;
    }

    public EquipoFutbol getVisitante() {
        return visitante;
    }

    public void setVisitante(EquipoFutbol visitante) {
        this.visitante = visitante;
    }

    public HashMap<JugadorCampo, Integer> getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(HashMap<JugadorCampo, Integer> golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public HashMap<JugadorCampo, Integer> getAsistenciasVisitante() {
        return asistenciasVisitante;
    }

    public void setAsistenciasVisitante(HashMap<JugadorCampo, Integer> asistenciasVisitante) {
        this.asistenciasVisitante = asistenciasVisitante;
    }

    public HashMap<JugadorCampo, Integer> getIntentosVisitante() {
        return intentosVisitante;
    }

    public int total(HashMap<JugadorCampo, Integer> recorrer){
        int total = 0;
        for(int i : recorrer.values()){
            total += i;
        }
        return total;
    }


    public void Gol (EquipoFutbol equipo, JugadorCampo jugador, JugadorCampo asistencia){
        if(equipo.equals(local)){
            if(golesLocal.containsKey(jugador)){
                golesLocal.put(jugador, golesLocal.get(jugador) + 1);
            }else{
                golesLocal.put(jugador, 1);
            }
            if(asistenciasLocal.containsKey(asistencia)){
                asistenciasLocal.put(asistencia,asistenciasLocal.get(asistencia) + 1);
            }else{
                asistenciasLocal.put(asistencia, 1);
            }
            if(intentosLocal.containsKey(jugador)){
                intentosLocal.put(jugador, intentosLocal.get(jugador) + 1);
            }else{
                intentosLocal.put(jugador, 1);
            }
        } else if(equipo.equals(visitante)){
            if(golesVisitante.containsKey(jugador)){
                golesVisitante.put(jugador, golesVisitante.get(jugador) + 1);
            }else{
                golesVisitante.put(jugador, 1);
            }
            if(asistenciasVisitante.containsKey(asistencia)){
                asistenciasVisitante.put(jugador,asistenciasVisitante.get(jugador) + 1);
            }else{
                asistenciasVisitante.put(jugador, 1);
            }
            if(intentosVisitante.containsKey(jugador)){
                intentosVisitante.put(jugador, intentosVisitante.get(jugador) + 1);
            }else{
                intentosVisitante.put(jugador, 1);
            }
        }
    }
    public void intento(EquipoFutbol e, JugadorCampo jugador){
        if(e.equals(local)){
            if(intentosLocal.containsKey(jugador)){
                intentosLocal.put(jugador, intentosLocal.get(jugador) + 1);
            }else{
                intentosLocal.put(jugador, 1);
            }
        }else{
            if(intentosVisitante.containsKey(jugador)){
                intentosVisitante.put(jugador, intentosVisitante.get(jugador) + 1);
            }else{
                intentosVisitante.put(jugador, 1);
            }
        }
    }
}
