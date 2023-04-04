import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fecha;
    //private ArrayList<Double>notas;
    private ArrayList<Materia>materias;
    public Alumno(){
        nombre = "";
        apellido =  "";
        fecha = new Fecha();
        //notas = new ArrayList<Double>();
        materias = new ArrayList<Materia>();
    }
    public Alumno(String nombre, String apellido,ArrayList<Materia>materias){
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = materias;
    }
    public Alumno(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = new ArrayList<Materia>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia>materias) {
        this.materias = materias;
    }

    public void agregarMateria(Materia m1){
        materias.add(m1);
    }
    public Double promedioAlumno(){
        Double promedio = 0.0;
        int cantidadNotas = 0;
        for(Materia materia : materias){
            cantidadNotas += materia.getNotas().size();//suma la cantidad de notas por materia
            for(Double nota : materia.getNotas()){
                promedio += nota;
            }
        }
        return promedio/cantidadNotas;
    }
}
