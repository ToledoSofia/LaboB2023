package centroEducativo;

public class ExamenOral extends Examen  {
    private Satisfaccion satisfaccion;

    public ExamenOral(Satisfaccion satisfaccion) {
        this.satisfaccion = satisfaccion;
    }

    public Satisfaccion getSatisfaccion() {
        return satisfaccion;
    }

    public void setSatisfaccion(Satisfaccion satisfaccion) {
        this.satisfaccion = satisfaccion;
    }

    @Override
    public boolean Aprobado() {
        if(satisfaccion.equals(Satisfaccion.SUFICIENTE) || satisfaccion.equals(Satisfaccion.EXCELENTE)){
            return true;
        }else{
            return false;
        }
    }
}
