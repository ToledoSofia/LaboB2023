package personas;
import tiempo1.Fecha;
import materias.Materia;
import java.util.ArrayList;

public class Alumno extends Persona {
    //private String nombre;
    //private String apellido;
    private Fecha fecha;
    //private ArrayList<Double>notas;
    private ArrayList<Materia>materias;
    private String division;
    public Alumno(){
        super();
        //nombre = "";
        fecha = new Fecha();
        //notas = new ArrayList<Double>();
        materias = new ArrayList<Materia>();
        division = "";
    }
    public Alumno(String nombre,int edad, String direccion, String apellido,ArrayList<Materia>materias){
        super(nombre, edad, direccion, apellido);
        //this.nombre = nombre;
        this.materias = materias;
    }
    public Alumno(String nombre, String apellido){
        //this.nombre = nombre;
        //this.apellido = apellido;
        super(nombre, apellido);
        this.materias = new ArrayList<Materia>();
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
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

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
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
