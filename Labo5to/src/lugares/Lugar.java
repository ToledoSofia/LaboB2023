package lugares;

import java.util.ArrayList;

public class Lugar {
    private String nombre;
    private int codigo;
    private ArrayList<String>coordenadas;

    public Lugar(){
        coordenadas = new ArrayList<String>();
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
        coordenadas = new ArrayList<String>();
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

    public ArrayList<String> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(ArrayList<String> coordenadas) {
        this.coordenadas = coordenadas;
    }

}
//for(Masp.Entry<clave, valor> entrada: nombreHashmap.entrySet())
//entrada.getKey();
//entrada.getValue();
