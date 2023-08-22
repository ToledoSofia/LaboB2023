package PASO;

import PASO.NombrePartido;
import personas.Candidato;

public class PartidoPASO {
    private NombrePartido nombre;
    private Candidato candidato;

    public PartidoPASO() {
        candidato = new Candidato();
    }

    public PartidoPASO(NombrePartido nombre, Candidato candidato) {
        this.nombre = nombre;
        this.candidato = candidato;
    }
}
