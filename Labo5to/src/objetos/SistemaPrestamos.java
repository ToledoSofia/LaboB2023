package objetos;

import java.util.HashSet;

public class SistemaPrestamos{
    private HashSet<Objeto>objetos;

    public SistemaPrestamos() {
        objetos = new HashSet<>();
    }
    public SistemaPrestamos(HashSet<Objeto> objetos) {
        this.objetos = objetos;
    }
    public void prestar(Objeto o) {
        if(o.prestar() && objetos.contains(o)){
            objetos.remove(o);
        }
    }
    public void agregarElemento(Objeto o) {
        if(o.agregarElemento()){
            objetos.add(o);
        }
    }
}
