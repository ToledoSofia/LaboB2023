package campañas;

import java.util.HashSet;

public class PartidoPolitico {
    private String nombre;
    private String direccionOficina;
    private int cantidadAfiliados;
    private HashSet<Mensajero>enviadores;

    public PartidoPolitico() {
        enviadores = new HashSet<>();
    }

    public PartidoPolitico(String nombre) {
        this.nombre = nombre;
        enviadores = new HashSet<>();
    }

    public PartidoPolitico(String nombre, String direccionOficina, int cantidadAfiliados, HashSet<Mensajero> enviadores) {
        this.nombre = nombre;
        this.direccionOficina = direccionOficina;
        this.cantidadAfiliados = cantidadAfiliados;
        this.enviadores = enviadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionOficina() {
        return direccionOficina;
    }

    public void setDireccionOficina(String direccionOficina) {
        this.direccionOficina = direccionOficina;
    }

    public int getCantidadAfiliados() {
        return cantidadAfiliados;
    }

    public void setCantidadAfiliados(int cantidadAfiliados) {
        this.cantidadAfiliados = cantidadAfiliados;
    }

    public HashSet<Mensajero> getEnviadores() {
        return enviadores;
    }

    public void setEnviadores(HashSet<Mensajero> enviadores) {
        this.enviadores = enviadores;
    }
    public void agregarMensajero(Mensajero mensajero){
        enviadores.add(mensajero);
    }
    public void hacerCampania(){
        for(Mensajero m :enviadores){
            m.enviarMensajeApoyo("Vote por " + nombre + " para un mejor futuro");
        }
    }
}
