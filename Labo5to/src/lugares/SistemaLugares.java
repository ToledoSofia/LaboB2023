package lugares;

import java.util.HashSet;

public class SistemaLugares {
    HashSet<Lugar> lugares;
    public SistemaLugares(){
        lugares = new HashSet<Lugar>();
    }

    public SistemaLugares(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }

    public HashSet<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }

    public void agregarLugar(Lugar l1){
        //lugares.add(l1);
    }
    public void eliminarLugar(Lugar l1){
        // if(lugares.contains(l1){ lugares.remove(l1); }
    }
    public void  modificarLugar(Lugar modificar, Lugar nuevo){
        //if(lugares.contains(modificar){
        // lugares.remove(modificar);
        // lugares.add(nuevo); }
    }
    public void calcularPoblacion(int codigoLugar){

    }
}
