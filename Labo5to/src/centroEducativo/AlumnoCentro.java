package centroEducativo;

import personas.Persona;

import java.util.HashSet;

public class AlumnoCentro extends Persona  implements AprobarExamen{
    private HashSet<Examen>examenes;

    public AlumnoCentro() {
        super();
        examenes = new HashSet<>();
    }

    public AlumnoCentro(String nombre) {
        super(nombre);
        examenes = new HashSet<>();
    }

    public AlumnoCentro(String nombre, HashSet<Examen> examenes) {
        super(nombre);
        this.examenes = examenes;
    }

    public HashSet<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(HashSet<Examen> examenes) {
        this.examenes = examenes;
    }
    public void agregarExamen(Examen e){
        examenes.add(e);
    }

    @Override
    public boolean Aprobado() {
        boolean aprobado = true;
        for(Examen e : examenes){
            if(!e.Aprobado()){
                aprobado = false;
            }
        }
        return aprobado;
    }

    @Override
    public void mostrarDatos() {

    }
}
