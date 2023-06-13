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

    public void calcularPoblacion(int codigo){
        int poblacion = 0;
        for(Lugar l1 : lugares){
            if(l1.getCodigo() == codigo){
                poblacion = l1.calcularPoblacion();
            }
        }
        if(poblacion == 0){
            System.out.println("---No existe un lugar con ese codigo---");
        }else{
            System.out.println("poblacion: " + poblacion);
        }
    }

    public void agregarLugar(Lugar l1){
       lugares.add(l1);
    }
    public void eliminarLugar(Lugar l1){// estaria faltando que lo borre de la ciudad o provincia o pais o continente
        // y borrar obsolutamente tod o lo que estaba en el hashset que antes estaba en el continente o pais o provincia o ciudad.

        if(lugares.contains(l1)){
            lugares.remove(l1);
        }
    }
    public void modificarLugar(Lugar modificar, Lugar nuevo){// lo mismo que antes pero modificandolo
        if(lugares.contains(modificar)){
            lugares.remove(modificar);
            lugares.add(nuevo);
        }
    }

   /* public int calcularPoblacion(int codigoLugar){ // no lo quiero borrar
        int poblacion = 0;
        for(Continente c : continentes){
            if(c.getCodigo() == codigoLugar){
                poblacion = c.calcularPoblacion();
            }else {
                for (Pais p : c.getPaises()) {
                    if (p.getCodigo() == codigoLugar) {
                        poblacion = p.calcularPoblacion();
                    }else{
                        for (Provincia prov : p.getProvincias()) {
                            if (prov.getCodigo() == codigoLugar) {
                                poblacion = prov.calcularPoblacion();
                            }else{
                                for (Ciudad ciudad : prov.getCiudades()) {
                                    if (ciudad.getCodigo() == codigoLugar) {
                                        poblacion = ciudad.calcularPoblacion();
                                    }else{
                                        for (Barrio b : ciudad.getBarrios()) {
                                            if (b.getCodigo() == codigoLugar) {
                                                poblacion = b.calcularPoblacion();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return poblacion;
    }*/
    public Pais paisMayorPoblacion(){
        int mayor = 0;
        Pais pMayor = new Pais();
        for(Lugar l : lugares){
            if(l instanceof Pais && ((Pais) l).calcularPoblacion()>mayor){
                pMayor = ((Pais) l);
                mayor = ((Pais) l).calcularPoblacion();
            }
        }
        return pMayor;
    }
    public Pais paisMenorPoblacion(){
        int menor = -2;
        Pais pMenor = new Pais();
        if(menor < 0){
            for(Lugar l : lugares){
                if(l instanceof Pais){
                    pMenor = ((Pais) l);
                    menor = pMenor.calcularPoblacion();
                }
            }
        }else{
            for(Lugar l : lugares){
                if(l instanceof Pais && ((Pais) l).calcularPoblacion()<menor){
                    pMenor = ((Pais) l);
                    menor = pMenor.calcularPoblacion();
                }
            }
        }
        return pMenor;

    }
    public Continente continenteMasPoblado(){
        int mayor = 0;
        Continente cMayor = new Continente();
        for(Lugar l : lugares){
            if(l instanceof Continente && ((Continente) l).calcularPoblacion()>mayor){
                cMayor = ((Continente) l);
                mayor = cMayor.calcularPoblacion();
            }
        }
        return cMayor;
    }
    public Continente continenteMenosPoblado(){
        int menor = -2;
        Continente cMenor = new Continente();
        if(menor < 0){
            for(Lugar l : lugares){
                if(l instanceof Continente){
                    cMenor = ((Continente) l);
                    menor = cMenor.calcularPoblacion();
                }
            }
        }else{
            for(Lugar l : lugares){
                if(l instanceof Continente && ((Continente) l).calcularPoblacion()<menor){
                    cMenor = ((Continente) l);
                    menor = cMenor.calcularPoblacion();
                }
            }
        }
        return cMenor;
    }
}
