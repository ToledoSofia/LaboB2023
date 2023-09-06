package bibliotecaVirtual;

public enum Membresia {
    BRONCE(5), PLATA(15), ORO(50);

    private int cantidadLibros;

    private Membresia(int cantidadLibros){
        this.cantidadLibros  = cantidadLibros;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }
}
