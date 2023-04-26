package productos;

public class CargadorPortatil extends Cargador{
    private int cantidadCargas;
    public CargadorPortatil(){
        super();
        cantidadCargas = 3;
    }
    public CargadorPortatil(int cantidadCargas){
        this.cantidadCargas = cantidadCargas;
    }

    public int getCantidadCargas() {
        return cantidadCargas;
    }

    public void setCantidadCargas(int cantidadCargas) {
        this.cantidadCargas = cantidadCargas;
    }
}
