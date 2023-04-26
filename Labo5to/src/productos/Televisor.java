package productos;

public class Televisor extends Multimedia{
    private String tecnologia;
    private int resolucion;
    public Televisor(){
        super();
        tecnologia = "4K";
        resolucion = 0;
    }

    public Televisor(String tecnologia, int resolucion) {
        super();
        this.tecnologia = tecnologia;
        this.resolucion = resolucion;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
}
