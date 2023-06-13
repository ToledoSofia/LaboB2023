package lugares;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais>paises;
    public Continente(){
        super("cx",5555);
        paises = new HashSet<Pais>();
    }

    public Continente(String nombre, int codigo) {
        super(nombre, codigo);
        paises = new HashSet<Pais>();
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }
    @Override
    public int calcularPoblacion(){
        int poblacion = 0;
        for(Pais pais : paises){
            poblacion += pais.calcularPoblacion();
        }
        return poblacion;
    }
    public void agregarPais(Pais p1){
        paises.add(p1);
    }
    public void eliminarPais(Pais p1){
        if(paises.contains(p1)){
            paises.remove(p1);
        }
    }
    public void modificarPais(Pais modificar, Pais nuevo){
        if(paises.contains(modificar)){
            paises.remove(modificar);
            paises.add(nuevo);
        }
    }

}
