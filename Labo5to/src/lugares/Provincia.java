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
    public int calcularPoblacion(){
        int poblacion = 0;
        for(Ciudad ciudad : ciudades){
            poblacion += ciudad.calcularPoblacion();
        }
        return poblacion;
    }
}
