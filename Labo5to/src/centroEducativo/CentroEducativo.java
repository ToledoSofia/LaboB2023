package centroEducativo;

import java.util.HashSet;

public class CentroEducativo {
    private HashSet<AlumnoCentro>alumnos;

    public CentroEducativo() {
        alumnos = new HashSet<>();
    }
    public CentroEducativo(HashSet<AlumnoCentro> alumnos) {
        this.alumnos = alumnos;
    }

    public HashSet<AlumnoCentro> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<AlumnoCentro> alumnos) {
        this.alumnos = alumnos;
    }

    public int cantAprobados(){
        int cantidad = 0;
        for(AlumnoCentro a : alumnos){
            if(a.Aprobado()){
                cantidad ++;
            }
        }
        return cantidad;
    }
}
