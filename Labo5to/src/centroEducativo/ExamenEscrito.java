package centroEducativo;

public class ExamenEscrito extends Examen {
    private int duracion;
    private double nota;

    public ExamenEscrito(int duracion, double nota) {
        super();
        this.duracion = duracion;
        this.nota = nota;
        comprobarNota();
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public void comprobarNota(){
        if(nota>10 || nota<0){
            nota = 1;
        }
    }

    @Override
    public boolean Aprobado() {
        if(nota >= 6 && duracion < 90){
            return true;
        }else{
            return false;
        }
    }

}
