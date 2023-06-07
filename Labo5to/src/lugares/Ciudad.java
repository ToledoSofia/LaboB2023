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
    public void agregarBarrio(Barrio b1){
        barrios.add(b1);
    }
    public void eliminarBarrio(Barrio b1){
        if(barrios.contains(b1)){
            barrios.remove(b1);
        }
    }
    public void modificarBarrio(Barrio modificar, Barrio nuevo){
        if(barrios.contains(modificar)){
            barrios.remove(modificar);
            barrios.add(nuevo);
        }
    }
}
