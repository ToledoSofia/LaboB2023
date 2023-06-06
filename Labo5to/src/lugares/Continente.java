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
    public int calcularPoblacion(){
        int poblacion = 0;
        for(Pais pais : paises){
            poblacion += pais.calcularPoblacion();
        }
        return poblacion;
    }
    //ABM paises, calcularPoblacion()
}
