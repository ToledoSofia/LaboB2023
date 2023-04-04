import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<Double>notas;

    public Materia(){
        nombre = "";
        notas = new ArrayList<Double>();
    }
    public Materia(String nombre, ArrayList<Double>notas){
        this.nombre = nombre;
        this.notas = notas;
        validarNotas();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    public void validarNotas(){//notas del 0 al 10
        for(int i = 0; i<notas.size(); i++){
            if(notas.get(i)<0 || notas.get(i)>10){
                notas.set(i,1.0);
            }
        }
    }
    public void agregarNota(double nota){
        notas.add(nota);
    }
    public double menorNota(){//pasar alumno
        double menor = 10;
        for(Double nota : notas){
            if(nota<menor){
                menor = nota;
            }
        }
        return menor;
    }
    public double mayorNota(){//pasar alumno
        double mayor = 0;
        for(Double nota : notas){
            if(nota>mayor){
                mayor = nota;
            }
        }
        return mayor;
    }
    public Double promedioMateria(){
        double promedio = 0.0;
        for(Double nota : notas){
            promedio += nota;
        }
        return promedio/notas.size();
    }
}
