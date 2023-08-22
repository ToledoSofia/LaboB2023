package personas;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import PASO.*;
public class Candidato extends Persona{
    private int dni;
    private Date fechaNacimiento;
    private NombrePartido partido;
    private HashMap<String, HashSet<String>> propuestas;
    private HashMap<String, Integer>votosProvincias;

    public Candidato() {
        super();
        propuestas = new HashMap<String, HashSet<String>>();
        votosProvincias = new HashMap<String, Integer>();
        fechaNacimiento = new Date();
    }

    public Candidato(String nombre, NombrePartido partido) {
        super(nombre);
        this.partido = partido;
        propuestas = new HashMap<String, HashSet<String>>();
        votosProvincias = new HashMap<String, Integer>();
    }

    public Candidato(String nombre, Date fechaNacimiento, NombrePartido partido) {
        super(nombre);
        this.fechaNacimiento = fechaNacimiento;
        this.partido = partido;
        propuestas = new HashMap<String, HashSet<String>>();
        votosProvincias = new HashMap<String, Integer>();
    }

    public Candidato(String nombre, int dni, Date fechaNacimiento, NombrePartido partido, HashMap<String, HashSet<String>> propuestas) {
        super(nombre);
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.partido = partido;
        this.propuestas = propuestas;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public NombrePartido getPartido() {
        return partido;
    }

    public void setPartido(NombrePartido partido) {
        this.partido = partido;
    }

    public HashMap<String, HashSet<String>> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(HashMap<String, HashSet<String>> propuestas) {
        this.propuestas = propuestas;
    }

    public HashMap<String, Integer> getVotosProvincias() {
        return votosProvincias;
    }

    public void setVotosProvincias(HashMap<String, Integer> votosProvincias) {
        this.votosProvincias = votosProvincias;
    }

    public void agregarVoto(String provincia){
        if(!votosProvincias.containsKey(provincia)){
            votosProvincias.put(provincia, 1);
        }else{
            votosProvincias.put(provincia,votosProvincias.get(provincia)+1);
        }
    }

    @Override
    public void mostrarDatos() {

    }
}
