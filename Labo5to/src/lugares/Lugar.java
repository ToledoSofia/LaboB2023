package lugares;

import java.util.ArrayList;
import java.util.HashSet;

public class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<Coordenadas> coordenadas;

    public Lugar(){
        coordenadas = new HashSet<Coordenadas>();
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
        coordenadas = new HashSet<Coordenadas>();
    }

    public Lugar(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<Coordenadas> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(HashSet<Coordenadas> coordenadas) {
        this.coordenadas = coordenadas;
    }

    public int calcularPoblacion(){
        return 1;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", codigo=" + codigo;
    }
}
//for(Masp.Entry<clave, valor> entrada: nombreHashmap.entrySet())
//entrada.getKey();
//entrada.getValue();
