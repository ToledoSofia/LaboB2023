package lugares;

import java.util.HashSet;

public class Provincia extends Lugar{
    private HashSet<Ciudad>ciudades;
    public Provincia(){
        super("px",3333);
        ciudades = new HashSet<Ciudad>();
    }

    public Provincia(String nombre, int codigo) {
        super(nombre, codigo);
        ciudades = new HashSet<Ciudad>();
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    @Override
    public int calcularPoblacion(){
        int poblacion = 0;
        for(Ciudad ciudad : ciudades){
            poblacion += ciudad.calcularPoblacion();
        }
        return poblacion;
    }
    public void agregarCiudad(Ciudad c1){
        ciudades.add(c1);
    }
    public void eliminarCiudad(Ciudad c1){
        if(ciudades.contains(c1)){
            ciudades.remove(c1);
        }
    }
    public void modificarCiudad(Ciudad modificar, Ciudad nuevo){
        if(ciudades.contains(modificar)){
            ciudades.remove(modificar);
            ciudades.add(nuevo);
        }
    }
}
