package lugares;

import java.util.HashSet;

public class Pais extends Lugar{
    private HashSet<Provincia>provincias;
    public Pais(){
        super("provx",4444);
        provincias = new HashSet<Provincia>();
    }

    public Pais(String nombre, int codigo) {
        super(nombre, codigo);
        provincias = new HashSet<Provincia>();
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }
    public int calcularPoblacion(){
        int poblacion = 0;
        for(Provincia provincia : provincias){
            poblacion += provincia.calcularPoblacion();
        }
        return poblacion;
    }
    public void agregarProvincia(Provincia p1){
        provincias.add(p1);
    }
    public void eliminarProvincia(Provincia p1){
        if(provincias.contains(p1)){
            provincias.remove(p1);
        }
    }
    public void modificarProvincia(Provincia modificar, Provincia nuevo){
        if(provincias.contains(modificar)){
            provincias.remove(modificar);
            provincias.add(nuevo);
        }
    }
}
