package lugares;

import java.util.HashSet;

public class Ciudad extends Lugar{
    HashSet<Barrio>barrios;
    public Ciudad(){
        super("cx",2222);
        barrios = new HashSet<Barrio>();
    }

    public Ciudad(String nombre, int codigo) {
        super(nombre, codigo);
        barrios = new HashSet<Barrio>();
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }
    public int calcularPoblacion(){
        int poblacion = 0;
        for(Barrio barrio : barrios){
            poblacion+=barrio.calcularPoblacion();
        }
        return poblacion;
    }
}
