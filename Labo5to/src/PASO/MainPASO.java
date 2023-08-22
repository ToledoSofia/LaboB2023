package PASO;

import personas.Candidato;
import personas.Votante;

import java.util.HashSet;

public class MainPASO {
    public static void main(String[] args) {
        Candidato c1 = new Candidato("c1", NombrePartido.FRENTE_DE_CONSTITUYENTES);
        Candidato c2 = new Candidato("c2", NombrePartido.EL_POLI_AVANZA);
        Candidato c3 = new Candidato("c3", NombrePartido.JUNTOS_POR_EL_POLI);
        Candidato c4 = new Candidato("c4", NombrePartido.UNION_POR_LA_DOCENCIA);

        PartidoPASO frenteDeConstituyentes = new PartidoPASO(NombrePartido.FRENTE_DE_CONSTITUYENTES, c1);
        PartidoPASO elPoliAvanza = new PartidoPASO(NombrePartido.EL_POLI_AVANZA, c2);
        PartidoPASO juntosPorElPoli = new PartidoPASO(NombrePartido.JUNTOS_POR_EL_POLI, c3);
        PartidoPASO unionPorLaDocencia = new PartidoPASO(NombrePartido.UNION_POR_LA_DOCENCIA, c4);

        Votante v1 = new Votante("v1", "Argentina", "La Pampa");
        Votante v2 = new Votante("v2", "Argentina", "Buenos Aires");
        Votante v3 = new Votante("v3", "Argentina", "La Pampa");
        Votante v4 = new Votante("v4", "Argentina", "La Pampa");
        Votante v5 = new Votante("v5", "Italiana", "Chaco");
        Votante v6 = new Votante("v6", "Argentina", "Buenos Aires");
        Votante v7 = new Votante("v7", "Argentina", "Buenos Aires");
        Votante v8 = new Votante("v8", "Argentina", "La Pampa");
        Votante v9 = new Votante("v9", "Argentina", "Rio Negro");
        Votante v10 = new Votante("v10", "Argentina", "Chubut");
        Votante v11 = new Votante("v11", "Argentina", "Chubut");
        Votante v12 = new Votante("v12", "Argentina", "La Pampa");

        HashSet<Votante>poblacion = new HashSet<Votante>();
        poblacion.add(v1);
        poblacion.add(v2);
        poblacion.add(v3);
        poblacion.add(v4);
        poblacion.add(v5);
        poblacion.add(v6);
        poblacion.add(v7);
        poblacion.add(v8);
        poblacion.add(v9);
        poblacion.add(v10);
        poblacion.add(v11);
        poblacion.add(v12);

        HashSet<Candidato>candidatos = new HashSet<Candidato>();
        candidatos.add(c1);
        candidatos.add(c2);
        candidatos.add(c3);
        candidatos.add(c4);
        Padron sistema = new Padron(poblacion, candidatos);

      /*  for(Votante v : sistema.getPadron()){
            System.out.println(v.getNombre());
        }*/

        //5 y 12 no votan
        sistema.votar(v1, c1);
        sistema.votar(v1, c1);//no puede
        sistema.votar(v5, c1);//no puede
        sistema.votar(v2, c2);
        sistema.votar(v3, c3);
        sistema.votar(v4, c4);
        sistema.votar(v6, c4);
        sistema.votar(v7, c4);
        sistema.votar(v8, c4);
        sistema.votar(v9, c4);
        sistema.votar(v10, c2);
        sistema.votar(v11, c4);
        //c1 - la pampa1
        //c2 - bsas, chubut
        //c3 - laPampa
        //c4 - lapampa2, bsas2, rio negro, chubut

        sistema.mostrarTotalCandidatos();
        sistema.votosPorProvincia();
        System.out.println("Porcentaje que no votó " + sistema.noVotaron() + "%");
    }
}
