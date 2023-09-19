package centroEducativo;

public class ExamenEscrito extends Examen implements AprobarExamen {
    private int duracion;
    private double nota;

    public ExamenEscrito(int duracion, double nota) {
        super();
        this.duracion = duracion;
        this.nota = nota;
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

    @Override
    public boolean Aprobado() {
        if(nota >= 6 && duracion < 90){
            return true;
        }else{
            return false;
        }
    }

}
