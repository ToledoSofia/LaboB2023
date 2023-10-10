package futbol;

public interface Contrato {
    void Contratar(EquipoFutbol e) throws JugadorYaJugoEnElClubException, NoSePuedeContratarAlJugadorException;
    void Renovar(EquipoFutbol e) throws NoFormaParteDelClubException, MayorA35Exception;
}
