package componentes;

public class Periferico extends Componente{
    private boolean entradaSalida;//0.salida 1.entrada
    public Periferico(){
        super();
        entradaSalida = true;
    }

    public Periferico(boolean entradaSalida) {
        super();
        this.entradaSalida = entradaSalida;
    }

    public boolean isEntradaSalida() {
        return entradaSalida;
    }

    public void setEntradaSalida(boolean entradaSalida) {
        this.entradaSalida = entradaSalida;
    }
}
