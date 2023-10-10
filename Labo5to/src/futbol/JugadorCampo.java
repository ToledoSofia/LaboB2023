package futbol;

import java.time.LocalDate;

public class JugadorCampo extends Jugador {

    private double porcentajeGoles;
    private int cantidadAsistencias;

    public JugadorCampo(String nombre) {
        super(nombre);
    }

    public JugadorCampo(String nombre, double porcentajeGoles, int cantidadAsistencias) {
        super(nombre);
        this.porcentajeGoles = porcentajeGoles;
        this.cantidadAsistencias = cantidadAsistencias;
    }

    public JugadorCampo(String nombre, EquipoFutbol actual, double porcentajeGoles, int cantidadAsistencias) {
        super(nombre, actual);
        this.porcentajeGoles = porcentajeGoles;
        this.cantidadAsistencias = cantidadAsistencias;
    }

    public JugadorCampo(String nombre, LocalDate fechaNacimiento, EquipoFutbol actual, double porcentajeGoles, int cantidadAsistencias) {
        super(nombre, fechaNacimiento, actual);
        this.porcentajeGoles = porcentajeGoles;
        this.cantidadAsistencias = cantidadAsistencias;
    }

    public double getPorcentajeGoles() {
        return porcentajeGoles;
    }

    public void setPorcentajeGoles(double porcentajeGoles) {
        this.porcentajeGoles = porcentajeGoles;
    }

    public int getCantidadAsistencias() {
        return cantidadAsistencias;
    }

    public void setCantidadAsistencias(int cantidadAsistencias) {
        this.cantidadAsistencias = cantidadAsistencias;
    }

    @Override
    public void Contratar(EquipoFutbol e) throws JugadorYaJugoEnElClubException, NoSePuedeContratarAlJugadorException {
        if(getHistorial().contains(e)){
            throw new JugadorYaJugoEnElClubException("El jugador ya jugo en este club");
        }
        if(!(porcentajeGoles > 30 && cantidadAsistencias > 10)){
            throw new NoSePuedeContratarAlJugadorException("No se puede contratar al jugador");
        }
        setActual(e);
        e.agregarJugador(this);
        getHistorial().add(e);
        System.out.println("El " + getNombre() + "se contrató en el " + e.getNombre());


    }
    public void porcentajeGoles(){
        int total = 0;
        int goles = 0;
        for(PartidoFutbol p : getPartidos()){
            if(getActual().equals(p.getLocal()) ){
                if(p.getIntentosLocal().containsKey(this) && p.getGolesLocal().containsKey(this)){
                    total += p.getIntentosLocal().get(this);
                    goles += p.getGolesLocal().get(this);
                }
            }else{
                if(p.getIntentosVisitante().containsKey(this) && p.getGolesVisitante().containsKey(this)){
                    total += p.getIntentosVisitante().get(this);
                    goles += p.getGolesVisitante().get(this);
                }
            }
        }
        if(total>0){
            porcentajeGoles = goles*100/total;
        }else{
            porcentajeGoles = 0;
        }
    }
    public void asistencias(){
        int asist = 0;
        for(PartidoFutbol p : getPartidos()){
            if(getActual().equals(p.getLocal()) && p.getAsistenciasLocal().containsKey(this)){
                asist += p.getAsistenciasLocal().get(this);
            }else{
                if(p.getGolesVisitante().containsKey(this)){
                    asist += p.getAsistenciasVisitante().get(this);
                }
            }
        }
        cantidadAsistencias = asist;
    }

    /*@Override
    public void Renovar(EquipoFutbol e) throws NoFormaParteDelClubException, MayorA35Exception {
        if(!getActual().equals(e)){
            throw new NoFormaParteDelClubException("El jugador no forma parte de este club");
        }
        if(getFechaNacimiento().getYear() - LocalDate.now().getYear() >= 35){ // no esta del todo_bien pero bueno
            throw new MayorA35Exception("El jugador es mayor a 35 años");
        }
        System.out.println("El " + getNombre() + " se renovo en " + e.getNombre());
    }*/
}
