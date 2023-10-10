package futbol;

import java.time.LocalDate;

public class Arquero extends Jugador implements Contrato{
    private double porcentajeAtajada;
    private int cantidadGoles;

    public Arquero(String nombre) {
        super(nombre);

    }

    public Arquero(String nombre, double porcentajeAtajada, int cantidadGoles) {
        super(nombre);
        this.porcentajeAtajada = porcentajeAtajada;
        this.cantidadGoles = cantidadGoles;
    }

    public Arquero(String nombre, EquipoFutbol actual, double porcentajeAtajada, int cantidadGoles) {
        super(nombre, actual);
        this.porcentajeAtajada = porcentajeAtajada;
        this.cantidadGoles = cantidadGoles;
    }

    public Arquero(String nombre, LocalDate fechaNacimiento, EquipoFutbol actual, double porcentajeAtajada, int cantidadGoles) {
        super(nombre, fechaNacimiento, actual);
        this.porcentajeAtajada = porcentajeAtajada;
        this.cantidadGoles = cantidadGoles;
    }

    public double getPorcentajeAtajada() {
        return porcentajeAtajada;
    }

    public void setPorcentajeAtajada(double porcentajeAtajada) {
        this.porcentajeAtajada = porcentajeAtajada;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }


    @Override
    public void Contratar(EquipoFutbol e) throws JugadorYaJugoEnElClubException, NoSePuedeContratarAlJugadorException {
        if(getHistorial().contains(e)){
            throw new JugadorYaJugoEnElClubException("El jugador ya jugo en este club");
        }
        if(!(porcentajeAtajada > 60 && cantidadGoles < 10)){
            throw new NoSePuedeContratarAlJugadorException("No se puede contratar al arquero");
        }
        setActual(e);
        e.agregarJugador(this);
        getHistorial().add(e);
        System.out.println("El " + getNombre() + "se contrató en el " + e.getNombre());

    }
    public void porcentajeAtajadas(){
        int total = 0;
        int goles = 0;
        for(PartidoFutbol p : getPartidos()){
            if(getActual() != null && getActual().equals(p.getLocal())){
                for(int i : p.getIntentosVisitante().values()){
                    total += i;
                }
                for(int i : p.getGolesVisitante().values()){
                    goles += i;
                }
            }else{
                for(int i : p.getIntentosLocal().values()){
                    total += i;
                }
                for(int i : p.getGolesLocal().values()){
                    goles += i;
                }
            }
        }
        cantidadGoles = goles;
        porcentajeAtajada = (total-goles) * 100 / total;
    }
}
