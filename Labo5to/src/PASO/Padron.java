package PASO;

import personas.Candidato;
import personas.Votante;

import java.util.HashMap;
import java.util.HashSet;

public class Padron {
    private HashSet<Votante> poblacion;
    private HashSet<Votante> padron;
    private HashSet<Candidato>candidatos;

    public Padron() {
        poblacion = new HashSet<Votante>();
        padron = new HashSet<Votante>();
        candidatos = new HashSet<Candidato>();
    }

    public Padron(HashSet<Votante> poblacion, HashSet<Candidato> candidatos) {
        this.poblacion = poblacion;
        this.candidatos = candidatos;
        this.padron = armarPadron();
    }

    public Padron(HashSet<Votante> poblacion) {
        this.poblacion = poblacion;
        this.padron = armarPadron();
        candidatos = new HashSet<Candidato>();
    }

    public HashSet<Votante> getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(HashSet<Votante> poblacion) {
        this.poblacion = poblacion;
    }

    public HashSet<Votante> getPadron() {
        return padron;
    }

    public void setPadron(HashSet<Votante> padron) {
        this.padron = padron;
    }
    public HashSet<Votante>armarPadron(){
        HashSet<Votante>votantes = new HashSet<Votante>();
        for(Votante v : poblacion){
            if(v.getNacionalidad().equals("Argentina")){
                votantes.add(v);
            }
        }
        return votantes;
    }
    public void agregarCandidato(Candidato c){
        candidatos.add(c);
    }
    public void votar(Votante votante, Candidato candidato){
        if(padron.contains(votante) && !votante.isYaVoto()){
                candidato.agregarVoto(votante.getProvincia());
                candidatos.add(candidato);
                votante.setYaVoto(true);
        }else{
            System.out.println("No puede votar :)");
        }
    }
    public HashMap<Candidato, Integer> contarTotalCandidato(){
        HashMap<Candidato, Integer> votos = new HashMap<>();
        int voto;
        for(Candidato c : candidatos){
            voto = 0;
            for(String prov : c.getVotosProvincias().keySet()){
                voto += c.getVotosProvincias().get(prov);
                votos.put(c,voto);
            }
        }
        return votos;
    }
    public int totalVotos(){
        int cantidad = 0;
        for(Votante v : padron){
            if(v.isYaVoto()){
                cantidad ++;
            }
        }
        return cantidad;
    }
    public void ganador(HashMap<Candidato, Integer>resultados){
        int mayorCantidad = 0, cantidad;
        Candidato ganador = new Candidato();
        for(Candidato c : resultados.keySet()){
            cantidad = resultados.get(c);
            if(cantidad > mayorCantidad){
                mayorCantidad = cantidad;
                ganador = c;
            }
        }
        System.out.println("GANADOR: " + ganador.getNombre() + ", " + ganador.getPartido());
    }
    public int noVotaron(){
        return 100-(totalVotos()*100/padron.size());
    }
    public void mostrarTotalCandidatos(){
        HashMap<Candidato, Integer>resultados = contarTotalCandidato();
        ganador(resultados);
        for(Candidato c :resultados.keySet()){
            System.out.println("\nCANDIDATO: " + c.getNombre());
            System.out.println("Partido: " + c.getPartido());
            System.out.println("Votos: " + resultados.get(c));
            System.out.println("Procentaje: " + (resultados.get(c)*100/totalVotos()));
        }
    }

    public void votosPorProvincia(){
        for(Candidato c : candidatos){
            System.out.println("CANDIDATO: " + c.getNombre());
            System.out.println("PARTIDO: " + c.getPartido());
            for(String prov : c.getVotosProvincias().keySet()){
                System.out.println("----Provincia: " + prov);
                System.out.println("----Votos: " + c.getVotosProvincias().get(prov));
            }
        }
    }
}