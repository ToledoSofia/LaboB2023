package futbol;

import java.time.LocalDate;
import java.util.HashSet;

public abstract class Jugador implements Contrato {
    private String nombre;
    private LocalDate fechaNacimiento;
    private int posicion;
    private Provincia provincia;
    private EquipoFutbol actual;
    private HashSet<EquipoFutbol> historial;
    private int numCamiseta;
    private HashSet<PartidoFutbol>partidos;

    public Jugador() {
        historial = new HashSet<>();
        fechaNacimiento = LocalDate.now();
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
        historial = new HashSet<>();
        fechaNacimiento = LocalDate.now();
        partidos = new HashSet<>();
        actual = null;
    }

    public Jugador(String nombre, EquipoFutbol actual) {
        this.nombre = nombre;
        this.actual = actual;
        historial = new HashSet<>();
        partidos = new HashSet<>();
    }

    public Jugador(String nombre, LocalDate fechaNacimiento, EquipoFutbol actual) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.actual = actual;
        historial = new HashSet<>();
        partidos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public HashSet<EquipoFutbol> getHistorial() {
        return historial;
    }

    public void setHistorial(HashSet<EquipoFutbol> historial) {
        this.historial = historial;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public EquipoFutbol getActual() {
        return actual;
    }

    public void setActual(EquipoFutbol actual) {
        this.actual = actual;
    }

    public HashSet<PartidoFutbol> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<PartidoFutbol> partidos) {
        this.partidos = partidos;
    }

    @Override
    public void Renovar(EquipoFutbol e) throws NoFormaParteDelClubException, MayorA35Exception {
        if(!getActual().equals(e)){
            throw new NoFormaParteDelClubException("El jugador no forma parte de este club");
        }
        if(LocalDate.now().getYear() - getFechaNacimiento().getYear() >= 35){ // no esta del todo_bien pero bueno
            actual = null;
            e.eliminarJugador(this);
            throw new MayorA35Exception("El jugador es mayor a 35 años");
        }
        System.out.println("El " + getNombre() + " se renovo en " + e.getNombre());
    }
    public void agregarPartido(PartidoFutbol partido){
        partidos.add(partido);
    }
}
