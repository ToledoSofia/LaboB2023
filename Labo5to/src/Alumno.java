import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fecha;
    private ArrayList<Double>notas;
    public Alumno(){
        nombre = "";
        apellido =  "";
        fecha = new Fecha();
        notas = new ArrayList<Double>();
    }
    public Alumno(String nombre, String apellido,ArrayList<Double>notas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
        validarNotas();
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

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    public void validarNotas(){
        for(int i = 0; i<notas.size(); i++){
            if(notas.get(i)<0){
                notas.set(i,1.0);
            }
        }
    }
    public void agregarNota(double nota){
        notas.add(nota);
    }
    public double menorNota(){
        double menor = notas.get(0);
        for(Double nota : notas){
            if(nota<menor){
                menor = nota;
            }
        }
        return menor;
    }
    public double mayorNota(){
        double mayor = notas.get(0);
        for(Double nota : notas){
            if(nota>mayor){
                mayor = nota;
            }
        }
        return mayor;
    }
}
